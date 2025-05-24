//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Player player1 = new Player(1,"Moahmed",10);
        Player player2 = new Player(2,"ZIZO",19);
        Club club = new PublicClub();
        Club club2 = new PrivateClub();

        club.addPlayer(player1);
        club2.addPlayer(player2);
        club.printPlayers();
        club2.printPlayers();
    }
}