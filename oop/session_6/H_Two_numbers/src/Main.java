import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double sum = num1/num2 ;


        System.out.printf("floor %.0f / %.0f = %.0f\n",num1 , num2 ,Math.floor(sum));
        System.out.printf("ceil %.0f / %.0f = %.0f\n",num1 , num2 ,Math.ceil(sum));
        System.out.printf("round %.0f / %.0f = %d" , num1 ,num2 , Math.round(sum));
    }
}