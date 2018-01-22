package lessons.lessonThird;

/**
 * Created by Hillel8 on 29.11.2017.
 */
public class WhileAndFor {
    public static void main(String[] args) {
        int i = 0;

        String firstString = "First";
        String secondString = "Second";
        String thierdString = "Third";
        String fourthString = "Fourth";
        String fifthString = "Fifth";

        /*
        while (i<5){                            //Отрабатывает цикл до момента пока удоливторено условие в скобках, как только не удаливторено , то отрабатывать не будет
            System.out.println(i);               //Если условие всегда удолитворительно , то будет бесконенчно отрабатывать. Количество раз называется итерациец
            i++;
        }


        while (i < 5) {
            if (i == 0) {
                System.out.println(firstString + "Test.txt and i = " + i); //ctrl + d add line, ctrl + y delete line
            } else if (i == 1) {
                System.out.println(secondString + "Test.txt and i = " + i);
            } else if (i == 2) {
                System.out.println(thierdString + "Test.txt and i = " + i);
            } else if (i == 3) {
                System.out.println(fourthString + "Test.txt and i = " + i);
            } else {
                System.out.println(fifthString + "Test.txt and i = " + i);
            }
            i++;
        }


        int qwerty = 2;
        do {
            System.out.println("Do whileAndFor Test" + qwerty);
            qwerty++;
        } while (qwerty < 5);


        int q = 0;
        String win = "You win!";

        while (q < 5) {
            System.out.println("This is While Lattery");
            int result = (int) (Math.random() * 5);
            if (result == 3) {
                System.out.println(win);
                break;
            } else {
                System.out.println("Try another day!");
            }
            q++;
        }


        for (int j=0; j<3; j++){                  // 1 - инициалицая переменных, 2-условие, 3 - шаг итериции
            System.out.println("This is: " + j);

        }

*/
        int r;
        for(r=5; r>0; r--){
            System.out.println("This is new " + r);
        }
        System.out.println(r);
    }

//
//        String x = "Java";
//        int f = x.length();
//        System.out.println(f);
//
//        for (int j = 0; j < f; j++) {
//            System.out.print("+ ");
    //   }
    }


