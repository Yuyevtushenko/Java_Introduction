package lessons.lessonEight.figures;

/**
 * Created by Hillel8 on 17.12.2017.
 */
public class Test {
    public static void main(String[] args) {


        Square square = new Square(4);
        square.perimetr();
        square.area();
        square.about();

        System.out.println();

        Rectangle rectangle = new Rectangle(10, 12);
        rectangle.perimetr();
        rectangle.area();
        rectangle.about();

        System.out.println();

        Triangle triangle = new Triangle(3, 4, 5);
        triangle.perimetr();
        triangle.area();
        triangle.about();

        System.out.println();

        Triangle triangle1 = new Triangle(3, 4);
        triangle1.perimetr();
        triangle1.area();
        triangle1.about();


    }
}
