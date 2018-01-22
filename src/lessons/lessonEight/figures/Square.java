package lessons.lessonEight.figures;

/**
 * Created by Hillel8 on 17.12.2017.
 */
public class Square extends Figure {

    protected int a;

    //конструктор
    public Square (int a){
        this.a = a;
    }
    //перераспредление метода


//    @Override //Это анотация , что порверяет чтоб сигнатура метода не менялась
//    public void about() {
//        super.about();   //Супер говорит, что мы обращаемся к родительскому классу и вызываем метод about
//    }
//
//    @Override
//    public void area() {
//        super.area();
//    }
//
//    @Override
//    public void perimetr() {
//        super.perimetr();
//    }



    @Override
    public void area() {
        int pl = a*a;
        System.out.println("Площадь квадрата: " + pl);
    }

    @Override
    public void perimetr() {
        int p = a*4;
        System.out.println("Периметр квадрата: "  + p);
    }


    @Override
    public void about() {
        System.out.println("Сторона А = " + a);
        area();
        perimetr();
    }
}
