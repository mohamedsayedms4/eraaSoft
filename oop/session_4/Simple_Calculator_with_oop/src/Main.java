import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long inputNum1 = scanner.nextInt();
        long inputNum2 = scanner.nextInt();

        Opreation opreation = new Opreation();
        System.out.println( opreation.add(inputNum1, inputNum2));
       System.out.println( opreation.sub(inputNum1, inputNum2));
        System.out.println(opreation.multi(inputNum1, inputNum2));


    }
}