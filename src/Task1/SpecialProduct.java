package Task1;

public class SpecialProduct extends Product {
    int regularPrice;
    int percentageOff;

    public SpecialProduct(String name, int price) {
        super(name, price);
    }

    public SpecialProduct(String name, float discountedPrice) {

    }

    @Override
    public String toString() {
        return String.format("SpecialProduct{regularPrice=%d, percentageOff=%d, name='%s', price=%d}", regularPrice, percentageOff, name, price);
    }

    public static SpecialProduct applyOffOnProduct(Product product, int percentageOff1) {
        int discountPrice = (product.price * percentageOff1) / 100;
        SpecialProduct specialProduct = new SpecialProduct(product.name, discountPrice);
        specialProduct.regularPrice = product.price;
        specialProduct.percentageOff = percentageOff1;
        return specialProduct;
    }

}

