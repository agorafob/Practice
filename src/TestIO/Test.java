package TestIO;

import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {

        try (FileReader fileReader = new FileReader("D:\\JavaPractice\\Practice\\src\\TestIO\\test.txt")) {
            char[] symbols = new char[80];
            while (fileReader.read(symbols)!=-1){
                int read = fileReader.read(symbols);
            }
            System.out.println(symbols);

        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
