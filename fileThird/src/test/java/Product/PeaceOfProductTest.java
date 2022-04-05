package Product;

import Product.PeaceOfProduct;
import Product.ProductException;
import org.junit.Test;

public class PeaceOfProductTest {
    @Test(expected = ProductException.class)
    public void exceptionNullName() throws ProductException {
        PeaceOfProduct product = new PeaceOfProduct("", "description string", -1);
    }

    @Test(expected = ProductException.class)
    public void exceptionNullDescription() throws ProductException {
        PeaceOfProduct product2 = new PeaceOfProduct("name", "", -1);
    }
}