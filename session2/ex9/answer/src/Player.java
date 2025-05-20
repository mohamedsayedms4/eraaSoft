// Class representing a player
public class Player {

    private int id;
    private String name;
    private int number;

    public Player() {
    }

    public Player(int id, String name, int number) {
        setId(id);
        setName(name);
        setNumber(number);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    // Method to print player information
    protected void printPlayer() {
        System.out.println("Player \nID : " + getId() + "\nName : " + getName() + "\nNumber : " + getNumber());
    }
}
