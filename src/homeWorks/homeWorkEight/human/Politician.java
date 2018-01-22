package homeWorks.homeWorkEight.human;

public class Politician extends Human {

    protected String consignment;
    protected int salary;

    public Politician(String consignment, int salary) {
        this.consignment = consignment;
        this.salary = salary;
    }

    @Override
    public void printInfo() {
        System.out.println("Колисетво рук = " + getArms() + "\nКоличество ног = " + getLegs()
                + "\nИмя = " + getName() +
                "\nФамилия = " + getSurname() + "\nВозраст = " + getAge()
                + "\nЗарплаьта = " + salary + "\nПартия= " + consignment);
    }
}
