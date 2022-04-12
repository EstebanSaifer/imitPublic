public class Addition implements Interface{

    private double a;
    private double b;
    private double inf;
    private double sup;

    public Addition(double a, double b, double inf, double sup) throws ParameterizedException {
        if (sup > inf ) throw new ParameterizedException("problem1 ");
        this.a = a;
        this.b = b;
        this.inf = inf;
        this.sup = sup;
    }

    @Override
    public double valueOfFunction(double x) throws ParameterizedException {
        if(x < sup || x > inf) throw new ParameterizedException("problem0");
        return a*x+b;
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
