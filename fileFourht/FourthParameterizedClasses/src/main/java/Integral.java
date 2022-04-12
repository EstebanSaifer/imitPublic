public class Integral <T extends Interface> implements FuncOfOneArg<T> {
    //определенный интеграл на отрезке [a; b] (пределы интегрирования хранятся как поля и
    //устанавливаются конструктором, если область определения функции не содержится в [a;b],
    // то выбрасывается исключение), интегрирование производить методом прямоугольников.

    private double left;
    private double right;

    public Integral(double left, double right) throws ParameterizedException {
        if (left > right) throw new ParameterizedException("problem0");
        this.left = left;
        this.right = right;
    }

    @Override
    public double calc(T xFunc) throws ParameterizedException {
        if (left > xFunc.limitInf() || right < xFunc.limitSup()) throw new ParameterizedException("problem 1");

        int n = 100;
        double result = 0.0;

        double d = Math.abs(right - left) / n;
        for (int i = 0; i < n; i++) {
            result += xFunc.valueOfFunction(left + i * d + d / 2) * d;
        }
        return result;
    }
}
