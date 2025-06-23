//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Write a program with a try-catch-finally block and show that the finally block always executes.

        try {
            System.out.println("Inside try block.");
            int result = 10 / 0; // يسبب ArithmeticException
            System.out.println("This line will not be executed.");
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("Finally block always executes.");
        }

        System.out.println("Program continues after try-catch-finally.");
    }
}