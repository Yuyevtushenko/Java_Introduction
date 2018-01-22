package homeWorks.homeWorkSecond;

import java.util.Scanner;

public class Task5HWSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите любых 2 целых число");

        if (scanner.hasNextInt()) {
            int number1 = scanner.nextInt();
            if (scanner.hasNextInt()) {
                int number2 = scanner.nextInt();
                int sum = number1 + number2;
                System.out.println("Cумма ваших чисел: " + sum);
            } else {
                System.out.println("Вы ввели некорректные данные");
            }
        } else
        {
            System.out.println("Вы ввели некорректные данные");
        }
        scanner.close();
    }
}

