import java.util.Scanner;

public class Vector3DProcessor {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Vector3D vector1 = new Vector3D ();
        Vector3D vector2 = new Vector3D ();

        System.out.println("Введите координаты вектора 1 : ");

        vector1.setX(in.nextDouble());
        vector1.setY(in.nextDouble());
        vector1.setZ(in.nextDouble());

        System.out.println("Введите координаты вектора 2 : ");
        vector2.setX(in.nextDouble());
        vector2.setY(in.nextDouble());
        vector2.setZ(in.nextDouble());

        //вывод методов
        sum(vector1,vector2);
        div(vector1,vector2);
        System.out.println("Скалярное произведение : " + scalar(vector1,vector2));
        System.out.println("Проверка : " + isItCollinearno(vector1,vector2));
    }

    static Vector3D sum (Vector3D vector1, Vector3D vector2) {
        Vector3D vector3 = new Vector3D();
        vector3.setX(vector1.getX() + vector2.getX());
        vector3.setY(vector1.getY() + vector2.getY());
        vector3.setZ(vector1.getZ() + vector2.getZ());
        System.out.println("Сумма векторов : " +vector3.getX() + " " + vector3.getY() + " " + vector3.getZ());
        return vector3;
    }

    static Vector3D div (Vector3D vector1, Vector3D vector2) {
        Vector3D vector3 = new Vector3D();
        vector3.setX(vector1.getX() - vector2.getX());
        vector3.setY(vector1.getY() - vector2.getY());
        vector3.setZ(vector1.getZ() - vector2.getZ());
        System.out.println("Разность векторов : " +vector3.getX() + " " + vector3.getY() + " " + vector3.getZ());
        return vector3;
    }

    static double scalar (Vector3D vector1, Vector3D vector2) {
        Vector3D vector3 = new Vector3D();
        vector3.setX (vector1.getX() * vector2.getX());
        vector3.setY (vector1.getY() * vector2.getY());
        vector3.setZ (vector1.getZ() * vector2.getZ());
        double result = vector3.getX() + vector3.getY() + vector3.getZ();
        return result;
    }

    static Vector3D vec(Vector3D vector1, Vector3D vector2) {
        Vector3D vector3 = new Vector3D();
        vector3.setX(vector1.getY() * vector2.getZ() - vector1.getZ() * vector2.getY());
        vector3.setY(vector1.getX() * vector2.getZ() - vector1.getZ() * vector2.getX());
        vector3.setZ(vector1.getX() * vector2.getY() - vector1.getY() * vector2.getX());
        System.out.println("Векторное произведение : " +vector3.getX() + "i " + vector3.getY() + "j " + vector3.getZ() + "k ");
        return vector3;
    }

    static boolean  isItCollinearno (Vector3D vector1, Vector3D vector2){
        boolean res = false;
        Vector3D result = vec(vector1, vector2);
        if(Double.compare(result.getX(), 0) == 0 &&
                Double.compare(result.getY(), 0) == 0 &&
                Double.compare(result.getZ(), 0) == 0){
            res = true;
        }
        return res;
    }
}
