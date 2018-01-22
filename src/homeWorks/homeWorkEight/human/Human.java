package homeWorks.homeWorkEight.human;

public class Human {
    private final int arms = 2;
    private final int legs = 2;
    private String name;
    private String surname;
    private int age;

    public int getArms() {
        return arms;
    }

    public int getLegs() {
        return legs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo() {
    }
}
