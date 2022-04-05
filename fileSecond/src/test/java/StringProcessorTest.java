import org.junit.Test;

import static org.junit.Assert.*;

public class StringProcessorTest {

    @Test
    public void firstTask() {
        String result0 = StringProcessor.firstTask("TR", 3);
        String result1 = StringProcessor.firstTask("TR", 2);
        String result2 = StringProcessor.firstTask("TR", 0);
        assertEquals("TRTRTR", result0);
        assertEquals("TRTR", result1);
        assertEquals("", result2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void exception1() {
        String result = StringProcessor.firstTask("TRTR", -1);
    }

    @Test
    public void secondTask() {
        int result0 = StringProcessor.secondTask("TrTrTr", "Tr");
        int result1 = StringProcessor.secondTask("TrTr", "Tr");
        int result2 = StringProcessor.secondTask("TrTr", "0");
        assertEquals(3, result0);
        assertEquals(2, result1);
        assertEquals(0, result2);
    }

    @Test (expected = IllegalArgumentException.class)
    public void exception2() {
        int result = StringProcessor.secondTask("Tr", "");
    }

    @Test
    public void thirdTask() {
        String result0 = StringProcessor.thirdTask("1234");
        String result1 = StringProcessor.thirdTask("123");
        String result2 = StringProcessor.thirdTask("0");
        assertEquals("onetwothree4", result0);
        assertEquals("onetwothree", result1);
        assertEquals("0", result2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void exception3() {
        String result = StringProcessor.thirdTask("");
    }

    @Test
    public void fourthTask() {
        String result0 = StringProcessor.fourthTask(new StringBuilder("1234567890")).toString();
        String result1 = StringProcessor.fourthTask(new StringBuilder("123456789")).toString();
        String result2 = StringProcessor.fourthTask(new StringBuilder("1234")).toString();
        String result3 = StringProcessor.fourthTask(new StringBuilder("12")).toString();
        String result4 = StringProcessor.fourthTask(new StringBuilder("123")).toString();
        assertEquals("13579", result0);
        assertEquals("13579", result1);
        assertEquals("13", result2);
        assertEquals("1", result3);
        assertEquals("13", result4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void exception4() {
        String result0 = StringProcessor.fourthTask(new StringBuilder("")).toString();
        String result1 = StringProcessor.fourthTask(new StringBuilder("1")).toString();
    }
}