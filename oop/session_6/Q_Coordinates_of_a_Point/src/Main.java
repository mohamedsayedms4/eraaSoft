import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();


        if (num1==0 && num2==0)
        {
            System.out.println("Origem");
        }else if (num1==0 && num2!=0)
        {
            System.out.println("Eixo Y");
        }
        else if(num2==0 && num1!=0)
        {
            System.out.println("Eixo X");
        }
        else
        {

            if(num1 > 0 && num2 > 0)
            {
                System.out.println("Q1");
            }
            else if(num1 < 0 && num2 > 0)
            {
                System.out.println("Q2");
            }
            else if(num1 < 0 && num2 < 0)
            {
                System.out.println("Q3");
            }
            else
            {
                System.out.println("Q4");
            }
        }
    }
}