// Создайте maven-проект. В нем создайте класс для хранения квадратного
// трехчлена с методом решения соответствующего квадратного уравнения
// (параметров нет, а результат — массив корней). Напишите набор unit-тестов для этого класса.

import static java.lang.Math.sqrt;

public class SquareTrinomial {

    private double a, b;
    private double c;
    private double[] array;

    public SquareTrinomial(double a, double b, double c, double[] array) {
        if (a == 0) throw new IllegalArgumentException("Это не квадратное уравнение!!!");
        this.a = a;
        this.b = b;
        this.c = c;
        this.array = array;
    }

    public double[] squareTrinometralResult() {
        double D = b * b - 4 * a * c;
        if (D >= 0) {
            array[0] = (-b + sqrt(D)) / (2 * a);
            array[1] = (-b - sqrt(D)) / (2 * a);
            return array;
        } else throw new IllegalArgumentException("Дискриминант меньше нуля, корней нет.");
    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double[] getArray() {
        return array;
    }

    public void setArray(double[] array) {
        this.array = array;
    }
}