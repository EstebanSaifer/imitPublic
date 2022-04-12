public class Division implements Interface{

    private double a;
    private double b;
    private double c;
    private double d;
    private double inf;
    private double sup;

    public Division(double a, double b, double c, double d, double inf, double sup) throws ParameterizedException {
        if (sup > inf) throw new ParameterizedException("problem1");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.inf = inf;
        this.sup = sup;
    }

    //квэшн на счет исключения problem00
    @Override
    public double valueOfFunction(double x) throws ParameterizedException {
        if (x < sup || x > inf) throw new ParameterizedException("problem0");
        if ((c * x + d) == 0) throw new ParameterizedException("problem00");
        return (a * x + b) / (c * x + d);
    }

    @Override
    public double limitSup() {
        return sup;
    }

    @Override
    public double limitInf() {
        return inf;
    }
}
