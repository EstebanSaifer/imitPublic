package Product;

import Product.ProductException;
import Product.WeightProduct;
import org.junit.Test;

public class WeightProductTest {

    @Test(expected = ProductException.class)
    public void exceptionNullName() throws ProductException {
        WeightProduct product = new WeightProduct("", "description string");
    }

    @Test(expected = ProductException.class)
    public void exceptionNullDescription() throws ProductException {
        WeightProduct product2 = new WeightProduct("name", "");
    }
}