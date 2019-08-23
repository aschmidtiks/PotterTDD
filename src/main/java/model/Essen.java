package model;

import java.time.LocalDate;

public abstract class Essen extends Lebensmittel{
    private int weight;
    public Essen(long id, String name, double price, LocalDate bestBeforeDate, int weight) {
        super(id, name, price, bestBeforeDate);
        this.weight = weight;
    }
}
