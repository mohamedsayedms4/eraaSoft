public class TowNumbers  {

    private static double operation(double num1, double num2) {
        return num1 / num2;
    }

    public static void printFloor(double num1, double num2) {
        double result = operation(num1, num2);
        System.out.printf("floor %.0f / %.0f = %.0f\n", num1, num2, Math.floor(result));
    }

    public static void printCeil(double num1, double num2) {
        double result = operation(num1, num2);
        System.out.printf("ceil %.0f / %.0f = %.0f\n", num1, num2, Math.ceil(result));
    }

    public static void printRound(double num1, double num2) {
        double result = operation(num1, num2);
        System.out.printf("round %.0f / %.0f = %d\n", num1, num2, Math.round(result));
    }
}
