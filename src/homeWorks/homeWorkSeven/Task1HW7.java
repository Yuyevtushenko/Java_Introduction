package homeWorks.homeWorkSeven;

import java.util.Random;

public class Task1HW7 {
//    Создать статический метод,
// который будет иметь два целочисленных параметра a и b,
// и в качестве своего значения возвращать случайное целое число из отрезка [a;b].
// C помощью данного метода заполнить массив из 20 целых чисел и вывести его на экран.

    public static void main(String[] args) {

        int arr[] = new int[20];
        int z = 10;
        int x = 20;

        System.out.println("Выводим массив: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = task1(z, x);
            System.out.print("[" + arr[i] + "]");
        }


    }

    public static int task1(int a, int b) {
        int c = (int) (Math.random() * (a - b) + 1) + b;
        return c;
    }
}
