package homeWorks.homeWorkSixth;

import java.util.Scanner;

public class Task3HW6 {
    public static void main(String[] args) {
        //Напишите программу, которая считывает символы пока не встретится точка.
        // Также предусмотрите вывод количества пробелов

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите свой текст");
        String str = scan.nextLine();

        char[] chr = str.toCharArray();
        for (int i = 0; i < chr.length; i++) {
            System.out.print(chr[i]);
            if (chr[i] == '.') {
                break;
            }
        }
    }
}
