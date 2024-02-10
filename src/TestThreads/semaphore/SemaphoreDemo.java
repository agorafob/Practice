package TestThreads.semaphore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class SemaphoreDemo {

    static long start = System.currentTimeMillis();
    public static void main(String[] args) throws InterruptedException {


        System.out.println("Main start " + (System.currentTimeMillis()-start) );
        Semaphore semaphore = new Semaphore(2,true);
        List<Thread> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            MyThread myThread = new MyThread(semaphore);
            myThread.setName(String.valueOf(i));
            list.add(myThread);
            myThread.start();
        }
        System.out.println(list.size() + "list size " + (System.currentTimeMillis()-start) );
        System.out.println("Main sleep " + (System.currentTimeMillis()-start) );

        Thread.sleep(30000L);

        System.out.println("Main wake " + (System.currentTimeMillis()-start) );

        for (Thread t : list) {
            t.interrupt();
        }
        System.out.println("Main finish " + (System.currentTimeMillis()-start) );

    }


    static class MyThread extends Thread {
        Semaphore semaphore;

        public MyThread(Semaphore semaphore) {
            this.semaphore = semaphore;

        }

        @Override
        public void run() {
            try {
                doWork();
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted " + (System.currentTimeMillis()-start) );
            }
        }

        private void doWork() throws InterruptedException {
//            for (;;){
                semaphore.acquire();
                try {
                    System.out.println(getName() + " semaphore.acquire() - perform work " + (System.currentTimeMillis()-start) );
                    Thread.sleep(5000L);
                }finally {
                    System.out.println(getName() + " semaphore.release() " + (System.currentTimeMillis()-start) );
                    semaphore.release();
                }
//            }
        }
    }
}
