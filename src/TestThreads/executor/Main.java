package TestThreads.executor;

import java.util.Arrays;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> futureTask1 = executorService.submit(new Worker());
        System.out.println("worker number " + futureTask1.get() );
        Future<String> futureTask2 = executorService.submit(new Worker());
        System.out.println("worker number " + futureTask2.get() );
        executorService.invokeAll(Arrays.asList(new Worker(),new Worker()));

        Future<String> futureTask3 = executorService.submit(new Worker());
        System.out.println("worker number " + futureTask3.get());
        executorService.shutdown();


    }


    static class Worker implements Callable<String>{
        private static int counter = 0;

        public Worker() {
//            counter++;
        }

        @Override
        public String call() throws InterruptedException {
            counter++;
            System.out.println(Thread.currentThread().getName());
            return String.valueOf(counter);
        }
    }
}
