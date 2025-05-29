import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long inputNum1 = scanner.nextInt();
        long inputNum2 = scanner.nextInt();
        long inputNum3 = scanner.nextInt();
        long inputNum4 = scanner.nextInt();

        Difference difference = new Difference();
        long res = difference.opreation(inputNum1, inputNum2, inputNum3, inputNum4);
        System.out.println(res);
    }
}