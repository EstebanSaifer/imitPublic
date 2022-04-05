import java.util.Objects;
import java.util.Scanner;

//Разработайте класс Vector3D (вектор в трехмерном пространстве).
// Вектор хранится в виде набора своих координат. Методы:
//1) конструктор без параметров (создает нулевой вектор),
//2) конструктор по координатам,
//3) конструктор по двум точкам (Point3D),
//4) длинавектора,
//5) проверка равенства с заданным вектором.

public class Vector3D {

    private double x;
    private double y;
    private double z;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Point3D startPoint = new Point3D();
        Point3D endPoint = new Point3D();

        System.out.println("Введите x начальной точки : ");
        startPoint.setX(in.nextDouble());
        System.out.println("Введите y начальной точки : ");
        startPoint.setY(in.nextDouble());
        System.out.println("Введите z начальной точки : ");
        startPoint.setZ(in.nextDouble());

        System.out.println("Введите x конечной точки : ");
        endPoint.setX(in.nextDouble());
        System.out.println("Введите y конечной точки : ");
        endPoint.setY(in.nextDouble());
        System.out.println("Введите z конечной точки : ");
        endPoint.setZ(in.nextDouble());

        Vector3D vector1 = new Vector3D (endPoint, startPoint);
        vector1.findVectorLength();

        Point3D startPointNew = new Point3D();
        Point3D endPointNew = new Point3D();



        //Введем координаты вектора для сравнения

        System.out.println("Введите координаты второго вектора : ");
        System.out.println("Введите x начальной точки : ");
        startPointNew.setX(in.nextDouble());
        System.out.println("Введите y начальной точки : ");
        startPointNew.setY(in.nextDouble());
        System.out.println("Введите z начальной точки : ");
        startPointNew.setZ(in.nextDouble());

        System.out.println("Введите x конечной точки : ");
        endPointNew.setX(in.nextDouble());
        System.out.println("Введите y конечной точки : ");
        endPointNew.setY(in.nextDouble());
        System.out.println("Введите z конечной точки : ");
        endPointNew.setZ(in.nextDouble());

        Vector3D vector2 = new Vector3D (endPointNew, startPointNew);

        if (vector1.equals(vector2)) {
            System.out.println("equals");
        }
        else {
            System.out.println("not equals");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector3D vector3D = (Vector3D) o;
        return Math.abs(vector3D.x - x) < 1e-7 && Math.abs(vector3D.y - y) < 1e-7 && Math.abs(vector3D.z - z) < 1e-7;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    void findVectorLength(){
        System.out.println("Длина вектора : " + Math.sqrt( Math.pow(getX(), 2) + Math.pow(getY(), 2) + Math.pow(getZ(), 2)));
    }


    //конструктор по 2 точкам
    Vector3D(Point3D endPoint, Point3D startPoint){
        x = Math.abs(endPoint.getX() - startPoint.getX());
        y = Math.abs(endPoint.getY() - startPoint.getY());
        z = Math.abs(endPoint.getZ() - startPoint.getZ());
    }

    //конструктор с параметрами
    Vector3D (double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //конструктор без параметров
    Vector3D() {
        x = 0.0;
        y = 0.0;
        z = 0.0;
    }

    Vector3D(Vector3D vector) {
        this.setX(vector.getX());
        this.setY(vector.getY());
        this.setZ(vector.getZ());
    }

    double getX() { return x ; }

    void setX(double x) { this.x = x; }

    double getY() { return y; }

    void setY(double y) { this.y = y; }

    double getZ() { return z; }

    void setZ(double z) { this.z = z; }

}