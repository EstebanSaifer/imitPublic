import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTest {

    @Test
    public void test0 () throws ParameterizedException {
        Addition addition = new Addition(1,2,1,0);
        assertEquals(3, addition.valueOfFunction(1),0.000001);
    }
}