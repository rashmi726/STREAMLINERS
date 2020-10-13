package Task2;

import static java.lang.Integer.parseInt;

public class GroceryCartItem extends GroceryItem {
    float price;
    float quantity;

    public GroceryCartItem(String name, int pricePerKg, float price, float quantity) {
        super(name, pricePerKg);
        this.price = price;
        this.quantity = quantity;

    }

    public GroceryCartItem(String name, int pricePerkg){
        super(name, pricePerkg);
    }

    @Override
    public String toString() {
        return String.format("GroceryCartItem{price=%s, quantity=%s, name='%s', pricePerKg=%d}", price, quantity, name, pricePerKg);
    }

    public static float extractQuantity(String quantityStr){
       String metric[] = quantityStr.split(" ");
       metric[0] = metric[0].replace("kg","");
       metric[1] = metric[1].replace("g","");
       float KiloGrams = Integer.parseInt(metric[0]);
       float grams =Integer.parseInt(metric[1]);
       float quantityAdded = (KiloGrams+(grams/1000));
       return quantityAdded;
}

     public static GroceryCartItem createNew(GroceryItem item,String quantityStr) {
    GroceryCartItem cartItem = new GroceryCartItem(item.name, item.pricePerKg);
    cartItem.quantity = extractQuantity(quantityStr);
    cartItem.price = item.pricePerKg * cartItem.quantity;
    return cartItem;
     }
}