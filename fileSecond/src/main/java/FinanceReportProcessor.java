// Создайте новый класс FinanceReportProcessor, в котором реализуйте статические методы,
// все методы возвращают объект класса FinanceReport:
//1) получение платежей всех людей, чья фамилия начинается на указанный символ (символ — входной параметр),
//2) получение всех платежей, размер которых меньше заданной величины.

public class FinanceReportProcessor {

    public static FinanceReport firstTask1 (FinanceReport financeReport, char symbol) {
        int count = 0;
        for (Payment payment : financeReport.getPayments()) { // for each
            if (payment.getNameFL().charAt(0) == symbol) {
                count++;
            }
        }
        Payment[] payments = new Payment[count];
        int i = 0;
        for (Payment payment : financeReport.getPayments()) {
            if (payment.getNameFL().charAt(0) == symbol) {
                payments[i] = payment;
                i++;
            }
        }
        return new FinanceReport (payments, financeReport.getName(), financeReport.getDayOfCreation(), financeReport.getMonthOfCreation(),
                financeReport.getYearOfCreation());
    }

    //2) получение всех платежей, размер которых меньше заданной величины.
    public static FinanceReport secondTask (FinanceReport financeReport, int sum) {
        int count = 0;
        for(Payment payment : financeReport.getPayments()) {
            if (payment.getSumOfPay() < sum) {
                count++;
            }
        }
        Payment[] payments = new Payment[count];
        int i = 0;
        for (Payment payment : financeReport.getPayments()) {
            if (payment.getSumOfPay() < sum) {
                payments[i] = payment;
                i++;
            }
        }
        return new FinanceReport (payments, financeReport.getName(), financeReport.getDayOfCreation(), financeReport.getMonthOfCreation(),
                financeReport.getYearOfCreation());
    }

    //1) на входе строка с датой в формате dd.mm.yy, вычислите суммарный платеж на
    //эту дату,
//    public static double sumOfPayOnDay (FinanceReport financeReport, String date) {
//        double sum = 0;
//
//        String[] dateRightFormat = ".".split(date);
//
//        for(Payment payment : financeReport.getPayments()) {
//            if(payment.getDayOfPay() == Integer.parseInt(dateRightFormat[0]) && payment.getMonthOfPay() == Integer.parseInt(dateRightFormat[1])
//            && payment.getYearOfPay() == Integer.parseInt(dateRightFormat[2])) {
//                sum += payment.getSumOfPay();
//            }
//        }
//
//        return sum;
//    }
}
