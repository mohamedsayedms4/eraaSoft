public class Withdrawer extends Thread {

    private BankAccount account;
    private int amount;

    public Withdrawer(BankAccount account , int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        while (true) {
            account.withdraw(amount);
            try {
                Thread.sleep(1500);
            }catch (InterruptedException e) {
                System.out.println(e.getMessage());
                break;
            }
        }
    }
}
