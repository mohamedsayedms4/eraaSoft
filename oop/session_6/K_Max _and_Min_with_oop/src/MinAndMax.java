public class MinAndMax {
    public static long min(long num1, long num2 , long num3) {
        return Math.min(num1, Math.min(num2, num3));
    }

    public static long max(long num1, long num2 , long num3) {
        return Math.max(num1, Math.max(num2, num3));
    }
}
