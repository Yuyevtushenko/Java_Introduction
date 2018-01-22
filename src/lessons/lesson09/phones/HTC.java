package lessons.lesson09.phones;

/**
 * Created by Hillel8 on 20.12.2017.
 */
public class HTC extends Phone {

    @Override
    public void printAbout() {
        System.out.println("Samsung\nModel" + this.getModel()
                + "\nMemory: " + this.getMemory()
                + "\nIOS" + this.getOsType1());
    }
}
