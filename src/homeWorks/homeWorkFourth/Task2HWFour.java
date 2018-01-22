package homeWorks.homeWorkFourth;

public class Task2HWFour {
    public static void main(String[] args) {

        //Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99].
        // Вывести массив на экран.
        // После на отдельной строке вывести на экран значение максимального элемента этого массива (его индекс не имеет значения).
        int array[][] = new int[5][8];

        System.out.println("Віводим двухмерній массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Индекс: " + i + " ");
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * (99 - (-99) + 1) + (-99));
                System.out.print("[" + array[i][j] + "]");
            }
            System.out.println();
        }


        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j<array[i].length; j++) {
                    if (array[i][j] > max) {
                        max = array[i][j];
                    }
                }
            }
        System.out.println("Максимальное число в массиве: " + max);
        }

    }
