package lessons.lessonEight.figures;

/**
 * Created by Hillel8 on 17.12.2017.
 */
public class Rectangle extends Square {

    protected int b;

    public Rectangle(int a, int b) {
        super(a);
        this.b = b;
    }

    @Override
    public void area() {
        int pl = a * b;
        System.out.println("Площадь прямоугольнтка: " + pl);
    }

    @Override
    public void perimetr() {
        int p = (a + b) * 2;
        System.out.println("Периметр прямоугольника: " + p);
    }

    @Override
    public void about() {
        System.out.println("Сторона А = " + this.a + "\nСторона В = " + this.b);
        area();
        perimetr();
    }
}
