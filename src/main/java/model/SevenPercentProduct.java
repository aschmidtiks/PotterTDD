package model;

public abstract class SevenPercentProduct extends Product{
    public SevenPercentProduct(long id, String name, double price) {
        super(id, name, price, 0.07);
    }
}
