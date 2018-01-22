package lessons.lesson09;

/**
 * Created by Hillel8 on 20.12.2017.
 */
public interface BaseCar {
    //Поля тут могут быть только константами, методы дефолтными или абстрактными

    void stop();

    void start();

    default void drive() {
        System.out.println("Drive");
    }
}
