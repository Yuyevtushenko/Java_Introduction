package homeWorks.homeWork12;

import java.time.Year;
import java.util.*;

public class NewFirm {

    private String name;
    private String adress;
    private int salarySum;
    List<NewEmploee> newEmploeeList = new ArrayList<>();


    public NewFirm(String name, String adress, int salarySum) {
        this.name = name;
        this.adress = adress;
        this.salarySum = salarySum;
    }


    public void setSalarySum(int salarySum) {
        this.salarySum = salarySum;
    }

    public String getName() {
        return name;
    }

    public int getSalarySum() {
        return salarySum;
    }

    public String getAdress() {
        return adress;
    }

    public List<NewEmploee> getNewEmploeeList() {
        return newEmploeeList;
    }

    public void aboutFirm() {
        System.out.println("Название фирмы: " + getName() + "\nАдрес: " + getAdress());
    }

    public void printAllEmploees() {
        for (int i = 0; i < newEmploeeList.size(); i++) {
            newEmploeeList.get(i).printInfo();
        }
    }

    public void sortBySalary() {
        System.out.println();

        System.out.println("Отсортированные по зарплате сотрудники");

        Collections.sort(newEmploeeList, new CompareEmploees());

        for (NewEmploee emploee : newEmploeeList) {
            System.out.println(emploee.getSurname() + "-" + emploee.getSalarySum() + " ,");
        }

    }


    public void giveSalaryForAll() {

        System.out.println();
        System.out.println("Деньги на карте после начисления зп:");
        for (NewEmploee emploee : newEmploeeList) {
            emploee.setSaleryCard(emploee.getSaleryCard() + emploee.getSalarySum());
            setSalarySum(getSalarySum() - emploee.getSalarySum());
            if (getSalarySum() <= 0) {
                System.out.println("У комании нет денег на тебя");
                break;
            }
            System.out.println(emploee.getSurname() + "-" + emploee.getSaleryCard() + " ,");
        }
    }


    public void calcVocations() {
        System.out.println();
        System.out.println("Количество дней отпуска за все года");

        int year = Year.now().getValue();

        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int month = cal.get(Calendar.MONTH);

        for (NewEmploee emploee : newEmploeeList) {
            if (year == emploee.getYear() && (((month + 1) - emploee.getMonth()) < 6)) {
                System.out.println(emploee.getSurname() + ": Не доработал до отпуска");
            } else {
                int vocationsDay = (((year - emploee.getYear()) * 12) + ((month + 1) - emploee.getMonth())) * 2;
                System.out.println(emploee.getSurname() + ": " + vocationsDay);
            }

        }

    }


}


