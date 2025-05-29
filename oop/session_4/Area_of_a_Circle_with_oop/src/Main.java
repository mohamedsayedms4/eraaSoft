import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double rOfArea = scanner.nextDouble();
        Circle circle = new Circle();
        System.out.println("area of circle ="+ circle.getPi(rOfArea));
    }
}