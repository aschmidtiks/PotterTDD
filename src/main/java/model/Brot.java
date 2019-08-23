package model;

import java.time.LocalDate;

public class Brot extends Essen {

    public Brot(long id, String name, double price, LocalDate bestBeforeDate, int weight){
        super(id, name, price, bestBeforeDate, weight);
    }
}
