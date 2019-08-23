package classes;

import interfaces.ProductRepository;
import model.Product;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private HashMap<Product, Integer> productCount = new HashMap<Product, Integer>();
    private static final double[] DISCOUNT = {0.95, 0.9, 0.8, 0.75};
    private ProductRepository productRepository;

    public ShoppingCart(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addToCart(long id) {
        Product product = productRepository.getById(id);
        if (productCount.containsKey(product)) {
            productCount.put(product, productCount.get(product) + 1);
        } else {
            productCount.put(product, 1);
        }
    }

    public double calculateTotal() {
        double total = 0;

        for (Map.Entry<Product, Integer> entry : productCount.entrySet()) {
            double tempTotal = 0.0;

            tempTotal += entry.getKey().getNetPrice() * entry.getValue();
            tempTotal *= getDiscount(entry.getValue());
            tempTotal = Util.roundToTwoDecimal(tempTotal);
            total += tempTotal;
        }
        return total;
    }

    public double calculateTotalWithTaxes() {
        double total = 0;

        for (Map.Entry<Product, Integer> entry : productCount.entrySet()) {
            double tempTotal = 0.0;

            tempTotal += entry.getKey().getGrossPrice() * entry.getValue();
            tempTotal *= getDiscount(entry.getValue());
            tempTotal = Util.roundToTwoDecimal(tempTotal);
            total += tempTotal;
        }
        return total;
    }


    private double getDiscount(int count) {
        double discount = 1;
        if (3 <= count && count <= 4) {
            discount = DISCOUNT[0];
        } else if (5 <= count) {
            discount = DISCOUNT[1];
        }
        return discount;
    }
}
