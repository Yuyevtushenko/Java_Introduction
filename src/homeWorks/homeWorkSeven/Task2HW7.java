package homeWorks.homeWorkSeven;

import java.util.Arrays;

import static homeWorks.homeWorkSeven.Task1HW7.task1;

public class Task2HW7 {
//    Создать метод, который будет выводить указанный массив на экран в строку.
// С помощью созданного метода и метода из предыдущей задачи заполнить 5 массивов из 10 элементов
// каждый случайными числами и вывести все 5 массивов на экран, каждый на отдельной строке.
public static void main(String[] args) {
    int z = 10;
    int x = 20;
    int arr[] = new int[20];

    for (int i=0; i<5; i++){
        for (int j=0; j<arr.length; j++){
            arr[j] = task1(z, x);
        }
        printArray(arr);
    }

}
  public static void printArray(int[] arr){
      System.out.println(Arrays.toString(arr));
  }

}
