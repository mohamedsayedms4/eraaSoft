import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an equation (e.g., 5+3): ");
        String input = scanner.next();

        Equation eq = new Equation(input);

        if (!eq.isValid()) {
            System.out.println("️Invalid equation format.");
            return;
        }

        Calculator calc = new Calculator();
        int result = calc.calculate(eq.getNum1(), eq.getNum2(), eq.getOperator());

        if (result == Integer.MIN_VALUE) {
            if (eq.getOperator() == '/' && eq.getNum2() == 0) {
                System.out.println("Error: Cannot divide by zero.");
            } else {
                System.out.println("Unsupported operation.");
            }
        } else {
            System.out.println("Result: " + result);
        }
    }
}
