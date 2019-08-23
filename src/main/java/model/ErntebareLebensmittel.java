package model;

import java.time.LocalDate;

public abstract class ErntebareLebensmittel extends Essen {
    private LocalDate ernteDatum;

    public ErntebareLebensmittel(long id, String name, double price, LocalDate bestBeforeDate, int weight, LocalDate ernteDatum) {
        super(id, name, price, bestBeforeDate, weight);
        this.ernteDatum = ernteDatum;
    }
}
