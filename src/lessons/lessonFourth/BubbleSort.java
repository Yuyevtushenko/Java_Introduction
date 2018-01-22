package lessons.lessonFourth;

/**
 * Created by Hillel8 on 06.12.2017.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {5, 9, 6, 7, 2};

        //Внешний цикл каждый раз сокращает фрагмент массива так как внутренний цикл каждый раз ставит в конец фрагмента максимальный эелмент
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                //равниваем элементы попарно, если они имеют неправильный порядок, то меняем местами
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

    }
}