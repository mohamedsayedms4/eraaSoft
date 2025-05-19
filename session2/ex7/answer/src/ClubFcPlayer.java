// Subclass representing a player from an FC (Football Club)
public class ClubFcPlayer extends Player {
    private String fcode; // FC club code (e.g., club name)

    // Default constructor
    public ClubFcPlayer() {
        super();
    }

    // Parameterized constructor
    public ClubFcPlayer(String name, int id, int number, String fcode) {
        super(name, id, number);
        this.fcode = fcode;
    }

    // Getter and setter
    public String getFcode() {
        return fcode;
    }
    public void setFcode(String fcode) {
        this.fcode = fcode;
    }

    // Print full player info including FC code
    @Override
    public void print() {
        super.print();
        System.out.println("Fcode: " + fcode);
    }
}
