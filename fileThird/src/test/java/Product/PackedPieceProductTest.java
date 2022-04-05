package Product;

import Product.PackedPieceProduct;
import Product.Packing;
import Product.ProductException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PackedPieceProductTest {

    @Test()
    public void goodException() throws ProductException {
        Packing packing = new Packing("К" , 7.5);
        PackedPieceProduct product = new PackedPieceProduct("J", "description string", 1, 1, packing);
    }

    @Test
    public void getBrutto() throws ProductException {
        Packing packing = new Packing("К" , 7.5);
        PackedPieceProduct product = new PackedPieceProduct("J", "description string", 1, 2, packing);
        assertEquals(product.brutto(), 8.5, 00000000.1);
    }

    @Test
    public void getNetto() throws ProductException {
        Packing packing = new Packing("К" , 7.5);
        PackedPieceProduct product = new PackedPieceProduct ("J", "description string", 1, 3, packing);
        assertEquals(product.netto(), 1.0, 00000000.1);
    }

    @Test(expected = ProductException.class)
    public void exceptionNullName() throws ProductException {
        Packing packing = new Packing("К" , 7.5);
        PackedPieceProduct product = new PackedPieceProduct("", "description string", 1,4, packing);
    }

    @Test(expected = ProductException.class)
    public void exceptionNullDescription() throws ProductException {
        Packing packing = new Packing("К" , 7.5);
        PackedPieceProduct product = new PackedPieceProduct("name", "", 1, 5, packing);
    }

    @Test(expected = ProductException.class)
    public void exceptionBadWeight() throws ProductException {
        Packing packing = new Packing("К" , 7.5);
        PackedPieceProduct product = new PackedPieceProduct("name", "", -1,6, packing);
    }

    @Test(expected = ProductException.class)
    public void exceptionProblemPacking() throws ProductException {
        Packing packing = new Packing("" , 7.5);
        Packing packing0 = new Packing("К" , -1);
        PackedPieceProduct product = new PackedPieceProduct("name", "ll", 1,7, packing);
        PackedPieceProduct product1 = new PackedPieceProduct("name", "ll", 1,8, packing0);
    }

    @Test(expected = ProductException.class)
    public void exceptionBadPieceOfProduct() throws ProductException {
        Packing packing = new Packing("К" , 7.5);
        PackedPieceProduct product = new PackedPieceProduct("name", "ll", 1,-1, packing);
    }
}