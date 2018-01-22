package lessons.lesson09;

/**
 * Created by Hillel8 on 20.12.2017.
 */
public class PickUp extends Car implements CargoCar {
    @Override
    public void bus() {
        System.out.println("this is bus");
    }

    @Override
    public void cargo() {
        System.out.println("cargo");
    }
}
