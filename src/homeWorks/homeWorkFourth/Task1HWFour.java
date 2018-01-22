package homeWorks.homeWorkFourth;

public class Task1HWFour {
    public static void main(String[] args) {

        //Создать двумерный массив из 8 строк по 5 столбцов
        // в каждой из случайных целых чисел из отрезка [10;99]. Вывести массив на экран.

        int array[][] = new int[8][5];

        System.out.println("Вводим двухмерный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Индекс: " + i + " ");
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * (99 - 10) + 1) + 10;
                System.out.print("[" + array[i][j] + ']');
            }
            System.out.println();
        }

    }
}
