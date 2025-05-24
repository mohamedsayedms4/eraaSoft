//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RestaurantService restaurant = new Restaurant();

        Order order = new Order();
        order.setOrderID(1);
        order.setCustomerID(100);

        restaurant.saveOrder(order);
        restaurant.showOrder(order);
    }
}