//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Sum {
    private int number1;
    private int number2;
    private int number3;

    public Sum() {
    }

    public Sum(int number1, int number2, int number3) {
        this.setNumber1(number1);
        this.setNumber2(number2);
        this.setNumber3(number3);
    }

    public int getNumber1() {
        return this.number1;
    }

    public void setNumber1(int number1) {
        if (this.isEven(number1)) {
            this.number1 = number1;
        } else {
            System.out.println("Number1 is not even");
        }

    }

    public int getNumber2() {
        return this.number2;
    }

    public void setNumber2(int number2) {
        if (this.isEven(number2)) {
            this.number2 = number2;
        } else {
            System.out.println("Number2 is not even");
        }

    }

    public int getNumber3() {
        return this.number3;
    }

    public void setNumber3(int number3) {
        if (this.isEven(number3)) {
            this.number3 = number3;
        } else {
            System.out.println("Number2 is not even");
        }

    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int getSum() {
        return this.getNumber1() + this.getNumber2() + this.getNumber3();
    }
}
