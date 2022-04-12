public class SquareTrinomiall {
    //import static java.lang.Math.sqrt;

        private double a;
        private double b;
        private double c;

        public SquareTrinomiall(double a, double b, double c) throws SquareException {
            if (a == 0) throw new SquareException("Это не квадратное уравнение!!!");
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double[] squareTrinometralResult() throws SquareException {

            double D = b * b - 4 * a * c;
            double[] array = null;

            if (D >= 0) {
                array = new double[2];
                array[0] = (-b - Math.sqrt(D)) / (2 * a);
                array[1] = (-b + Math.sqrt(D)) / (2 * a);
                return array;
            } else System.out.println("Дискриминант меньше нуля, корней нет."); return array;
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

}
