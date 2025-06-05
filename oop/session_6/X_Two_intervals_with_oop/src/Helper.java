import java.util.Scanner;

public class Helper {
    Scanner scanner = new Scanner(System.in);
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    int num3 = scanner.nextInt();
    int num4 = scanner.nextInt();

    public static void checkInterval(int num1, int num2, int num3 , int num4) {
        int start=0, end=0 ;
        if((num3 > num2 && num4 > num2)||(num1 > num3 && num1 > num4))
        {
            System.out.println("-1");

            return;
        }
        else
        {
            if(num1>num3)
            {
                start = num1 ;
            }
            else
            {
                start = num3;
            }
            if(num2 > num4)
            {
                end = num4;
            }
            else
            {
                end = num2 ;
            }
        }
        System.out.printf("%d %d",start,end);

    }

}
