package homeWorks.homeWorkFirst;

public class Task3HWFirst {
    public static void main (String[] args) {
        int a =-100;
        int b = -7;
        int c = -10;
        boolean w = a > c;
        boolean q = a > b;
        boolean e = b > c;
        boolean r = b > a;
        boolean f = c > a;
        boolean g = c > b;


        if (q && e) {
            System.out.println(a + "," + b + "," + c);
        } else if (w && g) {
            System.out.println(a + "," + c + "," + b);
        } else if (r && w) {
            System.out.println(b + "," + a + "," + c);
        } else if (e && f) {
            System.out.println(b + "," + c + "," + a);
        } else if (f && q) {
            System.out.println(c + "," + a + "," + b);
        } else if (g && r) {
            System.out.println(c + "," + b + "," + a);
        } else {
            System.out.println("Error");
        }
    }
}
