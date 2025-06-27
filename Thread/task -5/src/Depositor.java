import java.util.Scanner;

public class Depositor extends Thread {
    private BankAccount account;
    private Scanner scanner;
    private Object lock;

    public Depositor(BankAccount account, Scanner scanner, Object lock) {
        this.account = account;
        this.scanner = scanner;
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
            int amount;
            synchronized (lock) {
                System.out.print("Enter amount to deposit: ");
                amount = scanner.nextInt();
            }
            account.deposit(amount);

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
