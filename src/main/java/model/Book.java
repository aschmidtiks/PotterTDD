package model;

public class Book extends Product {

    private String isbn;

    public Book(long id, String name, double price, String isbn){
        super(id, name, price, 0.07);
        this.isbn = isbn;
    }
}
