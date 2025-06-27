import java.util.Scanner;

public class Withdrawer extends Thread {
    private BankAccount account;
    private Scanner scanner;
    private Object lock;

    public Withdrawer(BankAccount account, Scanner scanner, Object lock) {
        this.account = account;
        this.scanner = scanner;
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
            int amount;
            synchronized (lock) {
                System.out.print("Enter amount to withdraw: ");
                amount = scanner.nextInt();
            }
            account.withdraw(amount);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
