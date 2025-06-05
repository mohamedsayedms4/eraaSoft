import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        double num4 = scanner.nextDouble();

        double powNum =num2*Math.log(num1);
        double powNum2 =num4*Math.log(num3);


        if(powNum <= powNum2)
        {
            System.out.println("NO");
        }
        else
        {
            System.out.println("YES");
        }
    }
}