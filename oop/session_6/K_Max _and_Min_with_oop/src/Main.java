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

        long min = MinAndMax.min(num1, num2, num3);
        long max = MinAndMax.max(num1, num2, num3);

        System.out.println(min + " " + max);
    }
}