package homeWorks.homeWorkFirst;

public class Task2HWFirst {
    public static void main (String[] args) {
        int age = 0;

        if (age > 17 && age < 28) {
            System.out.println("Заполняющий подлежит призыву на срочную службу или может служить по контракту.");
        } else if (age > 27 && age < 60) {
            System.out.println("Заполняющий может служить по контракту.");
        } else if ((age >=0 && age < 18) || (age > 59&& age<=100)) {
            System.out.println("Заполняющий находится в непризывном возрасте.");
        } else {
            System.out.println("Некорректный возраст");
        }
    }

}
