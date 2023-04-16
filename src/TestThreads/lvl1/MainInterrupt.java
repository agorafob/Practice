package TestThreads.lvl1;

public class MainInterrupt {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("MainThread start");
        WorkerThread wt = new WorkerThread();
        SleepThread st = new SleepThread();
        wt.start();
        st.start();

        Thread.sleep(100L);
        System.out.println("Try to interrupt");
        wt.interrupt();
        st.interrupt();

        System.out.println("Worker join");
        wt.join();
        System.out.println("Sleeper join");
        st.join();

        System.out.println("MainThread finished");
    }
}

class WorkerThread extends Thread {
    @Override
    public void run() {
        System.out.println("WorkerThread start");
        long sum = 0;
        for (int i = 0; i < 2_000_000_000; i++) {
            sum += i;
            if (isInterrupted()){
                System.out.println("WorkerThread is interrupted on i = " + i);
                break;
            }
        }
        System.out.println("sum from Worker " + sum);
        System.out.println("WorkerThread finished");

    }
}


class SleepThread extends Thread {
    @Override
    public void run() {
        System.out.println("SleepThread start");
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            System.out.println("SleepThread interrupted");
        }
        System.out.println("SleepThread finished");


    }
}
