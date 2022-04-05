import java.util.Scanner;

public class Arr {

    public static void main(String[] args) {
        int[] array;
        System.out.println("Введите колличество элементов в массиве : ");
        Scanner in = new Scanner (System.in);
        int inputInformation = in.nextInt();
        array = new int[inputInformation];

        arrayIn(inputInformation, array);

        arrayOut(inputInformation, array);

        System.out.println("\n" + "Сумма элементов массива : \n" + arraySum(array));

        System.out.println("Количество четных чисел в массиве : \n" + arrayEvenNumbers(inputInformation, array));

        System.out.println("Введите значение точки a : ");
        int a = in.nextInt();
        System.out.println("Введите значение точки b : ");
        int b = in.nextInt();

        System.out.println("Количество элементов массива, принадлежащих отрезку [a; b] : ");
        System.out.println(arraySegment(a, b, inputInformation, array));

        arrayPlus(inputInformation, array);

        arrayReverse(inputInformation, array);
    }

    // Ввод элементов массива с клавиатуры.
    public static void arrayIn(int inputInformation, int[] array){
        for (int i = 0; i < inputInformation; i++) {
            Scanner in = new Scanner (System.in);
            System.out.println("Введите элемент " + i + " : ");
            array[i] = in.nextInt();
        }
    }

    // Вывод массива на консоль.
    public static void arrayOut(int inputInformation, int[] array){
        System.out.println("Элементы массива : ");
        for (int i = 0; i < inputInformation; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // Сумма всех элементов массива.
    public static int arraySum(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    // Количество четных чисел в массиве.
    public static int arrayEvenNumbers (int InputInformation, int[] array){
        int even = 0;
        for (int i = 0; i < InputInformation; i++)
            if ((array[i] % 2) == 0) {
                even += 1;
            }
        return even;
    }

    // Количество элементов массива, принадлежащих отрезку [a; b].
    public static int arraySegment (int a, int b, int InputInformation, int[] array) {
        int segmentNumbers = 0;
        if (a > b) {
            int t = a;
            a = b;
            b = t;
        }
        for (int i = 0; i < InputInformation; i++) {
            if (array[i] >= a && array[i] <= b){
                segmentNumbers += 1;
            }
        }
        return segmentNumbers;
    }

    // Проверка: все ли элементы массива положительные.
    public static void arrayPlus(int inputInformation, int[] array) {
        int result = 0;
        for (int i = 0; i < inputInformation; i++)
            if (array[i] < 0) {
                result = -1;
            }
        if (result == 0)
            System.out.println("Все элементы массива положительные.");
        else
            System.out.println("Есть отрицательные элементы в массиве.");
    }

    // Переставьте в массиве элементы в обратном порядке.
    public static void arrayReverse (int inputInformation, int[] array){

         int[] newArray = new int[inputInformation];

         inputInformation -= 1;

         for (int i = 0; i <= inputInformation; i++) {
             newArray[i] = array[inputInformation - i];
             System.out.println(newArray[i] + " ");
         }
         array = newArray;
    }
}
