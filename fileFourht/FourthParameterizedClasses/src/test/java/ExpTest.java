import org.junit.Test;

import static org.junit.Assert.*;

public class ExpTest {

    @Test
    public void test0() throws ParameterizedException {
        Exp exp = new Exp(1,0,2,1);
        assertEquals(7.38905609893065, exp.valueOfFunction(2), 0.00001);
    }

    @Test (expected = ParameterizedException.class)
    public void test1() throws ParameterizedException {
        Exp exp = new Exp(1,2,1,0);
        assertEquals(0, exp.valueOfFunction(-1), 0.0000001);
        assertEquals(0, exp.valueOfFunction(10), 0.0000001);
    }
}