import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        char op = scanner.next().charAt(0);
        int num2 = scanner.nextInt();
        char op2 = scanner.next().charAt(0);
        int res = scanner.nextInt();



        switch (op) {
            case '+':
                if(num1+num2 == res)
                {
                    System.out.println("Yes");
                }
                else
                {
                    System.out.println(num1+num2);
                }
                break;
            case '-':
                if(num1-num2 == res)
                {
                    System.out.println("Yes");
                }
                else
                {
                    System.out.println(num1-num2);
                }
                break;
            case '*':
                if(num1*num2 == res)
                {
                    System.out.println("Yes");
                }
                else
                {
                    System.out.println(num1*num2);
                }
                break;

            case '/':
                if(num1/num2 == res)
                {
                    System.out.println("Yes");
                }
                else
                {
                    System.out.println(num1/num2);
                }
                break;
            default:
                throw new AssertionError();
        }
    }
}