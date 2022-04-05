package Filter;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContainsStringFillerTest {

    @Test
    public void apply () {
        String str = "Мама мыла раму";
        ContainsStringFiller q1 = new ContainsStringFiller("мыла");
        ContainsStringFiller q2 = new ContainsStringFiller("666");
        assertTrue(q1.apply(str));
        assertTrue(q1.apply(str));
    }
}