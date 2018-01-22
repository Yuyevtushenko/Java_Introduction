package homeWorks.homeWork10;

public class AbonentTest {
    public static void main(String[] args) {
        Abonent abonent = new Abonent();
        abonent.getAbonents()[0] = new Abonent(325264545, "Качан", "Валерий", "Сергеевич",
                "проспект Московский", 345345435, 3000, 1000, 60, 60);
        abonent.getAbonents()[1] = new Abonent(325264545, "Жабо", "Валерий", "Сергеевич",
                "проспект Московский", 345345435, 3000, 1000, 0, 0);
        abonent.getAbonents()[2] = new Abonent(325264545, "Тычинка", "Валерий", "Сергеевич",
                "проспект Московский", 345345435, 3000, 1000, 1, 240);
        abonent.getAbonents()[3] = new Abonent(325264545, "Ананас", "Валерий", "Сергеевич",
                "проспект Московский", 345345435, 3000, 1000, 2, 241);
        abonent.getAbonents()[4] = new Abonent(325264545, "Пиник", "Валерий", "Сергеевич",
                "проспект Московский", 345345435, 3000, 1000, 0, 239);

        abonent.printAboutAll();
        abonent.whoUsedIntercities();
        abonent.moreThanAllow();
        abonent.sortByalphabet();


    }
}
