public class Equation {
    private int num1;
    private int num2;
    private char operator;
    private boolean valid = false;

    public Equation(String input) {
        parse(input);
    }

    private void parse(String input) {
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                String left = input.substring(0, i);
                String right = input.substring(i + 1);

                if (isNumber(left) && isNumber(right)) {
                    num1 = Integer.parseInt(left);
                    num2 = Integer.parseInt(right);
                    operator = ch;
                    valid = true;
                }
                return;
            }
        }
    }

    private boolean isNumber(String s) {
        if (s == null || s.isEmpty()) return false;
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    public boolean isValid() {
        return valid;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public char getOperator() {
        return operator;
    }
}
