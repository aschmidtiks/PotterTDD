package classes;

import model.Book;
import model.ComicBook;
import model.Shampoo;
import interfaces.ProductRepository;
import model.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductRepositoryImpl implements ProductRepository {

    private Map<Long, Product> productMap = new HashMap<Long, Product>();

    public ProductRepositoryImpl() {
        Book book1 = new Book(1, "Book1", 4, "dfgkj1");
        productMap.put(book1.getId(), book1);
        Book book2 = new Book(2, "Book2", 5, "dfgkj2");
        productMap.put(book2.getId(), book2);
        Book book3 = new Book(3, "Book3", 6, "dfgkj3");
        productMap.put(book3.getId(), book3);
        Book book4 = new Book(4, "Book4", 8, "dfgkj4");
        productMap.put(book4.getId(), book4);
        Shampoo shampoo = new Shampoo(5,"HeadNShoulders", 2);
        productMap.put(shampoo.getId(), shampoo);
        ComicBook comicBook = new ComicBook(6, "OnePiece250", 5,"lel");
        productMap.put(comicBook.getId(), comicBook);
    }

    public Product getById(long id) {
        return productMap.get(id);
    }
}
