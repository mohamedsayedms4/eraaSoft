//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Create a method that throws an exception and
//        another method that calls it. Demonstrate how exceptions propagate.

        try {
            methodB();
        } catch (Exception e) {
            System.out.println("Caught exception in main: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }

    public static void methodA() throws Exception {
        throw new Exception("Exception thrown from methodA");
    }
    public static void methodB() throws Exception {
        methodA();
    }
}