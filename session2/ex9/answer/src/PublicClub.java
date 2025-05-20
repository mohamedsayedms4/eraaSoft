// Class representing a public club
public class PublicClub extends Club {

    public PublicClub() {
        super(); // Calls the default constructor of Club
    }

    @Override
    public void printPlayers() {
        System.out.println(" Public Club Players:");
        super.printPlayers();
    }
}
