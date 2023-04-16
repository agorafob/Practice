package TestThreads.lvl1;

import TestListOfAllClassesInPackage.Main;

public class HelloMain {
    public static void main(String[] args) {
        System.out.println("Start");
        HelloThread1 helloThread1 = new HelloThread1();

        for (int i = 0; i <5 ; i++) {
//            new HelloThread().start();
//            new Thread(new HelloThread1()).start();
            new Thread(helloThread1).start();

        }

        System.out.println("End");
    }

    static class HelloThread extends Thread{
        @Override
        public void run() {
            System.out.println("Hello from " + getName());
        }
    }

    static class HelloThread1 implements Runnable{
        @Override
        public void run() {
//            System.out.println("Hello from1 " + Thread.currentThread().getName());
            System.out.println(Math.random()*5);
        }
    }

}


