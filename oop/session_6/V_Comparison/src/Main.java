import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        char oprand = scanner.next().trim().charAt(0);

        int num2 = scanner.nextInt();

        switch (oprand) {
            case '>':
                System.out.println(num1 > num2 ? "Right" : "Wrong");
                break;
            case '<':
                System.out.println(num1 < num2 ? "Right" : "Wrong");
                break;
            case '=':
                System.out.println(num1 == num2 ? "Right" : "Wrong");
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}