import org.junit.Test;
import static org.junit.Assert.*;

public class FinanceReportTest {

    @Test
    public void testConstructorCopy() {
        FinanceReport financeReport = new FinanceReport(new Payment[]{
                new Payment ("Катя", 1, 1, 1, 1)},
                "К", 1, 1, 1);
        FinanceReport financeReport2 = new FinanceReport(financeReport);
        assertEquals(financeReport, financeReport2);
    }

    @Test
    public void theValueOfPayment() {
        int result = FinanceReport.theValueOfPayment(new int[]{1, 2, 3, 4, 5, 6});
        assertEquals(6, result);
    }

    @Test
    public void iElement() {
        int expected[] = new int[]{1, 3, 3, 4, 5, 6};
        assertArrayEquals(expected, FinanceReport.iElement(new int[]{1, 2, 3, 4, 5, 6}, 2, 3));
    }

    @Test
    public void toStringg() {
        String result = FinanceReport.toString("Катя", 1, 2, 2020, new int[]{20270, 10090});

        assertEquals("[Автор = Катя, дата = 01.02.2020, Платежи : \n [Плательщик : Катя, дата : 01.02.2020 , сумма = 100 руб, 90 коп.] \n" +
                "[Плательщик : Катя, дата : 01.02.2020 , сумма = 202 руб, 70 коп.] \n" ,result);
        //
    }
}
