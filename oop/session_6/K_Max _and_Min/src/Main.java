import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong();
        long num3 = scanner.nextLong();
        scanner.close();

        long min = Math.min(num1, Math.min(num2, num3));
        long max = Math.max(num1, Math.max(num2, num3));


        System.out.println(min + " " + max);
    }
}