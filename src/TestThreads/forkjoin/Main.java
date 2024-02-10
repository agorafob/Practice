package TestThreads.forkjoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

public class Main {
    public static void main(String[] args) {
        try(ForkJoinPool pool = new ForkJoinPool()){

            double result = pool.invoke(new Counter());
            System.out.println(result);

            pool.execute(new Printer());

        }
    }

    static class Counter extends RecursiveTask<Double>{
        @Override
        protected Double compute() {
            return 15.0;
        }
    }

    static class Printer extends RecursiveAction{
        @Override
        protected void compute() {
            System.out.println("Action");
        }
    }
}
