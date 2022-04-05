import java.util.Scanner;

public class Fourth {

        public static void main(String[] args) {
            // вводим значение переменных с консоли и обьявляем их
            Scanner vvod = new Scanner(System.in);
            double a = vvod.nextDouble();
            double b = vvod.nextDouble();
            double c = vvod.nextDouble();

            double disk = (b * b) - (4 * a * c);

            if (disk > 0){
                double plus = (-b + Math.sqrt(disk)) / (2 * a);
                double minus = (-b - Math.sqrt(disk)) / (2 * a);
                System.out.println("Корни разные: ");
                System.out.println(plus);
                System.out.println(minus);
            }
            else if (disk == 0){
                double both = -b / (2 * a);
                System.out.println("Корни одинаковые: " + both);
            }
            else {
                System.out.println("Корней нет.");
            }
        }
    }

