package homeWorks.homeWorkEight.human;


public class Student extends Human {

    protected int course;
    protected String facultet;


    public Student(int course, String facultet) {
        this.course = course;
        this.facultet = facultet;

    }

    @Override
    public void printInfo() {
        System.out.println("Колисетво рук = " + getArms() + "\nКоличество ног = " + getLegs()
                + "\nИмя = " + getName() +
                "\nФамилия = " + getSurname() + "\nВозраст = " + getAge() + "\nФакультет = " + facultet + "\nКурс = " + course);
    }
}
