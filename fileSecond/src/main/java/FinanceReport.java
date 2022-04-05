//Создайте класс FinanceReport, содержащий массив платежей, ФИО составителя отчета,
// дату создания отчета. Методы: получение количества платежей, доступ к i- му платежу (на чтение и запись).

import java.util.Arrays;
import java.util.Objects;

public class FinanceReport {

    private Payment[] payments;
    private String name;
    private int dayOfCreation;
    private int monthOfCreation;
    private int yearOfCreation;

    //конструктор
    public FinanceReport(Payment[] payments, String name, int dayOfCreation, int monthOfCreation, int yearOfCreation) {
        this.payments = payments;
        this.name = name;
        this.dayOfCreation = dayOfCreation;
        this.monthOfCreation = monthOfCreation;
        this.yearOfCreation = yearOfCreation;
    }

    //конструктор копирования
    public FinanceReport(FinanceReport financeReport) {
        payments = new Payment[financeReport.payments.length];
        for(int i = 0; i < financeReport.payments.length; i++){
            payments[i] = new Payment(financeReport.getPayment(i));
        }
        this.name = financeReport.name;
        this.dayOfCreation = financeReport.dayOfCreation;
        this.monthOfCreation = financeReport.monthOfCreation;
        this.yearOfCreation = financeReport.yearOfCreation;
    }

    public Payment getPayment(int i){
        return payments[i];
    } //i-ый платеж

    public Payment[] getPayments() {
        return payments;
    }

    public String getName() {
        return name;
    }

    public int getDayOfCreation() {
        return dayOfCreation;
    }

    public int getMonthOfCreation() {
        return monthOfCreation;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }


    public void setPayments(Payment[] payments) {
        this.payments = payments;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDayOfCreation(int dayOfCreation) {
        this.dayOfCreation = dayOfCreation;
    }

    public void setMonthOfCreation(int monthOfCreation) {
        this.monthOfCreation = monthOfCreation;
    }

    public void setYearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    //получение количества платежей
    static public int theValueOfPayment (int[] payments) {
        int y = 0;
        for(int i = 0; i < payments.length; i++) {
            y++;
        }
        return y;
    }

    //доступ к i- му платежу (на чтение и запись).
    public static int[] iElement(int[] payments, int iPayment, int valueOfPayment) {
            payments[iPayment - 1] = valueOfPayment; // новое значение платежа i
            System.out.println("Новый массив платежей :");
            for (int i = 0; i < payments.length; i++) {
                System.out.println(payments[i] + " ");
        }
        return payments;
    }


    //вывод информации
    public static String toString(String name, int dayOfCreation, int mounthOfCreation, int yearOfCreation, int[] payments) {
        String str = "";
        str += String.format("[Автор = %s, дата = 0%d.0%d.%d, Платежи : \n " ,
                name, dayOfCreation, mounthOfCreation, yearOfCreation );
        for (int i = payments.length - 1 ; i >= 0; i--) {
            str += String.format("[Плательщик : %s, дата : 0%d.0%d.%d , сумма = %d руб, %d коп.] \n" ,
                    name, dayOfCreation , mounthOfCreation, yearOfCreation, payments[i] / 100 , payments[i] % 100);
        }
        return str;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FinanceReport that = (FinanceReport) o;
        return dayOfCreation == that.dayOfCreation && monthOfCreation == that.monthOfCreation && yearOfCreation == that.yearOfCreation && Arrays.equals(payments, that.payments) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, dayOfCreation, monthOfCreation, yearOfCreation);
        result = 31 * result + Arrays.hashCode(payments);
        return result;
    }
}
