//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {




//        infinity loop
        BankAccount account = new BankAccount();

        Depositor depositor = new Depositor(account,1500);
        Withdrawer withdrawer =new  Withdrawer(account,1600);

        depositor.start();
        withdrawer.start();

    }
}