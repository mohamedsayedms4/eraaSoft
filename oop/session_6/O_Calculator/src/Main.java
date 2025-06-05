import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String equ = scanner.next();  // Read the input equation

        int indexOp = 0;  // Initialize operator index
        char operator = '0';  // Initialize operator
        String num1, num2;

        // Find the operator in the equation
        for (int i = 0; i < equ.length()-1; i++) {
            if (equ.charAt(i) == '+' || equ.charAt(i) == '-' || equ.charAt(i) == '*' || equ.charAt(i) == '/') {
                indexOp = i;
                operator = equ.charAt(i);
                break;
            }
        }

        // Extract the numbers from the equation
        num1 = equ.substring(0, indexOp);
        num2 = equ.substring(indexOp + 1);

        // Convert the numbers to integers
        int intNum1 = Integer.parseInt(num1);
        int intNum2 = Integer.parseInt(num2);

        // Calculate the result based on the operator
        int result = 0;
        switch (operator) {
            case '+':
                result = intNum1 + intNum2;
                break;
            case '-':
                result = intNum1 - intNum2;
                break;
            case '*':
                result = intNum1 * intNum2;
                break;
            case '/':
                if (intNum2 != 0) {
                    result = intNum1 / intNum2;
                } else {
                    System.out.println("Error: Division by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator.");
                return;
        }

        // Output the 15
        System.out.println(result);
    }
    }
}