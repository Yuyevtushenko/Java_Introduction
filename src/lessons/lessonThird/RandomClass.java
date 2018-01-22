package lessons.lessonThird;

import java.util.Random;

/**
 * Created by Hillel8 on 29.11.2017.
 */
public class RandomClass {

    public static void main(String[] args) {

        Random random = new Random();

        int a = random.nextInt(50-20) + 20; //+20 - ороче последнее , это минимальное число рандома
        System.out.println(a);
    }
}
