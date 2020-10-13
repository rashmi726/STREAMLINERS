package Task2;
public class Main {
    public static void main(String[] args) {
        GroceryItem soap = new GroceryItem("Soap", 10);
        GroceryItem chocolate = new GroceryItem("Chocolate", 30);
        GroceryItem biscuit = new GroceryItem("Biscuit", 15);
        GroceryItem chips = new GroceryItem("Chips", 60);

        Cart cart = new Cart();//
        cart.add(GroceryCartItem.createNew(soap, "1kg 500g"));
        cart.add(GroceryCartItem.createNew(chocolate, "3kg 0g"));
        cart.add(GroceryCartItem.createNew(biscuit, "5kg 450g"));
        cart.add(GroceryCartItem.createNew(chips, "0kg 750g"));
        System.out.println(cart);
    }
}
