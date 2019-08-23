import model.*;
import classes.ShoppingCart;
import classes.Util;

import interfaces.ProductRepository;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.*;
import model.Product;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TestDataBase {

    private Map<Long, Product> productMap;

    @Mock
    private ProductRepository mockedProductRepository;

    private ShoppingCart shoppingCart;

    @BeforeEach
    public void setupDatabaseProductMap() {
        shoppingCart = new ShoppingCart(mockedProductRepository);
        LocalDate localDate = LocalDate.of(2014, Month.APRIL, 1);

        productMap = new HashMap<Long, Product>();

        Product book1 = new Book(1L, "Book1", 4, "dfgkj1");
        productMap.put(book1.getId(), book1);
        Product book2 = new Book(2L, "Book2", 5, "dfgkj2");
        productMap.put(book2.getId(), book2);
        Product book3 = new Book(3L, "Book3", 6, "dfgkj3");
        productMap.put(book3.getId(), book3);
        Product book4 = new Book(4L, "Book4", 8, "dfgkj4");
        productMap.put(book4.getId(), book4);
        Product shampoo = new Shampoo(10L, "HeadNShoulders", 2);
        productMap.put(shampoo.getId(), shampoo);
        Product comicBook = new ComicBook(20L, "OnePiece250", 5, "lel");
        productMap.put(comicBook.getId(), comicBook);
        Product brot1 = new Brot(30L, "Weissbrot", 1.50, localDate, 1);
        productMap.put(brot1.getId(), brot1);
        Product wasser1 = new Wasser(40L, "H2O", 1.50, localDate, 1.5);
        productMap.put(wasser1.getId(), wasser1);
        Product milch1 = new Milch(50L, "milchJunge", 2, localDate, 1.5);
        productMap.put(milch1.getId(), milch1);
        Product tomate1 = new Tomate(60L, "Protatoe", 2, localDate, 1, localDate);
        productMap.put(tomate1.getId(), tomate1);
        Product apfel1 = new Apfel(70L, "RoterApfel", 1.20, localDate, 1, localDate);
        productMap.put(apfel1.getId(), apfel1);
    }

    @Test
    public void testShoppingCart() {
        Long id1 = 1L;
        Product product1 = productMap.get(id1);
        Long id2 = 2L;
        Product product2 = productMap.get(id2);

        when(mockedProductRepository.getById(id1)).thenReturn(product1);
        when(mockedProductRepository.getById(id2)).thenReturn(product2);

        shoppingCart.addToCart(id1);
        shoppingCart.addToCart(id2);
        double expected = product1.getNetPrice() + product2.getNetPrice();
        double actual = shoppingCart.calculateTotal();

        assertEquals(expected, actual);
    }

    @Test
    public void testAddToCart3x1() {
        Long id = 1L;
        Product product = productMap.get(id);
        when(mockedProductRepository.getById(id)).thenReturn(product);

        shoppingCart.addToCart(id);
        shoppingCart.addToCart(id);
        shoppingCart.addToCart(id);
        double expected = Util.roundToTwoDecimal((product.getNetPrice() * 3) * 0.95);
        double actual = shoppingCart.calculateTotal();

        assertEquals(expected, actual);
    }

    @Test
    public void testTaxes() {
        Long id = 1L;
        Product product = productMap.get(id);
        when(mockedProductRepository.getById(id)).thenReturn(product);

        shoppingCart.addToCart(id);
        double expected = product.getGrossPrice();
        double actual = shoppingCart.calculateTotalWithTaxes();

        assertEquals(expected, actual);
    }

    @Test
    public void testTaxes19Percent() {
        Long id = 1L;
        Product product = productMap.get(id);
        when(mockedProductRepository.getById(id)).thenReturn(product);

        shoppingCart.addToCart(id);
        double expected = product.getGrossPrice();
        double actual = shoppingCart.calculateTotalWithTaxes();

        assertEquals(expected, actual);
    }
}