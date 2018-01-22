package lessonSecond;

/**
 * Created by Hillel8 on 26.11.2017.
 */
public class Operators {
    public static void main (String[] args) {
        int x = 5;
        int y = x * 7;
        System.out.println(y);

        y += x;
        y *= x;
        y -= x;
        y /= x;

        int test = 10;

        //||рефиксный инкримент разу выполняется инкриментация с переменной
        ++test;

        //Постфиксный инкримент сначала левые штуки выполняются, а потом уже добавляется единица
        test++;

        //Префиксный дикримент
        --test;

        //ПОстфиксный дикримент также только на единицу меньше, а не больше
        test--;

        int a = 3;
        int b = 3;
        int testPre = 15 / 3 + ++a + ++a;
        System.out.println("testPre = " + testPre);

        int testPost = 15 / 3 + b++ + b++;
        System.out.println("testPost = " + testPost + " but b is now " + b);

        int testNew = 15 / 3 + b;
        System.out.println(testNew);

        int increment = 3;
        int decrement = 3;
        increment = (5 + ++increment) + increment++;
        System.out.println("Increment result: " + increment);


        System.out.println("Decrement sum result: " + (--decrement + decrement--));
        System.out.println("Decrement result: " + decrement);

        int q = 10;
        //После этой операции  результат = остаток(деление по модулю )
        System.out.println(q % 3);
        System.out.println(q % 2);

        int xl = 4;
        int ql = 8;
        int yl = 6;

        if (xl != ql) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (xl > ql && yl < xl) {

            System.out.println("Hello");
        } else {
            System.out.println("World");
        }

        //Пропускаем скобки после иф , если по одной строке в ифе и елсе, если больше то нужны фигурные скобки

        if (xl > ql || yl > xl)

            System.out.println("Hello");
        else
            System.out.println("World");

        //Тернарный оператор
        String str;
        str = (xl < ql) ? String.valueOf(5 + 3) : "World";
        System.out.println(str);

        int month = 3;

        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Spring");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Summer");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Autumn");
        }
        else{
            System.out.println("There is no such month number");
        }



        int first = 10; int second = 20; int third = 5;

        if (first >= second && first>=third){
            System.out.println("First one is bigger!");
        }else if (first == second){
            System.out.println("First equals Second");
        }else if (second>first){
            System.out.println("Second one is bigger one!");
        }else {
            System.out.println("Third one is bigger one!");
        }


        String qqqq = "true";
        Boolean bool = new Boolean("true");//new Boolean(qqqq)
        System.out.println(bool);

        System.out.println(true&&true);
        System.out.println(true&&false);
        System.out.println(false&&false);

        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(false||false);


        Character xz = 'C';
        System.out.println("?" + Character.isLowerCase(xz));

        int increment1 = 5;
        int decrement1 = 6;
        int test1;

        test1 = --decrement1 + ++increment1 + increment1++;
        System.out.println(test1);

        increment1= --decrement1 + ++increment1 + increment1++;
        System.out.println(increment1);
    }

}
