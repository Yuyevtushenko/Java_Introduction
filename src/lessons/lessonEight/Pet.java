package lessons.lessonEight;

/**
 * Created by Hillel8 on 17.12.2017.
 */
public class Pet {
    private final int legs = 4;
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getLegs() {
        return legs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
