package TestThreads.cyclicbarrier;


import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {
    static long start = System.currentTimeMillis();

    public static void main(String[] args) {
        System.out.println("Main start " + (System.currentTimeMillis() - start));
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3,new AnotherThread());

        new CyclicBarrierDemo.MyThread(cyclicBarrier).start();
        new CyclicBarrierDemo.MyThread(cyclicBarrier).start();
        new CyclicBarrierDemo.MyThread(cyclicBarrier).start();

        new CyclicBarrierDemo.MyThread(cyclicBarrier).start();
        new CyclicBarrierDemo.MyThread(cyclicBarrier).start();
        new CyclicBarrierDemo.MyThread(cyclicBarrier).start();




        System.out.println("Main finish " + (System.currentTimeMillis() - start));

    }

    static class AnotherThread implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " AnotherThread reached" + (System.currentTimeMillis() - start));
        }
    }


    static class MyThread extends Thread {
        CyclicBarrier cyclicBarrier;

        public MyThread(CyclicBarrier cyclicBarrier) {
            this.cyclicBarrier = cyclicBarrier;

        }

        @Override
        public void run() {
            try {
                doWork();
            } catch (InterruptedException | BrokenBarrierException e) {
                System.out.println(getName() + " interrupted " + (System.currentTimeMillis() - start));
            }
        }

        private void doWork() throws InterruptedException, BrokenBarrierException {
            System.out.println(getName() + " perform initialization " + (System.currentTimeMillis() - start));
            Thread.sleep((long) (Math.random() * 10000));
            System.out.println(getName() + " initialization finished " + (System.currentTimeMillis() - start));
            cyclicBarrier.await();


            System.out.println(getName() + " - perform work -  " + (System.currentTimeMillis() - start));
            Thread.sleep((long) (Math.random() * 10000));
            System.out.println(getName() + " - finish work - " + (System.currentTimeMillis() - start));
        }
    }
}
