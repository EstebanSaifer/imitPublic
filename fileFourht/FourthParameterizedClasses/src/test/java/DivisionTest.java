import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivisionTest {

    @Test
    public void test0 () throws ParameterizedException {
        Division division = new Division(1,1,1,1,8,1);
        assertEquals(1,division.valueOfFunction(3),0.000001);
    }

    @Test (expected = ParameterizedException.class)
    public void test1 () throws ParameterizedException {
        Division division = new Division(1,1,1,1,8,1);
        assertEquals(1,division.valueOfFunction(10),0.000001);
    }

    @Test (expected = ParameterizedException.class)
    public void test2 () throws ParameterizedException {
        Division division = new Division(1,1,0,0,8,1);
        assertEquals(1,division.valueOfFunction(3),0.000001);
    }

    @Test (expected = ParameterizedException.class)
    public void test3 () throws ParameterizedException {
        Division division = new Division(1,1,0,0,1,8);
    }
}