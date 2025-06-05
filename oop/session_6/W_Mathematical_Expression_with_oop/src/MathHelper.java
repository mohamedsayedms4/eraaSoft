import java.util.Scanner;

public class MathHelper {

    public static void mathematicalExpression() {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        char op = scanner.next().charAt(0);
        int num2 = scanner.nextInt();
        int res = scanner.nextInt();

        switch (op) {
            case '+':
                System.out.println((num1 + num2 == res) ? "Yes" : (num1 + num2));
                break;
            case '-':
                System.out.println((num1 - num2 == res) ? "Yes" : (num1 - num2));
                break;
            case '*':
                System.out.println((num1 * num2 == res) ? "Yes" : (num1 * num2));
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero");
                } else {
                    System.out.println((num1 / num2 == res) ? "Yes" : (num1 / num2));
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }
}
