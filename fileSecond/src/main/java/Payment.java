// Создайте класс Payment (платеж) с полями:
// ФИО человека (одна строка), дата платежа —
// число, месяц и год (целые числа), сумма платежа
// (целое число — сумма в копейках). Напишите необходимые
// конструкторы, геттеры/сеттеры, методы equals, hashCode, toString.

import java.util.Objects;

    public class Payment {

        private String nameFL;
        private int dayOfPay;
        private int monthOfPay;
        private int yearOfPay;
        private double sumOfPay;

    public Payment (Payment payment) {
    this.nameFL = payment.nameFL;
    this.dayOfPay = payment.dayOfPay;
    this.monthOfPay = payment.monthOfPay;
    this.yearOfPay = payment.yearOfPay;
    this.sumOfPay = payment.sumOfPay;
    }

    public Payment(String nameFL, int dayOfPay, int monthOfPay, int yearOfPay, double sumOfPay) {
        this.nameFL = nameFL;
        this.dayOfPay = dayOfPay;
        this.monthOfPay = monthOfPay;
        this.yearOfPay = yearOfPay;
        this.sumOfPay = sumOfPay;
    }

    public String getNameFL() {
        return nameFL;
    }

    public int getDayOfPay() {
        return dayOfPay;
    }

    public int getMonthOfPay() {
        return monthOfPay;
    }

    public int getYearOfPay() {
        return yearOfPay;
    }

    public double getSumOfPay() {
        return sumOfPay;
    }


    public void setNameFL(String nameFL) {
        this.nameFL = nameFL;
    }

    public void setDayOfPay(int dayOfPay) {
        this.dayOfPay = dayOfPay;
    }

    public void setMonthOfPay(int mounthOfPay) {
        this.monthOfPay = mounthOfPay;
    }

    public void setYearOfPay(int yearOfPay) {
        this.yearOfPay = yearOfPay;
    }

    public void setSumOfPay(int sumOfPay) {
        this.sumOfPay = sumOfPay;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return dayOfPay == payment.dayOfPay && monthOfPay == payment.monthOfPay
                && yearOfPay == payment.yearOfPay && sumOfPay == payment.sumOfPay && nameFL.equals(payment.nameFL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameFL, dayOfPay, monthOfPay, yearOfPay, sumOfPay);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "nameFL='" + nameFL + '\'' +
                ", dayOfPay=" + dayOfPay +
                ", monthOfPay=" + monthOfPay +
                ", yearOfPay=" + yearOfPay +
                ", sumOfPay=" + sumOfPay +
                '}';
    }
}
