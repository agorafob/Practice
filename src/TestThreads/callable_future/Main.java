package TestThreads.callable_future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Counter counter = new Counter();
        FutureTask<Integer> futureTask = new FutureTask<>(counter);
        new Thread(futureTask).start();
        int a = futureTask.get();
        System.out.println(a);
    }


    static class Counter implements Callable<Integer>{

        @Override
        public Integer call() throws Exception {
            return 10;
        }
    }
}
