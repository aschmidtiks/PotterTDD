package model;

import classes.Util;

public abstract class Product{

    private long id;
    private String name;
    private double netPrice;
    private double taxes = 0.19;

    public Product(long id, String name, double netPrice, double taxes) {
        this.id = id;
        this.name = name;
        this.netPrice = netPrice;
        this.taxes = taxes;
    }

    public Product(long id, String name, double netPrice) {
        this.id = id;
        this.name = name;
        this.netPrice = netPrice;
    }

    public double getGrossPrice(){
        return Util.roundToTwoDecimal(netPrice + netPrice * taxes);
    }

    public double getTaxes() {
        return taxes;
    }

    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(double netPrice) {
        this.netPrice = netPrice;
    }

}
