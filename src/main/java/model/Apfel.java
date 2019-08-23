package model;

import java.time.LocalDate;

public class Apfel extends ErntebareLebensmittel {
    public Apfel(long id, String name, double price, LocalDate bestBeforeDate, int weight, LocalDate ernteDatum){
        super(id, name, price, bestBeforeDate, weight, ernteDatum);
    }
}
