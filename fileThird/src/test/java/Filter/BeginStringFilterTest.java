package Filter;

import org.junit.Test;

import static org.junit.Assert.*;

public class BeginStringFilterTest {

    @Test
    public void trueApply () {
        String str = "Мама мыла раму";
        BeginStringFilter q1 = new BeginStringFilter("Мама");
        BeginStringFilter q2 = new BeginStringFilter("мыла");
        assertTrue(q1.apply(str));
        assertTrue(q2.apply(str));
    }
}