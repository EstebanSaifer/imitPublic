package Product;

import Product.PackedWeightProduct;
import Product.Packing;
import Product.ProductException;
import org.junit.Test;

import static org.junit.Assert.*;

public class PackedWeightProductTest {

    @Test()
    public void goodException() throws ProductException {
        Packing packing = new Packing("К" , 7.5);
        PackedWeightProduct product = new PackedWeightProduct("J", "description string", 1, packing);
    }

    @Test
    public void getBrutto() throws ProductException {
        Packing packing = new Packing("К" , 7.5);
        PackedWeightProduct product = new PackedWeightProduct("J", "description string", 1, packing);
        assertEquals(product.brutto(), 8.5, 00000000.1);
    }

    @Test
    public void getNetto() throws ProductException {
        Packing packing = new Packing("К" , 7.5);
        PackedWeightProduct product = new PackedWeightProduct ("J", "description string", 1, packing);
        assertEquals(product.netto(), 1.0, 00000000.1);
    }

    @Test(expected = ProductException.class)
    public void exceptionNullName() throws ProductException {
        Packing packing = new Packing("К" , 7.5);
        PackedWeightProduct product = new PackedWeightProduct("", "description string", 1, packing);
    }

    @Test(expected = ProductException.class)
    public void exceptionNullDescription() throws ProductException {
        Packing packing = new Packing("К" , 7.5);
        PackedWeightProduct product = new PackedWeightProduct("name", "", 1, packing);
    }

    @Test(expected = ProductException.class)
    public void exceptionBadWeight() throws ProductException {
        Packing packing = new Packing("К" , 7.5);
        PackedWeightProduct product = new PackedWeightProduct("name", "", -1, packing);
    }

    @Test(expected = ProductException.class)
    public void exceptionProblemPacking() throws ProductException {
        Packing packing = new Packing("К" , 7.5);
        Packing packing0 = new Packing("К" , -1);
        PackedWeightProduct product = new PackedWeightProduct("name", "ll", 1, packing);
        PackedWeightProduct product1 = new PackedWeightProduct("name", "ll", 1, packing0);
    }

}