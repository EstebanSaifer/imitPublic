import org.junit.Test;

import static org.junit.Assert.*;

public class IntegralTest {
    @Test
    public void test0 () throws ParameterizedException {
        Exp exp = new Exp(1,2,8,1);
        Integral<Exp> integral = new Integral<>(1,2);
        assertEquals( 6.670754808968909, integral.calc(exp) , 0.0001);
    }

    @Test (expected = ParameterizedException.class)
    public void test1 () throws ParameterizedException {
        Exp exp = new Exp(1,2,1,8);
    }

    @Test (expected = ParameterizedException.class)
    public void test2 () throws ParameterizedException {
        Exp exp = new Exp(1,2,8,2);
        Integral<Exp> integral = new Integral<>(10,1);
    }
}