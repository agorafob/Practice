package TestThreads.countdownlatch;


import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    static long start = System.currentTimeMillis();

    public static void main(String[] args) {
        System.out.println("Main start " + (System.currentTimeMillis() - start));
        CountDownLatch countDownLatch = new CountDownLatch(10);

        for (int i = 0; i < 10; i++) {
            CountDownLatchDemo.MyThread myThread = new CountDownLatchDemo.MyThread(countDownLatch);
            myThread.setName(String.valueOf(i));
            myThread.start();
        }

        System.out.println("Main finish " + (System.currentTimeMillis() - start));

    }


    static class MyThread extends Thread {
        CountDownLatch countDownLatch;

        public MyThread(CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;

        }

        @Override
        public void run() {
            try {
                doWork();
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted " + (System.currentTimeMillis() - start));
            }
        }

        private void doWork() throws InterruptedException {
            System.out.println(getName() + " perform initialization" + (System.currentTimeMillis() - start));
            Thread.sleep((long) (Math.random() * 10000));
            System.out.println(getName() + " initialization finished " + (System.currentTimeMillis() - start));
            countDownLatch.countDown();
            countDownLatch.await();
            System.out.println(getName() + " - perform work -  " + (System.currentTimeMillis() - start));
            Thread.sleep((long) (Math.random() * 10000));
            System.out.println(getName() + " - finish work - " + (System.currentTimeMillis() - start));
        }
    }
}
