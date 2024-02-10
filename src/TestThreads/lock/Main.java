package TestThreads.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Main {
    static int  counter = 10;
    static Lock lock = new ReentrantLock();
    static Condition equalsZero = lock.newCondition();


    public static void main(String[] args) throws InterruptedException {
        CountDown c = new CountDown();
        Printer p = new Printer();
        c.start();
        p.start();
    }

    static class CountDown extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 15; i++) {
                lock.lock();
                try {
                    System.out.println(counter--);
                    equalsZero.signalAll();
                } finally {
                    lock.unlock();
                }
            }
        }

    }

    static class Printer extends Thread {
        @Override
        public void run() {
            lock.lock();
            try {
                while (counter > 0) {
                    equalsZero.awaitUninterruptibly();
                }
                System.out.println("Boom " + counter);
            } finally {
                lock.unlock();
            }
        }
    }
}



