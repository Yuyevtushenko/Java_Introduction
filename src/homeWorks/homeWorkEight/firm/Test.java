package homeWorks.homeWorkEight.firm;

public class Test {
    public static void main(String[] args) {
        Firm firm = new Firm("Ромашка", "Улица пушкина, дом калатушкина", 10000);
        firm.getArray()[0] = new Employee("Пупкин", "Петя",
                "Мужик", "Маркетинг", 1000, 500, 2017, 2);
        firm.getArray()[1] = new Employee("Головач", "Лена",
                "Баба", "Бухгалтерия", 2000, 0, 2015, 7);
        firm.getArray()[2] = new Employee("Петров", "Николай",
                "Мужик", "Инжененрия", 6000, 1000, 2016, 5);
        firm.getArray()[3] = new Employee("Гончар", "Марина",
                "Баба", "Кадров", 5000, 0, 2017, 10);
        firm.getArray()[4] = new Employee("Жекавич", "Жека",
                "Мужик", "ИТ", 3000, 500, 2017, 6);

        firm.aboutFirm();

        firm.printAllEmployees();

        firm.sortbySalery();

        firm.giveSalaryForAll();

        firm.calcVocations();

    }
}
