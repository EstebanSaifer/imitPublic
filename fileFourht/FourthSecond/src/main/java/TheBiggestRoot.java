//Создайте другой maven-проект. В нем — класс с полем типа «Квадратный
// трехчлен» из предыдущего проекта. Класс содержит метод, который возвращает
// больший корень или выбрасывает исключение, если корней нет. Напишите для него тесты.

public class TheBiggestRoot {

    public static double getRoots (double[] array) throws SquareException {
        //SquareTrinomiall squareTrinomiall = new SquareTrinomiall(1,1,0);
        if(array == null) throw new SquareException("Дискриминант меньше нуля, корней нет.");
        double maxRoot = 0;
        for(int i = 0; i < array.length; i++) {
            if(maxRoot < array[i]) {
                maxRoot = array[i];
            }
        }
        return maxRoot;
    }
}
