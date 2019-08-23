package model;

import java.time.LocalDate;

public class Tomate extends ErntebareLebensmittel {
    public Tomate(long id, String name, double price, LocalDate bestBeforeDate, int weight, LocalDate ernteDatum){
        super(id, name, price, bestBeforeDate, weight, ernteDatum);
    }
}
