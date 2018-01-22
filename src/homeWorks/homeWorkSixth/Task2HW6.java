package homeWorks.homeWorkSixth;

import java.util.Scanner;

public class Task2HW6 {
    public static void main(String[] args) {
//        Task2 Пользователь вводит  ФИО  с клавиатуры  нижнем регистре.
//        Написать программу которая преобразует строку чтобы первый символ будет заглавной каждого слова.
//        К примеру  "иванов иван"
//        Вывод на экран "Иванов Иван"

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите свое ФИО");

        String str = scan.nextLine();

        System.out.println("Откоррректированное ФИО");

        String[] splitStringToArray = str.split(" ");

        for (int i = 0; i < splitStringToArray.length; i++) {
            String newstr = splitStringToArray[i].substring(0, 1).toUpperCase() + splitStringToArray[i].substring(1);
            System.out.print(newstr + " ");
        }

        scan.close();
    }
}
