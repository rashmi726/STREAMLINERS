package Task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Product biscuit = new Product("Biscuit",50);
        Product chocolate = new Product("Chocolate",100);
        Product chocolateOne = new Product("Chocolate",100);

        for (Product product : Arrays.asList(chocolate,chocolateOne,biscuit)){
            System.out.println(product);
        }
        System.out.println(chocolate.equals(chocolateOne));
        SpecialProduct specialProduct = SpecialProduct.applyOffOnProduct(chocolate,20);
        System.out.println(specialProduct);
    }
}
