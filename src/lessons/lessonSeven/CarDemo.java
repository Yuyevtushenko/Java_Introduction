package lessons.lessonSeven;

/**
 * Created by Hillel8 on 13.12.2017.
 */
public class CarDemo {
    public static void main(String[] args) {
        //Обьект (экземпляр) - это отденльный представитель классаб
        //имеющий конкретное сотсояние , полностью определяемое классом

        //оздаем обьект

        Car bmw = new Car();
        bmw.brandName = "BMW";
        bmw.model = "X5";
        bmw.color = "black";
        bmw.number = " MA 7878976";

        bmw.printInfo();

        Car audi = new Car();

        
        audi.brandName = "AUDI";
        audi.model = "yuyiu";
        audi.color = "white";
        audi.number = "GH 67678";

        audi.printInfo();
    }
}
