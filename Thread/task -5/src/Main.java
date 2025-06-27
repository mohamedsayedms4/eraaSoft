import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Scanner scanner = new Scanner(System.in);
        Object lock = new Object();

        Depositor depositor = new Depositor(account, scanner, lock);
        Withdrawer withdrawer = new Withdrawer(account, scanner, lock);

        depositor.start();
        withdrawer.start();
    }
}
