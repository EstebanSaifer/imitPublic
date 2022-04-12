public class SumOfFunc <T extends Interface> implements FuncOfOneArg<T>{

    private double inf;
    private double sup;

    public SumOfFunc(double inf, double sup) {
        this.inf = inf;
        this.sup = sup;
    }

    //сумма значений функции на концах отрезка и в его середине,
    @Override
    public double calc(T xFunc) throws ParameterizedException {
        if (sup > xFunc.limitInf() || inf < xFunc.limitSup()) throw new ParameterizedException("problem0");
        return xFunc.valueOfFunction(xFunc.limitInf()) + xFunc.valueOfFunction(xFunc.limitSup())
                + (xFunc.valueOfFunction(xFunc.limitInf())+ xFunc.valueOfFunction(xFunc.limitSup())) / 2 ;
    }

}
