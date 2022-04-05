 //StringProcessor

public class StringProcessor {

    // На входе строка s и целое число N. Выход — строка, состоящая из N копий
    // строки s, записанных подряд. При N = 0 результат — пустая строка. При N < 0 выбрасывается исключение.

    public static String firstTask(String s, int N) {
        String newS = "";
        if (N < 0) {
            throw new IllegalArgumentException("Параметр меньше нуля.");
        }
        for (int i = 0; i < N; i++) {
            newS = newS + s;
        }
        return newS;
    }

    // На входе две строки. Результат — количество вхождений второй строки в первую.
    // Если вторая строка пустая или null, выбросить исключение.

    public static int secondTask(String one, String two) {
        int i = 0;
        if (two == null || two.equals("")) {
            throw new IllegalArgumentException("Вторая строка пустая.");
        } else  {
            while (one.contains(two)) {
                one = one.replaceFirst(two, "");
                i++;
            }
        }
        return i;
    }

    // Постройте по строке новую строку, которая получена из исходной заменой
    // каждого символа '1' на подстроку "один”, символа ‘2’ на подстроку “два” и символа ‘3’ на подстроку “три”.

    public static String thirdTask(String stroka) {
        if (stroka == null || stroka.equals("")) {
            throw new IllegalArgumentException("Cтрока пустая.");
        }
        //while (stroka.contains("1") || stroka.contains("2") || stroka.contains("3")) {
            stroka = stroka.replace("1", "one");
            stroka = stroka.replace("2", "two");
            stroka = stroka.replace("3", "three");
        //}
        return stroka;
    }

    // В строке типа StringBuilder удалите каждый второй по счету символ.
    // Должна быть модифицирована входная строка, а не порождена новая.

    public static StringBuilder fourthTask(StringBuilder str) {
        if (str == null) {
            throw new IllegalArgumentException("Cтрока пустая.");
        }
        for (int i = (str.length() - str.length() % 2 - 1); i > 0; i -= 2) {
            str.deleteCharAt(i);
        }
        return str;
    }
}