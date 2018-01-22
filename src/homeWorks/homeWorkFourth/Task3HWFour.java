package homeWorks.homeWorkFourth;

public class Task3HWFour {

    public static void main(String[] args) {
        //Создать двумерный массив из 6 строк по 7 столбцов
        // в каждой из случайных целых чисел из отрезка [0;9].
        // Вывести массив на экран. Преобразовать массив таким образом, чтобы на первом месте в каждой строке стоял её наибольший элемент.
        // При этом изменять состав массива нельзя, а можно только переставлять элементы в рамках одной строки.
        // Порядок остальных элементов строки не важен (т.е. можно соврешить только одну перестановку, а можно отсортировать по убыванию каждую строку).
        // Вывести преобразованный массив на экран.

        int arr[][] = new int[6][7];

        System.out.println("Выводим двухмерный массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            System.out.print("Индекс: " + i + " ");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
                System.out.print("[" + arr[i][j] + "]");
            }
        }

        System.out.println();

        System.out.println("Выводим двухмерный массив : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            System.out.print("Индекс: " + i + " ");
            for (int j = arr[i].length - 1; j >= 0; j--) {
                for (int g = 0; g < j; g++) {
                    if (arr[i][g] > arr[i][g + 1]) {
                        int tmp = arr[i][g];
                        arr[i][g] = arr[i][g + 1];
                        arr[i][g + 1] = tmp;
                    }
                }
                System.out.print("[" + arr[i][j] + "]");

            }
        }

    }
}
