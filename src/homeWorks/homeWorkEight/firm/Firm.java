package homeWorks.homeWorkEight.firm;


import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class Firm {

    private String name;
    private String adress;
    private int salarySum;
    Employee[] array = new Employee[5];


    public Firm(String name, String adress, int salarySum) {
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

    public Employee[] getArray() {
        return array;
    }


    public void aboutFirm() {
        System.out.println("Название фирмы: " + getName() + "\nАдрес: " + getAdress());
    }

    public void printAllEmployees() {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            array[i].printInfo();
            System.out.println();
        }
    }

    public void sortbySalery() {
        System.out.println("Отсортированные по зарплате сотрудники");
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j].getSalarySum() > array[j + 1].getSalarySum()) {
                    Employee tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i].getSurname() + "-" + array[i].getSalarySum() + " ,");

        }
    }

    public void giveSalaryForAll() {

        System.out.println();
        System.out.println("Деньги на карте после начисления зп:");
        for (int i = 0; i < array.length; i++) {
            array[i].setSaleryCard(array[i].getSaleryCard() + array[i].getSalarySum());
            setSalarySum(getSalarySum() - array[i].getSaleryCard());
            if (getSalarySum() <= 0) {
                System.out.println("У комании нет денег на тебя");
                break;
            }
            System.out.println(array[i].getSurname() + "-" + array[i].getSaleryCard() + " ,");
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

        for (int i = 0; i < array.length; i++) {
            if (year == array[i].getYear() && (((month + 1) - array[i].getMonth()) < 6)) {
                System.out.println(array[i].getSurname() + ": Не доработал до отпуска");
            } else {
                int vocationsDay = (((year - array[i].getYear()) * 12) + ((month + 1) - array[i].getMonth())) * 2;
                System.out.println(array[i].getSurname() + ": " + vocationsDay);
            }

        }

    }



}

