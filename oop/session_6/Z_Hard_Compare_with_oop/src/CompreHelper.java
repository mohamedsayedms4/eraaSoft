import java.util.Scanner;

public class CompreHelper {


    public static void opreation(double num1, double num2, double num3, double num4) {
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
