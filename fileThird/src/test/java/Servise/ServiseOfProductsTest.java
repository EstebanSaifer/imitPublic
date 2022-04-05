package Servise;

import Product.ProductException;
import Product.СonsignmentOfProduct;
import Product.PackedPieceProduct;
import Product.PackedWeightProduct;
import Product.Packing;
import Filter.Filter;
import Filter.BeginStringFilter;
import Filter.ContainsStringFiller;
import Filter.EndStringFile;

import org.junit.Test;

import static org.junit.Assert.*;

public class ServiseOfProductsTest {

    @Test
    public void test0() throws ProductException {
        Packing packing = new Packing("n", 1);

        PackedPieceProduct piece = new PackedPieceProduct("1name2", "description1", 2,2, new Packing("n", 1));
        PackedWeightProduct piece2 = new PackedWeightProduct("2name3", "description2",2, new Packing("n", 1));
        PackedWeightProduct piece3 = new PackedWeightProduct("3name4", "description3",2, new Packing("n", 1));

        СonsignmentOfProduct сonsignmentOfProduct = new СonsignmentOfProduct("d", piece, piece2, piece3);

        Filter filter = new BeginStringFilter("1");
        assertEquals(1, ServiseOfProducts.countByFilter(сonsignmentOfProduct, filter));
    }

    @Test
    public void test1() throws ProductException {
        Packing packing = new Packing("n", 1);

        PackedPieceProduct piece = new PackedPieceProduct("1name2", "description1", 2,2, new Packing("n", 1));
        PackedWeightProduct piece2 = new PackedWeightProduct("1name3", "description2",2, new Packing("n", 1));
        PackedWeightProduct piece3 = new PackedWeightProduct("1name4", "description3",2, new Packing("n", 1));

        СonsignmentOfProduct сonsignmentOfProduct = new СonsignmentOfProduct("d", piece, piece2, piece3);

        Filter filter = new BeginStringFilter("1");
        assertEquals(3, ServiseOfProducts.countByFilter(сonsignmentOfProduct, filter));
    }

    @Test
    public void test2() throws ProductException {
        Packing packing = new Packing("n", 1);

        PackedPieceProduct piece = new PackedPieceProduct("1nam2", "description1", 2,2, new Packing("n", 1));
        PackedWeightProduct piece2 = new PackedWeightProduct("2name3", "description2",2, new Packing("n", 1));
        PackedWeightProduct piece3 = new PackedWeightProduct("3nam4", "description3",2, new Packing("n", 1));

        СonsignmentOfProduct сonsignmentOfProduct = new СonsignmentOfProduct("d", piece, piece2, piece3);

        Filter filter = new ContainsStringFiller("name");
        assertEquals(1, ServiseOfProducts.countByFilter(сonsignmentOfProduct, filter));
    }

    @Test
    public void test3() throws ProductException {
        Packing packing = new Packing("n", 1);

        PackedPieceProduct piece = new PackedPieceProduct("1name2", "description1", 2,2, new Packing("n", 1));
        PackedWeightProduct piece2 = new PackedWeightProduct("2name3", "description2",2, new Packing("n", 1));
        PackedWeightProduct piece3 = new PackedWeightProduct("3name4", "description3",2, new Packing("n", 1));

        СonsignmentOfProduct сonsignmentOfProduct = new СonsignmentOfProduct("d", piece, piece2, piece3);

        Filter filter = new EndStringFile("3");
        assertEquals(1, ServiseOfProducts.countByFilter(сonsignmentOfProduct, filter));
    }
}