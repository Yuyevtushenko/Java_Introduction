package lessons.lessonFirst;

/**
 * Created by Hillel8 on 22.11.2017.
 */
public class DataTypes {
    public static void main (String[] args){

        byte aByte = 12;
        System.out.println(aByte);

        short aShort = 256;
        System.out.println(aShort);

        int anInt = 128;
        System.out.println(anInt);

        //лонг надо указывать иначе  сохранит в интеджере
        long aLong = 100000000000L;
        System.out.println(aLong);


        //|лоат занимает меньше памяти (битов)
        float aFloat =  23.45f;
        System.out.println(aFloat);

        double aDouble = 2324234.434;
        System.out.println(aDouble);

        int name;
        name = 10;

        int q,w,e;
        q=1;
        w=2;
        e=4;
        System.out.println(q+w+e);

        char aChar = 'g';
        System.out.println(aChar);

        char bChar = 72;
        System.out.println(bChar);

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println(bool1);
        System.out.println(bool2);

        int x2 = 50000;
        short y2 = (short) x2;
        byte z2 = (byte) y2;

        System.out.println("short: " + y2 + " byte:"+ z2);




    }
}
