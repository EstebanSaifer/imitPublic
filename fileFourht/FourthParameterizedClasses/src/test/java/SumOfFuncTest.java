import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfFuncTest {
    @Test
    public void test0 () throws ParameterizedException {
        Sin sin = new Sin(1,2,9,3);
        SumOfFunc<Sin> sumOfFunc = new SumOfFunc<>(8,2);
        assertEquals(-1.5456041174559028,sumOfFunc.calc(sin), 0.00001);
    }

    @Test (expected = ParameterizedException.class)
    public void test1 () throws ParameterizedException {
        Sin sin = new Sin(1,2,1,10);
        SumOfFunc<Sin> sumOfFunc = new SumOfFunc<>(8,2);
        assertEquals(-1.5456041174559028,sumOfFunc.calc(sin), 0.00001);
    }
}