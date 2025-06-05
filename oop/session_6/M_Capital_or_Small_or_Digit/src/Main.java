import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char input = scanner.next().charAt(0);

        if(input>=65 && input <=90)
        {
            System.out.println("ALPHA\nIS CAPITAL");
        }
        else if(input>=97&&input<=122)
        {
            System.out.println("ALPHA\nIS SMALL");

        }
        else
        {
            System.out.println("IS DIGIT");

        }
    }
}