import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner scannerr = new Scanner(System.in);

        int num1 = scannerr.nextInt();
        int num2 = scannerr.nextInt();
        int num3 = scannerr.nextInt();

        BasicSorting.sortNumbers(num1, num2, num3);
    }
}