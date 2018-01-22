package homeWorks.homeWorkSecond;

import java.util.Scanner;

public class Task4HWSecond {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите любое целое число");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println("Вы ввели четное число: " + number);
            }  {
                System.out.println("Вы ввели нечетное число: " + number);
            }

        } else {
            System.out.println("Вы ввели не целое число");
        }
        scanner.close();
    }
}
