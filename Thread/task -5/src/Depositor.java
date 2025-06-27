
public class Depositor extends Thread{
    private BankAccount account;
    private int amount;

    public Depositor(BankAccount account , int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        while (true) {
            account.deposit(amount);
            try {
                Thread.sleep(1500);
            }catch (InterruptedException e) {
                System.out.println(e.getMessage());
                break;
            }
        }
    }
}
