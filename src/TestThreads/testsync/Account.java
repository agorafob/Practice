package TestThreads.testsync;

public class Account {
    private long balance;

    public Account(int balance) {
        this.balance = balance;
    }


//    public void withdraw(int amount) {
//        checkAmount(amount);
//        synchronized (this){
//            if(amount>balance){
//                throw new IllegalArgumentException("not enough balance");
//            }
//            balance -= amount;
//        }
//    }

    public void waitAndWithdraw(int amount) throws InterruptedException {
        checkAmount(amount);
        synchronized (this){
            while (balance<amount){
                wait();
            }

            balance -= amount;
        }
    }

    public synchronized void deposit(int amount) {
        checkAmount(amount);
        balance += amount;
        notifyAll();
    }

    private static void checkAmount(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("amount must be positive");
        }
    }

    public long getBalance() {
        return balance;
    }
}
