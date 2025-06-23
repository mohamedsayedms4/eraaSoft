//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Write a program that may throw both NullPointerException and
//        ArithmeticException. Use multiple catch blocks.

        String word = null ;
        int number1 = 5 ;
        int number2 = 0 ;

        try {
            System.out.println("Length of text: " + word.length());
            int res = number1 / number2 ;
            System.out.println("Result of division: " +res);
        }catch (NullPointerException e) {
            System.out.println("Error: Tried to access a method on a null object.");
        }catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }catch (Exception e) {
            System.out.println("Error: Something went wrong");
        }
    }
}