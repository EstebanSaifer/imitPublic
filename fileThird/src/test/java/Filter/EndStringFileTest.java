package Filter;

import org.junit.Test;

import static org.junit.Assert.*;

public class EndStringFileTest {

    @Test
    public void apply () {
        String str = "Мама мыла раму";
        EndStringFile q1 = new EndStringFile("раму");
        EndStringFile q2 = new EndStringFile("666");
        assertTrue(q1.apply(str));
        assertTrue(q1.apply(str));
    }
}