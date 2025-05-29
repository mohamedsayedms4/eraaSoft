import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long inputNum1 = scanner.nextInt();
        long inputNum2 = scanner.nextInt();

        System.out.printf("%d + %d = %d\n" , inputNum1 , inputNum2 , inputNum1+inputNum2);
        System.out.printf("%d * %d = %d\n" , inputNum1 , inputNum2 , inputNum1*inputNum2);
        System.out.printf("%d - %d = %d\n" , inputNum1 , inputNum2 , inputNum1-inputNum2);

    }
}