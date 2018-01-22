package homeWorks.homeWork12;


import java.util.Comparator;

public class NewEmploee  {
    private String name;
    private String surname;
    private int salarySum;
    private int saleryCard;
    private int year;
    private int month;
    private String sex;
    private String otdel;


    public NewEmploee(String surname, String name, String sex, String otdel, int salarySum, int saleryCard, int year, int month) {
        this.name = name;
        this.surname = surname;
        this.saleryCard = saleryCard;
        this.year = year;
        this.month = month;
        this.sex = sex;
        this.otdel = otdel;
        this.salarySum = salarySum;
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

    public int getSalarySum() {
        return salarySum;
    }

    public void setSalarySum(int salarySum) {
        this.salarySum = salarySum;
    }

    public int getSaleryCard() {
        return saleryCard;
    }

    public void setSaleryCard(int saleryCard) {
        this.saleryCard = saleryCard;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getOtdel() {
        return otdel;
    }

    public void setOtdel(String otdel) {
        this.otdel = otdel;
    }


    public void printInfo() {
        System.out.println("Имя: " + getName() + "\nФамилия: " + getSurname() +
                "\nПол: " + getSex() + "\nОтдел: " + getOtdel() +
                "\nЗарплата: " + getSalarySum() + "\nКарточный счет: " + getSaleryCard()
                + "\nГод поступления: " + getYear() + "\nМесяц поступления: " + getMonth());
    }


}

