public class Opreation {

    public static void opreation(int num1 ,int num2 , int op) {
        switch (op) {
            case '>':
                System.out.println(num1 > num2 ? "Right" : "Wrong");
                break;
            case '<':
                System.out.println(num1 < num2 ? "Right" : "Wrong");
                break;
            case '=':
                System.out.println(num1 == num2 ? "Right" : "Wrong");
                break;
            default:
                System.out.println("Invalid operator");
        }

    }
}
