package model;

import java.time.LocalDate;

public abstract class Getraenke extends Lebensmittel {
    private double liter;

    public Getraenke(long id, String name, double price, LocalDate bestBeforeDate, double liter) {
        super(id, name, price, bestBeforeDate);
        this.liter = liter;
    }
}
