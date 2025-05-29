import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intValue = scanner.nextInt();
        long longValue = scanner.nextLong();
        char charValue = scanner.next().charAt(0);
        float floatValue = scanner.nextFloat();
        double doubleValue = scanner.nextDouble();

        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(charValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);

        scanner.close();
    }
}