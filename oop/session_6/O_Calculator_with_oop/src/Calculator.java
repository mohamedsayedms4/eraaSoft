public class Calculator {
    public int calculate(int num1, int num2, char op) {
        if (op == '/' && num2 == 0) {
            return Integer.MIN_VALUE; // دلالة على قسمة على صفر
        }

        switch (op) {
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
            case '/': return num1 / num2;
            default: return Integer.MIN_VALUE; // عملية غير صحيحة
        }
    }
}
