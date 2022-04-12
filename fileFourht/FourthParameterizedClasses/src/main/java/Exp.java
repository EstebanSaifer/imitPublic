public class Exp implements Interface {

    private double a;
    private double b;
    private double inf;
    private double sup;


    public Exp (double a, double b, double inf, double sup) throws ParameterizedException {
        if (sup > inf ) throw new ParameterizedException("problem1 ");
        this.a = a;
        this.b = b;
        this.inf = inf;
        this.sup = sup;
    }

//    @Override
//    public void exception(double arg) throws ParameterizedException {
//        if (arg < sup || arg < inf) throw new ParameterizedException("problem0");
//    }

    @Override
    public double valueOfFunction(double x) throws ParameterizedException {
        if (x < sup || x > inf) throw new ParameterizedException("problem0");
            return a*Math.exp(x)+b;
    }

    @Override
    public double limitSup() {
        return sup;
    }

    @Override
    public double limitInf() {
        return inf;
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

    public double getInf() {
        return inf;
    }

    public void setInf(double inf) {
        this.inf = inf;
    }

    public double getSup() {
        return sup;
    }

    public void setSup(double sup) {
        this.sup = sup;
    }
}

