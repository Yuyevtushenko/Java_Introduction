package lessons.lesson09;

/**
 * Created by Hillel10 on 20.12.2017.
 */
public class Car implements BaseCar {

    @Override
    public void stop() {
        System.out.println("stop");
    }

    @Override
    public void start() {
        System.out.println("start");
    }
}
