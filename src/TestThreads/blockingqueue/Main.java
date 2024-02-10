package TestThreads.blockingqueue;


import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    static BlockingQueue<User> blockingQueue = new ArrayBlockingQueue<>(5);

    public static void main(String[] args) {
        new Thread(new Creator()).start();

        for (int i = 0; i < 10; i++) {
            new Thread(new UserReader()).start();
        }
    }


    static class Creator implements Runnable {

        String[] names = {"alik", "lera", "una", "roza", "leva", "kapo", "anuki", "andria", "sandra", "vika"};

        @Override
        public void run() {

            try {
            for (int i = 1; i < 50; i++) {
                int index = (int) (Math.random() * names.length);
                    blockingQueue.put(new User(names[index], index * i));
            }
                blockingQueue.put(new User("end",0));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static class UserReader implements Runnable {
        @Override
        public void run() {
            try {
                int i = 0;
                while (true){
                    User user = blockingQueue.take();
                    if(Objects.equals(user.name(), "end")){
                        System.out.println("exit");
                        blockingQueue.put(user);
                        break;
                    }else {
                        System.out.println(i++ + " " + user.name() + " " + user.age());
                    }
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
