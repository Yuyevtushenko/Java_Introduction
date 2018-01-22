package homeWorks.homeWork12;

public class NewTest {

    public static void main(String[] args) {
        NewFirm firm = new NewFirm("Ромашка", "Улица пушкина, дом калатушкина", 10000);
        firm.getNewEmploeeList().add(new NewEmploee("Пупкин", "Петя",
                "Мужик", "Маркетинг", 1000, 500, 2017, 2));
        firm.getNewEmploeeList().add(new NewEmploee("Головач", "Лена",
              "Баба", "Бухгалтерия", 2000, 0, 2015, 7));
        firm.getNewEmploeeList().add(new NewEmploee("Петров", "Николай",
               "Мужик", "Инжененрия", 6000, 1000, 2016, 5));
        firm.getNewEmploeeList().add(new NewEmploee("Гончар", "Марина",
               "Баба", "Кадров", 5000, 0, 2017, 10));
        firm.getNewEmploeeList().add(new NewEmploee("Жекавич", "Жека",
             "Мужик", "ИТ", 3000, 500, 2017, 6));



        firm.aboutFirm();

        firm.printAllEmploees();

        firm.sortBySalary();

        firm.giveSalaryForAll();

        firm.calcVocations();

    }
}
