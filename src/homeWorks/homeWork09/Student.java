package homeWorks.homeWork09;

public class Student extends HumanCl {

    private String firstNAme;
    private String lastName;
    private int age;

    public Student(String firstNAme, String lastName, int age) {
        this.firstNAme = firstNAme;
        this.lastName = lastName;
        this.age = age;
    }

    public void setFirstNAme(String firstNAme) {
        this.firstNAme = firstNAme;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstNAme() {
        return firstNAme;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void printAbout() {
        super.printAbout();
        System.out.println("Имя:" + firstNAme + "\nФамилия" + lastName + "\nВозраст" + age );
    }
}
