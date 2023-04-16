package TestThreads.lvl2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <1000 ; i++) {
            DemoClass demoClass = new DemoClass();
            demoClass.start();
            demoClass.join();
        }

        System.out.println(DemoClass.getCounter());
    }
}


class DemoClass extends Thread{
    private static int counter = 0;

    public DemoClass(){
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public void run() {
        System.out.println(counter);
    }
}
