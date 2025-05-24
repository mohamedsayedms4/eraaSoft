// Class representing a private club
public class PrivateClub extends Club {
    public PrivateClub() {
        super(); // Calls the default constructor of Club
    }

    @Override
    public void printPlayers() {
        System.out.println(" Private Club Players:");
        super.printPlayers(); // Calls base print logic
    }
}
