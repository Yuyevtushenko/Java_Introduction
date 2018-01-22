package lessonFifth;

/**
 * Created by Hillel8 on 06.12.2017.
 */
public class MultyArray {
    public static void main(String[] args) {
        int[][] multiArray = new int[2][3]; //Первый отвечает за количество строк, второй за количество колонок

        multiArray[0][0] = 12;
        multiArray[0][1] = 43;
        multiArray[0][2] = 23;

        multiArray[1][0] = 11;
        multiArray[1][1] = 7;
        multiArray[1][2] = 9;

        //Выводим размер двухмерного массива
        System.out.println("multyArray length = " + multiArray.length); //длина выводит количество строк

        for (int i = 0; i < multiArray.length; i++) {
            System.out.println("multiArray{" + i + "}length = " + multiArray[i].length);
        }

        //еребираем двухмерный массив

        System.out.println("Перебираем двухмерный массив: ");
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.println("]" + multiArray[i][j] + ']');
            }
        }
        //Альтернативный способ создания двухмерного массива

        int anotherMultiArray[][] = {{1, 2, 3}, {5, 6, 7, 4}, {9, 4, 10}, {1, 2}}; //МОжно создавать так массивы с разным количеством столбцо

        //Выводим замер одномерных массивов в двухмерном массиве

        for (int i = 0; i < anotherMultiArray.length; i++) {
            System.out.println("anotherMultiArray " + i + " length: " + anotherMultiArray[i].length);
        }

        System.out.println();

        //Сумма всех эелементов

        int sumall = 0;

        System.out.print("Выводим сумму всех элементов двухмерного массива : ");
        for (int i = 0; i < anotherMultiArray.length; i++) {
            for (int j = 0; j < anotherMultiArray[i].length; j++) {
                sumall += anotherMultiArray[i][j];
            }
        }
        System.out.println(sumall);

        System.out.println();

        System.out.print("Выводим сумму всех элементов двухмерного массива : ");
        for (int i = 0; i < anotherMultiArray.length; i++) {
            int sum =0;
            for (int j = 0; j < anotherMultiArray[i].length; j++) {
                sum += anotherMultiArray[i][j];
            }
            System.out.print(sum);
        }

        System.out.println();


       System.out.print("Выводим сумму элементов каждого массива одномерного массива в двухмерном массиве: ");
        for(int i = 0;  i<anotherMultiArray.length; i++){
           int sum2 = 0;
           for(int j = 0; j<anotherMultiArray[i].length; j++){
               sum2 += anotherMultiArray[i][j];
           }         System.out.print("[" + sum2 + "]");
       }


        System.out.println();

        System.out.print("Выводим все четные элементы двухмерного массива");
        for(int i=0; i<anotherMultiArray.length; i++){
            for(int j=0; j<anotherMultiArray[i].length; j++){
                if(anotherMultiArray[i][j]%2 == 0){
                    System.out.print("[" + anotherMultiArray[i][j] + "]");
                }
            }
        }
        System.out.println();



        int anotherMultiArray2 [][]= {{12,26,38}, {5,6,7,4}, {9,4,10}, {30,22}};
        System.out.print("Выводим все элементы массива в обратном порядке: ");

        for(int i=anotherMultiArray2.length-1; i>=0; i--){
            for(int j = anotherMultiArray2[i].length-1;j >=0; j--){
                System.out.print("[" + anotherMultiArray2[i][j]+ "]");
            }
        }
        System.out.println();
    }
}

