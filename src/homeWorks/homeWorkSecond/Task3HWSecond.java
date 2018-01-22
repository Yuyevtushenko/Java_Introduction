package homeWorks.homeWorkSecond;

import java.util.Random;

public class Task3HWSecond {
    public static void main(String[] args) {

        for (int count = 0; count<20; count++){
        Random  random = new Random();
        int number = random.nextInt(101-10)+10;
        if(number%2==0){
            System.out.println(number);
        }
    }
}
}
