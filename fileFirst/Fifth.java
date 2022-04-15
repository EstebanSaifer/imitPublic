import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        double min = vvod.nextDouble();
        double max = vvod.nextDouble();
        double step = vvod.nextDouble();

        if (Double.compare(step, 0.0) == 0)
            System.out.println("Шаг равен нулю");
//        else if (step < 0) {
//            for (double i = max; i < min ||  Math.abs(i-max) < 1e-5; i += step)
//                System.out.println(i + " " + Math.sin(i) );
//        }
        else if (Double.compare(step, 0.0) > 0)
        for (double i = min; i < max  ||  Math.abs(i-max) < 1e-5; i += step) {
            System.out.println(i + " " + Math.sin(i));
        }
    }
}
