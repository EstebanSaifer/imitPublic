package Filter;

import org.junit.Test;

import static org.junit.Assert.*;

public class EndStringFileTest {

    @Test
    public void apply () {
        String str = "Мама мыла раму";
        EndStringFile q1 = new EndStringFile("раму");
        assertTrue(q1.apply(str));
    }

    @Test (expected = AssertionError.class)
    public void falseApply () throws AssertionError {
        String str = "Мама мыла раму";
        ContainsStringFiller q2 = new ContainsStringFiller("666");
        assertTrue(q2.apply(str));
    }
}