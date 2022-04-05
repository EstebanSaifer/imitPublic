import java.util.Scanner;

public class Second {
    //второе и третье задание
        public static void main(String[] args) {
            Scanner one = new Scanner(System.in);
            double one1 = one.nextDouble();
            double two1 = one.nextDouble();
            double three1 = one.nextDouble();

            System.out.println("Произведение: " + one1 * two1 * three1);

            System.out.println("Среднее арифметическое: " + (one1 * two1 * three1 / 3) );

            double wreme;

            if (two1 > three1){
                wreme = three1;
                three1 = two1;
                two1 = wreme;
            }
            if (one1 > three1){
                wreme = three1;
                three1 = one1;
                one1 = wreme;
            }
            if (one1 > two1) {
                wreme = two1;
                two1 = one1;
                one1 = wreme;
            }
            System.out.println( one1 + " "+ two1 + " " + three1 );
        }
}
