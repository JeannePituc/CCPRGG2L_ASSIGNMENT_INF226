public class Cashier {
    
    public void checkOut (GroceryItem item) {
        System.out.println(item.name + " has been added to your cart!");
    }

    public void showPrice (GroceryItem item) {
        System.out.println("This " + item.name + " costs " + "₱" + item.price);
}
}
