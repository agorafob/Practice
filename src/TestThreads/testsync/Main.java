package TestThreads.testsync;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main start");
        Account account = new Account(0);
        System.out.println(account.getBalance());
        DepositThread depositThread = new DepositThread(account);
        WithdrawThread withdrawThread = new WithdrawThread(account);
        depositThread.start();
        withdrawThread.start();

        depositThread.join();
        withdrawThread.join();


        System.out.println(account.getBalance());
        System.out.println("Main finish");
    }
}

class DepositThread extends Thread{
    Account account;

    public DepositThread(Account account){
        this.account=account;
    }

    @Override
    public void run() {
        System.out.println("DepositThread start");
        for (int i = 0; i < 10_000; i++) {
            account.deposit(1);
        }
        System.out.println("DepositThread finish");
    }
}

class WithdrawThread extends Thread{
    Account account;

    public WithdrawThread(Account account){
        this.account=account;
    }

    @Override
    public void run() {
        System.out.println("WithdrawThread start");
//        for (int i = 0; i < 10_000; i++) {
//            account.withdraw(1);
//        }
        try {
            account.waitAndWithdraw(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("WithdrawThread finish");
    }
}
