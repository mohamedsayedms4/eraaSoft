//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Create a method that calls toUpperCase() on a string.
//        Pass null and handle NullPointerException.

        String str = null;
        convertToUpperCase(str);
    }

    private static void convertToUpperCase(String str) {
        try {
            String upper = str.toUpperCase();
            System.out.println("Uppercase: " + upper);

        }catch (NullPointerException e) {
            System.out.println("NullPointerException: " );
        }
    }
}