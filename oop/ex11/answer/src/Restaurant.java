public class Restaurant implements RestaurantService{

    public Order saveOrder(Order order){
        System.out.println("Restaurant save order");
            return order;
    }

   public void showOrder(Order order){
       System.out.println("Order Details:");
       System.out.println("Order ID: " + order.getOrderID());
       System.out.println("Customer ID: " + order.getCustomerID());
    }
}
