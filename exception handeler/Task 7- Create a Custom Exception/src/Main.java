import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Create a custom exception InvalidAgeException. If user age < 18, throw the exception.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        try {
            int age = scanner.nextInt();
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid age: You must be at least 18 years old.");
        } else {
            System.out.println("Access granted. Age is valid.");
        }
    }
}