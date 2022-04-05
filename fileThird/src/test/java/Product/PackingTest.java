package Product;

import Product.Packing;
import Product.ProductException;
import org.junit.Test;

public class PackingTest {

    @Test(expected = ProductException.class)
    public void exceptionNullName() throws ProductException {
        Packing packing = new Packing("", 5);
    }

    @Test(expected = ProductException.class)
    public void exceptionMassOfPackingIsNegative() throws ProductException {
        Packing packing = new Packing("Катя", -1);
    }
}