import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char input = scanner.next().charAt(0); // Read the character input

        if(input >= 'A' && input <= 'Z') {
            // Convert to lowercase by adding 32 to ASCII value of uppercase letter
            char converted = (char) (input + 32);
            System.out.println(converted);


        }else{
            char converted = (char) (input - 32);
            System.out.println(converted);
        }
    }
}