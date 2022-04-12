public interface Interface {
    //интерфейс для понятия «функция одного вещественного аргумента, определенная на отрезке [a; b]».

    double valueOfFunction(double x) throws ParameterizedException;

    double limitSup();
    double limitInf();
    //void exception (double res) throws ParameterizedException;
}
