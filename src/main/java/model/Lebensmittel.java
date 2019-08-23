package model;

import java.time.LocalDate;

public abstract class Lebensmittel extends SevenPercentProduct{
    private LocalDate bestBeforeDate;

    public Lebensmittel(long id, String name, double price, LocalDate bestBeforeDate) {
        super(id, name, price);
        this.bestBeforeDate = bestBeforeDate;
    }

    public LocalDate getBestBeforeDate() {
        return bestBeforeDate;
    }
}
