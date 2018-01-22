package lessonsSeven;


import lessons.lessonSeven.Methods;

/**
 * Created by Hillel8 on 13.12.2017.
 */
public class Method2 {
    public static void main(String[] args) {
        String str = Methods.getString();

        int x = 12;
        int z = 25;
        int y =6;

        int xy = sumInt(x,y);
        System.out.println(xy);

        int xzy = sumInt(x,z,y);
        System.out.println(xzy);
    }

    public static int sumInt(int a, int b){
        return a+b;
    }

    public static int sumInt(int a, int b, int c){
        return a+b+c;
    }
}
