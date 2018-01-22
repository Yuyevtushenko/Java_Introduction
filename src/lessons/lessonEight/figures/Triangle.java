package lessons.lessonEight.figures;

public class Triangle extends Figure {

    protected int a;
    protected int b;
    protected int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void about() {
        if(c==0)getC();
        System.out.println("Сторона А = " + this.a + "\nСторона В = " + this.b
                + "\nГипотенуза = " + this.c);
        area();
        perimetr();
    }


    @Override
    public void area() {
        int pl = (a / 2) * b;
        System.out.println("Площадь триугольника: " + pl);
    }

    @Override
    public void perimetr() {
        if (c==0)getC();
        int p = a + b + c;
        System.out.println("Периметр триугольника: " + p);
    }


    public int getC() {
        c = (int) Math.sqrt((a * a) + (b * b));
        return c;
    }


}
