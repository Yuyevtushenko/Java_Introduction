package lessons.lessonEight;

/**
 * Created by Hillel8 on 17.12.2017.
 */
public class Employee {

    private String name;
    private String surname;
    private Integer age;
    private String department;
    private Integer wagedata; //stavka

    //Konstruktor - инициализатор нашего консруктора (он в скобкоах)

    public Employee(String name, String surname) {
        this.name = name;  //this и имя переменной = это значит что именно выше указаннокй переменной будем прсиваивать значения
        this.surname = surname;
    }

    public Employee(String name, String surname, Integer age, String department, Integer wagedata) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.department = department;
        this.wagedata = wagedata;
    }

    // public Employee(){

    //  }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public Integer getWagedata() {
        return wagedata;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setWagedata(Integer wagedata) {
        this.wagedata = wagedata;
    }

    public void printInfo() {
        System.out.println("Name: " + this.name + "\nSurname: " + this.surname
                + "\nage: " + this.age + "\ndepartment: " + this.department
                + "\nwage rate: " + this.wagedata);
    }

}
