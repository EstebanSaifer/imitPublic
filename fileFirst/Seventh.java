import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        double x = vvod.nextDouble();
        double eps = vvod.nextDouble();

        int count = 1;
        double temp = x;
        double t = 1.0;

        while ((Math.abs(temp) >= 0) && ( eps >= 0)) {
            t += temp;
            count ++;
            temp *= x / count;
        }
        System.out.println(t);
    }
}
