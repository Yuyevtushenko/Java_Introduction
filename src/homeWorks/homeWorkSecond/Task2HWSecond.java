package homeWorks.homeWorkSecond;

import java.util.Random;

public class Task2HWSecond {
    public static void main(String[] args) {
        int count;
        for (count = 0; count < 20; count++) {
            Random random = new Random();
            int number = random.nextInt(101 - 10) + 10;
            System.out.println(number);
        }
        System.out.println("Sum of iteration: " + count);
    }
}
