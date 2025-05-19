//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Player {
    private int id;
    private String name;
    private int number;

    public Player() {
    }

    public Player(int id, String name, int number) {
        this.setId(id);
        this.setName(name);
        this.setNumber(number);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("Player ID must be > 0");
        }

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        if (number > 0 && number <= 99) {
            this.number = number;
        } else {
            System.out.println("Player number must be > 0 and <= 99");
        }

    }

    public void print() {
        System.out.println("Player ID    : " + this.id);
        System.out.println("Player Name  : " + this.name);
        System.out.println("Player Number: " + this.number);
    }
}
