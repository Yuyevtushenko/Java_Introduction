package lessons.lesson09.phones;

/**
 * Created by Hillel8 on 20.12.2017.
 */
public abstract class Phone {

    private final String osType1 = "Windows";
    private final String osType2 = "IOS";
    private final String osType3 = "Android";

    private String model;
    private Integer memory;

    public String getOsType1() {
        return osType1;
    }

    public String getOsType2() {
        return osType2;
    }

    public String getOsType3() {
        return osType3;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public abstract void printAbout();
}
