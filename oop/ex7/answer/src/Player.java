// Base class representing a generic player
public class Player {
    private String name;
    private int id;
    private int number;

    // Default constructor
    public Player() {}

    // Parameterized constructor
    public Player(String name, int id, int number) {
       setName(name);
       setId(id);
       setNumber(number);
    }

    // Getters and setters
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    // Method to print common player data
    public void print() {
        System.out.println("ID: " + getId() + ", Name: " + getName() + ", Number: " + getNumber());
    }
}
