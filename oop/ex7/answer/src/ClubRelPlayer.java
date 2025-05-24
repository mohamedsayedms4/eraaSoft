// Subclass representing a player from a Relational Club
public class ClubRelPlayer extends Player {
    private String rcode; // Relational club code (e.g., club name)

    // Default constructor
    public ClubRelPlayer() {
        super();
    }

    // Parameterized constructor
    public ClubRelPlayer(String name, int id, int number, String rcode) {
        super(name, id, number);
        this.rcode = rcode;
    }

    // Getter and setter
    public String getRcode() {
        return rcode;
    }
    public void setRcode(String rcode) {
        this.rcode = rcode;
    }

    // Print full player info including Relational club code
    @Override
    public void print() {
        super.print();
        System.out.println("Rcode: " + rcode);
    }
}
