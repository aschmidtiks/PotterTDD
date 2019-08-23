package model;

import java.time.LocalDate;
import java.util.Date;

public class Milch extends Getraenke {

    public Milch(long id, String name, double price, LocalDate bestBeforeDate, double liter) {
        super(id, name, price, bestBeforeDate, liter);
    }
}
