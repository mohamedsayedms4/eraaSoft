import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final  double biOfArea = 3.141592653 ;
        double rOfArea = scanner.nextDouble();
        System.out.println(biOfArea*Math.pow(rOfArea,2));
    }
}