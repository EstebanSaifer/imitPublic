import org.junit.Test;

import static org.junit.Assert.*;

public class SinTest {

    @Test
    public void test0 () throws ParameterizedException{
        Sin sin = new Sin (1,9,9,1);
        assertEquals( 0.8509035245341184, sin.valueOfFunction(5), 0.000001);
    }

    @Test (expected = ParameterizedException.class)
    public void test1 () throws ParameterizedException{
        Sin sin1 = new Sin(1,9,1,9);
    }

    @Test (expected = ParameterizedException.class)
    public void test2 () throws ParameterizedException{
        Sin sin2 = new Sin(1,9,1,9);
        assertEquals( 0, sin2.valueOfFunction(100), 0.000001);
    }
}