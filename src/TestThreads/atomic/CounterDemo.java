package TestThreads.atomic;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CounterDemo {

    //    static int counter = 0;
    static AtomicInteger counter = new AtomicInteger(0);


    //    static synchronized int nextValue(){
    static int nextValue() {
//        return counter++;
        return counter.getAndIncrement();
    }

    public static void main(String[] args) throws InterruptedException {
        List<Thread> threadList = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            Thread thread = new Thread(() -> System.out.println(nextValue()));
            threadList.add(thread);
            thread.start();
        }

        for (Thread t : threadList) {
            t.join();
        }
        System.out.println("counter = " + counter);
    }
}
