package interfaces;
import model.Product;

public interface ProductRepository {
    Product getById(long id);

}
