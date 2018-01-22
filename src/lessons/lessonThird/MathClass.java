package lessons.lessonThird;

/**
 * Created by Hillel8 on 29.11.2017.
 */
public class MathClass {

    public static void main(String[] args) {

        int x = 8;
        int y = 10;

        double q = -132;
        double c = 123.324343;

        //перед методом math ставим тип данных , в котором хотим видить результат

        System.out.println("Выводим 5 в степени 10: "  + (int)Math.pow(x,y));

        System.out.println(Math.max(x,y));

        System.out.println(Math.min(x,y));

        System.out.println(Math.abs(x));

        System.out.println(Math.abs(q)); //сегда вохвращает положителное число abs

        System.out.println(Math.round(c)); //округляет по матемитачиским правилам округления

        System.out.println("!" + Math.sqrt(x)); //озвращает только дабл, если надо другой тип переменных , то указывать возвращает квадртаный корень от аргумента

        System.out.println((int)Math.sqrt(9));

        System.out.println((int)(Math.random()*100)); //рандом числа до 100

        int result = (int)(Math.random()*(y-x)+1)+x; //+1 значит , что включительно крайние числа и возвращает всегда в типе данных дабл
        System.out.println(result);

        System.out.println(Math.PI);

        //

    }
}
