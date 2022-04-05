package Product;

import Product.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class СonsignmentOfProductTest {

    @Test
    public void getСonsignmentOfProductTest() throws ProductException {
        Packing packing = new Packing(" ", 1);
        PackedPieceProduct piece = new PackedPieceProduct(" ", " ", 2,2, new Packing(" ", 1));
        PackedWeightProduct piece2 = new PackedWeightProduct(" ", " ",2,new Packing(" ", 1));

        СonsignmentOfProduct consigment = new СonsignmentOfProduct(" ", piece ,piece2);
        assertEquals(6, consigment.massOfBruttoOfAllProducts(), 0.00001);
    }
}