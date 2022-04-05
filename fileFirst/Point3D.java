import java.util.Objects;
import java.util.Scanner;

//1) конструктор по координатам,
//2) конструктор без параметров (создает точку – начало координат),
//3) геттеры и сеттеры,
//4) вывод точки на консоль

public class Point3D {

    private double x;
    private double y;
    private double z;

    public static void main(String[] args) {
        //вводим с консоли значения переменных

        Scanner in = new Scanner(System.in);
        System.out.println("Write x: ");
        double x = in.nextDouble();
        System.out.println("Write y: ");
        double y = in.nextDouble();
        System.out.println("Write z: ");
        double z = in.nextDouble();

        System.out.println("x = " +  x + " y = " + y + " z = " + z );

        Point3D a = new Point3D();
        Point3D b = new Point3D();

        if (a == b) {
            System.out.println("==");
        }
        if (a.equals(b)) {
            System.out.println("equals");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point3D point3D = (Point3D) o;
        return Double.compare(point3D.x, x) == 0 && Double.compare(point3D.y, y) == 0 && Double.compare(point3D.z, z) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    //конструктор по координатам
    public Point3D (double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //конструктор без параметра (создает точку - начало координат)
    public Point3D() {
        x = 0.0;
        y = 0.0;
        z = 0.0;
    }

    //геттеры
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

}
