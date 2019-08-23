import classes.ProductRepositoryImpl;
import classes.ShoppingCart;
import classes.Util;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.junit.jupiter.MockitoExtension;
import model.Product;

import static org.junit.jupiter.api.Assertions.*;
/*
@ExtendWith(MockitoExtension.class)
public class TestShoppingCart {

    ShoppingCart shoppingCart;
    ProductRepositoryImpl productRepositoryImpl = new ProductRepositoryImpl();

    @BeforeEach
    public void testSetup() {
        shoppingCart = new ShoppingCart();
    }

    @Test
    public void testEmptyCart() {
        assertEquals(0, shoppingCart.calculateTotal());
    }

    @Test
    public void testCartWithOneBook() {
        Product book1 = productRepositoryImpl.getById(1);
        shoppingCart.addToCart(1L);
        double expected = book1.getNetPrice();
        assertEquals(expected, shoppingCart.calculateTotal());
    }

    @Test
    public void testCartWithTwoDifferentBooks() {
        Product book1 = productRepositoryImpl.getById(1);
        Product book2 = productRepositoryImpl.getById(2);

        shoppingCart.addToCart(book1);
        shoppingCart.addToCart(book2);

        double expected = book1.getNetPrice() + book2.getNetPrice();

        assertEquals(expected, shoppingCart.calculateTotal());
    }

    @Test
    public void testCartWithTwoSameBooks() {
        Product book1 = productRepositoryImpl.getById(1);

        shoppingCart.addToCart(book1);
        shoppingCart.addToCart(book1);

        double expected = book1.getNetPrice() + book1.getNetPrice();

        assertEquals(expected, shoppingCart.calculateTotal());
    }

    @Test
    public void testCartWithThreeSameBooks() {
        Product book1 = productRepositoryImpl.getById(1);

        shoppingCart.addToCart(book1);
        shoppingCart.addToCart(book1);
        shoppingCart.addToCart(book1);

        double expected = Util.roundToTwoDecimal(book1.getNetPrice() * 3 * 0.95);
        assertEquals(expected, shoppingCart.calculateTotal());
    }

    @Test
    public void testCartWithTwoTimesThreeSameBooks() {

        Product book1 = productRepositoryImpl.getById(1);
        shoppingCart.addToCart(book1);
        shoppingCart.addToCart(book1);
        shoppingCart.addToCart(book1);

        Product book2 = productRepositoryImpl.getById(2);
        shoppingCart.addToCart(book2);
        shoppingCart.addToCart(book2);
        shoppingCart.addToCart(book2);

        double expected = Util.roundToTwoDecimal((book1.getNetPrice() * 3 * 0.95) + (book2.getNetPrice() * 3  * 0.95));
        assertEquals(expected, shoppingCart.calculateTotal());
    }

    @Test
    public void testCartWithFiveBooks() {
        Product book1 = productRepositoryImpl.getById(1);
        shoppingCart.addToCart(book1);
        shoppingCart.addToCart(book1);
        shoppingCart.addToCart(book1);
        shoppingCart.addToCart(book1);
        shoppingCart.addToCart(book1);

        double expected = Util.roundToTwoDecimal(book1.getNetPrice() * 5 * 0.90);
        assertEquals(expected, shoppingCart.calculateTotal());
    }

    @Test
    public void testCartWithTenBooks() {
        Product book1 = productRepositoryImpl.getById(1);
        shoppingCart.addToCart(book1);
        shoppingCart.addToCart(book1);
        shoppingCart.addToCart(book1);
        shoppingCart.addToCart(book1);
        shoppingCart.addToCart(book1);
        shoppingCart.addToCart(book1);
        shoppingCart.addToCart(book1);
        shoppingCart.addToCart(book1);
        shoppingCart.addToCart(book1);
        shoppingCart.addToCart(book1);

        double expected =  Util.roundToTwoDecimal(book1.getNetPrice() * 10 * 0.90);
        assertEquals(expected, shoppingCart.calculateTotal());
    }

    @Test
    public void testCartWithShampoo() {
        Product shampoo = productRepositoryImpl.getById(5);
        shoppingCart.addToCart(shampoo);
        double expected = shampoo.getNetPrice();
        assertEquals(expected, shoppingCart.calculateTotal());
    }

    @Test
    public void testCartWithComicBook() {
        Product comicBook = productRepositoryImpl.getById(6);
        shoppingCart.addToCart(comicBook);
        double expected = comicBook.getNetPrice();
        assertEquals(expected, shoppingCart.calculateTotal());
    }
}
*/