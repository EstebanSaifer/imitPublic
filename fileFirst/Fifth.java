import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        double min = vvod.nextDouble();
        double max = vvod.nextDouble();
        double step = vvod.nextDouble();

        if (step == 0)
            System.out.println("Шаг равен нулю");
        else if (step < 0) {
            for (double i = max; i >= min; i += step)
                System.out.println(i + " " + Math.sin(i) );
        }
        else if (step > 0)
        for (double i = min; i <= max; i += step) {
            System.out.println(i + " " + Math.sin(i) );
        }
    }
}
