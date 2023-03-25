package TestIO.Example;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.*;

public class AccountingUser {
    private static RandomAccessFile file;
    private static final Map<String, Integer> log = new HashMap<>();
    private static Scanner sc;
    private static String path;

    private static void start() throws IOException {
        System.out.println("Введите путь к файлу");
        sc = new Scanner(System.in);
        path = sc.nextLine();
        if (goodConnection()) file = new RandomAccessFile(path, "rw");
    }

    private static boolean goodConnection() throws IOException {
        boolean goodConnection = false;
        File test = new File(path);
        if (test.canRead()) {
            goodConnection = true;
        } else {
            System.out.println("Нет такого файла");
            start();
        }
        return goodConnection;
    }

    private static void readFile() throws IOException {
        file.seek(0);
        String s;
        while ((s = file.readLine()) != null) {
            String[] temp = s.split(":");
            log.put(temp[0], Integer.parseInt(temp[1]));
        }
    }

    private static void clearFile() throws IOException {
        PrintWriter writer = new PrintWriter(path);
        writer.print("");
        writer.close();
    }

    private static void model() {
        System.out.println("Введите имена пользователей, а затем 'stop'");
        String name;
        do {
            name = sc.nextLine();
            if (!name.equalsIgnoreCase("stop")) {
                if (log.containsKey(name)) {
                    int counter = log.get(name);
                    log.put(name, ++counter);
                } else {
                    log.put(name, 1);
                }
            }
        }
        while (!name.equalsIgnoreCase("stop"));
    }

    static void print() {
        System.out.println(Arrays.toString(log.entrySet().toArray()));
    }

    private static void write() throws IOException {
        int cursor = 0;
        Set<Map.Entry<String, Integer>> entries = log.entrySet();
        for (Map.Entry<String, Integer> line : entries) {
            String lineToWrite = line.getKey() + ":" + line.getValue().toString() + "\n";
            file.seek(cursor);
            file.writeBytes(lineToWrite + "\n");
            cursor += lineToWrite.length();
        }
    }

    private static void printFile() throws IOException {
        file.seek(0);
        String s;
        while ((s = file.readLine()) != null) {
            System.out.println(s);
        }
    }

    private static void closeResources() throws IOException {
        file.close();
        sc.close();
    }

    public static void run() throws IOException {
        start();
        readFile();
        clearFile();
        model();
        print();
        write();
        printFile();
        closeResources();
    }
}
