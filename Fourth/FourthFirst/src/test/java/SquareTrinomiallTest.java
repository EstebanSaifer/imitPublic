import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTrinomiallTest {

    @Test (expected = SquareException.class)
    public void SquareTest0() throws SquareException {
        SquareTrinomiall squareTrinomial = new SquareTrinomiall(0,1,1);
    }

    @Test
    public void SquareTest1() throws SquareException {
        SquareTrinomiall squareTrinomial = new SquareTrinomiall(1,1,1);
        assertEquals(squareTrinomial.squareTrinometralResult(),null);
    }

    @Test
    public void SquareTest2() throws SquareException {
        SquareTrinomiall squareTrinomial = new SquareTrinomiall(1,1,0);
        double[] array = new double[2];
        array[0] = -1;
        array[1] = 0;
        assertArrayEquals(array, squareTrinomial.squareTrinometralResult(), 0.0001);
    }
}