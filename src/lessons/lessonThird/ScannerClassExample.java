package lessons.lessonThird;

import java.util.Scanner;

/**
 * Created by Hillel8 on 29.11.2017.
 */
public class ScannerClassExample {

    public static void main(String[] args) {

        Scanner scanInt = new Scanner(System.in); //систем ин , говорим о том. что будем вводить даннные с клавиатуры
        Scanner scanString = new Scanner(System.in);

       /*
        System.out.println("Введите любое число");
        int number = scanInt.nextInt();
        System.out.println("Вы ввели число " + number);


        System.out.println("Ввведите любое целое число еще раз");
        if (scanInt.hasNextInt()) {                   //hasNextInt промверяет корректность по типу вводимых данных переменной
            int number2 = scanInt.nextInt();
            System.out.println("Вы ввели число " + number2);
        } else {
            System.out.println("Выввели не число или не целое число");
        }


        System.out.println("Введите любую фразу: ");
        String str = scanString.nextLine();
        System.out.println("Вы ввели: " + str);


        System.out.println("Введите л.бое дробное число: ");
        double number3 = scanInt.nextDouble();
        System.out.println("ы ввели число: " + number3);
*/
        System.out.println("Введите любое дробное число: ");
        if (scanInt.hasNextDouble()) {
            double number4 = scanInt.nextDouble();
            System.out.println("Вы ввели чсило: " + number4);
        } else {
            System.out.println("Вы ввели не число");
        }

        scanInt.close();
        scanString.close(); // Закрываем сканер, так как образуется поток, который занимает память

    }

}

