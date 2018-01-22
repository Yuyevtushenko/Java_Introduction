package lessons.lessonSeven;

import java.util.Arrays;

/**
 * Created by Hillel8 on 13.12.2017.
 */
public class Methods {
    public static void main(String[] args) { //сигнатура метод есть имя и тип возвращаемых данных. Иногда ничего не возвращает(воид).
        //паблик - модификатор доступа
        //static можно вызывать по пути к данному методу

        String aa = getString();
        System.out.println(aa);
        System.out.println(getString());

        int z = 10;
        int c = 20;

        int a = sum(z, c);
        System.out.println("Symma " + a);

        int min = minMethod((int) (Math.random() * 100), (int) (Math.random() * 100));
        System.out.println("Minimalnoe znachenie = " + min);

        print("Hillel school");
        print(getString());

        division(2, 0);
        division(10, 2);

        double[] mass2 = {3.45, 5.35, 7.35, 8.67, 9.34, 23.53};
        int[] mass = {335,355,38,63,2};
        System.out.println(Arrays.toString(sortArray(mass2)));

    }

    public static String getString() {  //аблик какой доступ, статик - что можно везде использовать, стринг - что должен вернуть мой метод, название метода
        // и пустые скобки говорят о том, что мы никакие параметры туда не передаем
        String str = "new string";
        return str;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int minMethod(int n1, int n2) {
        int min;

        if (n1 > n2)
            min = n2;
        else
            min = n1;
        return min;


    }


        public static void print(String a) {
        System.out.println(a);
    }

    public static void division(int a, int b) {
        if (b == 0) {
            System.out.println("Delenie na nol nevozmozhno");
            return;
        }
        System.out.println("результат деления = " + a / b);
    }

    public static double[] sortArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    double tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

}
