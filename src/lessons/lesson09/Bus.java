package lessons.lesson09;



/**
 * Created by Hillel8 on 20.12.2017.
 */
public class Bus extends Car implements PassCar {

    @Override
    public void bus() {
        System.out.println("this is bus");
    }
}
