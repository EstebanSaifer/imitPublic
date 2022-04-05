import java.util.Scanner;

public class Sixth {
    //  Система двух линейных уравнений с двумя неизвестными:
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        double a1 = vvod.nextDouble();
        double b1 = vvod.nextDouble();
        double c1 = vvod.nextDouble();
        double a2 = vvod.nextDouble();
        double b2 = vvod.nextDouble();
        double c2 = vvod.nextDouble();

        double del = (a1 * b2) - (b1 * a2);

        if (del == 0) {
            if ((a1 / a2 == b1 / b2) && (a1 / a2 != c1 / c2) && (b1 / b2 != c1 / c2)) {
                System.out.println("Решений нет");
            } else if ((a1 / a2 == b1 / b2) && (b1 / b2 == c1 / c2)) {
                System.out.println("Бесконечно много решений");
            }
        }

        else {
            System.out.println("x = " + (c1 * b2 - a2 * b1) / del);
            System.out.println("y = " + (a1 * c2 - a2 * c1) / del);
        }
    }
}
