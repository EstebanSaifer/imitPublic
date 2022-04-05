package Product;

import Product.Product;
import org.junit.Test;

public class ProductTest {

    @Test(expected = ProductException.class)
    public void exceptionNullName() throws ProductException {
        Product product = new Product("", "description string");
    }

    @Test(expected = ProductException.class)
    public void exceptionNullDescription() throws ProductException {
        Product product2 = new Product("name", "");
    }
}