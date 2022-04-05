import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FinanceReportProcessorTest {

    @Test
    public void firstTask1() {
        Payment[] payments = {new Payment("Маша", 1, 2, 19, 123),
                              new Payment("Катя", 8, 3, 12, 345),
                              new Payment("Катерина", 2, 3, 12, 349)} ;

        FinanceReport financeReport = new FinanceReport(payments, "Коля", 2, 3, 20);

        FinanceReport financeReportByChar = FinanceReportProcessor.firstTask1(financeReport,'К');

        Assert.assertEquals (new FinanceReport(new Payment[] {
                     new Payment("Катя", 8, 3, 12, 345),
                     new Payment("Катерина", 2, 3, 12, 349)},
                    "Коля", 2, 3, 20), financeReportByChar);
    }

    @Test
    public void secondTask() {
        Payment[] payments = {new Payment("Маша", 1, 2, 19, 123),
                              new Payment("Катя", 8, 3, 12, 345),
                              new Payment("Катерина", 2, 3, 12, 349)} ;

        FinanceReport financeReport = new FinanceReport(payments, "Коля", 2, 3, 20);

        FinanceReport financeReportLength = FinanceReportProcessor.secondTask(financeReport, 300);

        Assert.assertEquals(new FinanceReport(new Payment[] {
                new Payment("Маша", 1, 2, 19, 123),},
                "Коля", 2, 3, 20), financeReportLength);
    }

//    @Test
//    public void sumOfPayOnDay() {
//
//    }
}