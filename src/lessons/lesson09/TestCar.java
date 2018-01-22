package lessons.lesson09;

/**
 * Created by Hillel8 on 20.12.2017.
 */
public class TestCar {
    public static void main(String[] args) {

        //Дефолтные методы не нужно переопределять в классах , гле имплементриуется и он только в интерфейсах
        Car car = new Car();
        car.start();
        car.drive();
        car.stop();

        System.out.println();
        Bus bus = new Bus();
        bus.start();
        bus.bus();
        bus.drive();
        bus.stop();

        System.out.println();

        PickUp pickUp = new PickUp();
        pickUp.start();
        pickUp.cargo();
        pickUp.bus();
        pickUp.drive();
        pickUp.stop();
    }
}
