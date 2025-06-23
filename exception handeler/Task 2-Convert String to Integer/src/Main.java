import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Ask user to enter a number in a String, convert it to int,
//        and handle NumberFormatException.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number as a string: ");

        try {
            String s = sc.nextLine();
            int number = Integer.parseInt(s);
            System.out.println("Converted integer: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter a valid integer string.");
        } finally {
            sc.close();
        }
    }
}
