public class BankAccount {

    private int balance =0;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to the bank" + "current balance is " + balance);

        notify();
    }

    public synchronized void withdraw(int amount) {
        while (balance >= amount) {
            System.out.println("Withdrawn " + amount + " from the bank" + "current balance is " + balance);
            try {
                wait();
            }catch (InterruptedException e) {
                System.out.println("Bank interrupted with withdrawn");
            }
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from the bank" + "current balance is " + balance);
        }
    }
}
