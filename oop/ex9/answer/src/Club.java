import java.util.ArrayList;
import java.util.List;

// Class representing a general club
public class Club {
    protected List<Player> players;

    // Default constructor initializing the players list
    public Club() {
        this.players = new ArrayList<>();
    }

    // Constructor with a given list of players
    public Club(List<Player> players) {
        this.players = players;
    }

    // Method to add a player to the club
    public void addPlayer(Player p) {
        players.add(p);
    }

    // Method to remove a player from the club
    public void removePlayer(Player p) {
        players.remove(p);
    }

    // Method to print all players in the club
    public void printPlayers() {
        for (Player player : players)
            player.printPlayer();
    }
}
