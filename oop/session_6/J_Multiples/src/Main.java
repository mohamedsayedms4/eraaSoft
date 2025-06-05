import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();


        if((num1%num2 == 0)||(num2%num1 == 0))
        {
            System.out.println("Multiples");
        }
        else
        {
            System.out.println("No Multiples");
        }
    }
}