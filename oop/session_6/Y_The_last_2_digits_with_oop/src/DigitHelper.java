import java.util.Scanner;

public class DigitHelper {

    Scanner scanner = new Scanner(System.in);
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    int num3 = scanner.nextInt();
    int num4 = scanner.nextInt();
    public static void Last2Digits(int num1 , int num2 , int num3 , int num4 ) {

        int num1re = num1 % 100 ;
        int num2re = num2 % 100 ;
        int num3re = num3 % 100 ;
        int num4re = num4 % 100 ;

        int sum = (num1re*num2re*num3re*num4re)%100 ;

        if(sum <=9)
        {
            System.out.println("0"+sum);
        }
        else
        {
            System.out.println(sum);
        }
    }
}
