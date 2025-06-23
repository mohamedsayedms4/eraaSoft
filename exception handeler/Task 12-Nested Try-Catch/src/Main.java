//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Use nested try-catch blocks where inner block causes ArithmeticException and outer catches it.

        try {
            System.out.println("Outer try block starts.");

            try {
                System.out.println("Inner try block starts.");
                int result = 10 / 0;
                System.out.println("This line in inner try will not execute.");
            }catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException in outer catch: " + e.getMessage());

            }


            System.out.println("This line in outer try will not execute if exception occurs.");

        } catch (Exception e) {
            System.out.println("Caught ArithmeticException in outer catch: " + e.getMessage());
        }

        System.out.println("Program continues after nested try-catch.");
    }
}