import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        String lastName = scanner.next();

        String firstName2 = scanner.next();
        String lastName2 = scanner.next();

        if(lastName.equals(lastName2))
        {
            System.out.println("ARE Brothers");
        }
        else
        {
            System.out.println("NOT");
        }
    }
}