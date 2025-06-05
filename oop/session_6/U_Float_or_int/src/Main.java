import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scannerr = new Scanner(System.in);
        double number = scannerr.nextDouble();

        int numberInt =(int) number ;
        double res = number - (double)numberInt ;
        if(res == 0)
        {
            System.out.println("int "+numberInt);
        }
        else
        {
            System.out.printf("float %d %.3f",numberInt,res);
        }
    }
}