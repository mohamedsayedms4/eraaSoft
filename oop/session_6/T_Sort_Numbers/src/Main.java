import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner scannerr = new Scanner(System.in);

        int num1 = scannerr.nextInt();
        int num2 = scannerr.nextInt();
        int num3 = scannerr.nextInt();

        int max = 0 , min = 0 , mid = 0;

        if(num1>=num2 && num1>=num3)
        {
            max = num1 ;
            if(num2>=num3)
            {
                min = num3 ;
                mid = num2 ;
            }
            else
            {
                min = num2 ;
                mid = num3 ;
            }
        }
        else if(num2>=num1 && num2>=num3)
        {
            max = num2 ;
            if(num1>=num3)
            {
                min = num3 ;
                mid = num1 ;
            }
            else
            {
                min = num1 ;
                mid = num3 ;
            }
        }
        else
        {
            max = num3 ;
            if(num1 >= num2)
            {
                mid = num1 ;
                min = num2;
            }
            else
            {
                min = num1 ;
                mid = num2 ;
            }
        }
        System.out.println(min+"\n"+mid+"\n"+max+"\n"+"\n"+num1+"\n"+num2+"\n"+num3);
    }
}