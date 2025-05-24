//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.setId(1);
        player.setName("Mohamed Salah");


        Shirt shirt = new Shirt();
        shirt.setId(101);
        shirt.setColor("Red");
        shirt.setNumber(10);
        shirt.setPlayer(player);
        player.setShirt(shirt);
        System.out.println(shirt.getPlayer().getName());
        System.out.println(player.getShirt().getNumber());


    }
}