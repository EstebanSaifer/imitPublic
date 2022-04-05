

// Разработайте класс Vector3DArray (массив трехмерных векторов). Методы:
//  1) конструктор по размеру (создает массив из нулевых векторов),
//  2) длина массива,
//  3) замена i-го элемента массива на заданный вектор,
//4) наибольшая длина вектора в массиве,
//  5) поиск заданного вектора в массиве(результат–индек с первого вхождения или
//–1, если не найден),
//  6) сумма всех векторов в массиве,
//  7) метод, который получает на вход массив вещественных чисел (коэффициентов)
//и вычисляет линейную комбинацию векторов с заданными коэффициентами. При несовпадении длин
// массивов векторов и коэффициентов, результатом считать нулевой вектор (если кто-то знает,
// как работать с исключениями, то выбросить исключение),
//8) метод, который получает на вход точку P (типа Point3D) и вычисляет массив точек, каждая из
// которых – результат сдвига точки P, на соответствующий вектор.

import java.util.Scanner;

public class Vector3DArray {
    private Vector3D[] array;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write x: ");
        double x = in.nextDouble();
        System.out.println("Write y: ");
        double y = in.nextDouble();
        System.out.println("Write z: ");
        double z = in.nextDouble();


    }

    public Vector3DArray (int n) {
        this.array = new Vector3D[n];
        for(int i = 0; i < array.length; i++){
            this.array[i] = new Vector3D();
        }
    }

    public int length (){
        return array.length;
    }

    public void replacw (Vector3D vector, int i) {
        this.array[i] = new Vector3D(vector);
    }

    public double maxVectorLength() {
        double result = -1;
        double h;

        for (Vector3D vector : array) {
            //h = vector.findVectorLength();
            //if (h > result) result = h;
        }
        return result;
    }

    public int search (Vector3D vector){
        if (vector == null) {
            System.out.println("Vector is null");
        }
        int k = -1;
        for(int i = this.array.length - 1; i >= 0; i--){
            if(vector.equals(this.array[i])){
                k = i;
            }
        }
        return k;
    }

    public Vector3D sumVectors(){
        Vector3D vector = new Vector3D(0, 0, 0);
        for(int i = 0;i < this.array.length; i++){
            vector.setX(vector.getX() + this.array[i].getX());
            vector.setY(vector.getY() + this.array[i].getY());
            vector.setZ(vector.getZ() + this.array[i].getZ());
        }
        return vector;
    }

    public Vector3D getElement(int i){
        return array[i];
    }

    public Vector3D lineCombination(double[] a){
        if(this.array.length != a.length){
            return new Vector3D();
        }
        Vector3D vector = new Vector3D();
        for(int i = 0; i < this.array.length; i++){
            vector.setX(vector.getX() + a[i] * this.array[i].getX());
            vector.setY(vector.getY() + a[i] * this.array[i].getY());
            vector.setZ(vector.getZ() + a[i] * this.array[i].getZ());
        }
        return vector;
    }

    public Point3D[] translation (Point3D point){
        Point3D[] translationArray = new Point3D[this.array.length];
        for(int i = 0; i < this.array.length; i++){
            translationArray[i] = new Point3D();
            translationArray[i].setX(point.getX() + this.array[i].getX());
            translationArray[i].setY(point.getY() + this.array[i].getY());
            translationArray[i].setZ(point.getZ() + this.array[i].getZ());
        }
        return translationArray;
    }

}
