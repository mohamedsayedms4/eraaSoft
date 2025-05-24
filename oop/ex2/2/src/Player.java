//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Player {
    private String name;
    private int number;

    public Player() {
    }

    public Player(String name, int number) {
        this.setName(name);
        this.setNumber(number);
    }

    public void setName(String name) {
        if (name != null && name.length() > 5) {
            this.name = name;
        } else {
            System.out.println("Invalid name! Name must be longer than 5 characters.");
        }

    }

    public void setNumber(int number) {
        if (number > 0) {
            this.number = number;
        } else {
            System.out.println("Invalid number! Number must be greater than 0.");
        }

    }

    public String getName() {
        return this.name;
    }

    public int getNumber() {
        return this.number;
    }

    public void print() {
        System.out.println("Name  : " + this.getName());
        System.out.println("Number: " + this.getNumber());
    }
}
