package homeWorks.homeWork09;

public class Test {
    public static void main(String[] args) {

        Group group = new Group("МЕ 102", 1);
        Student student1 = new Student("Генадий", "Букин", 21);
        Student student2 = new Student("Александр", "Пушкин", 21);
        Student student3 = new Student("Виталий", "Дудка", 20);
        Student student4 = new Student("Алефтина", "Бабак", 24);
        Student student5 = new Student("Иосиф", "Петроясн", 26);
        Student student6 = new Student("Инокентий", "Гаврила", 23);
        Student student7 = new Student("Марина", "Тварина", 23);
        Student student8 = new Student("Денис", "Голубь", 20);
        Student student9 = new Student("Коза", "Дереза", 21);
        Student student10 = new Student("Жанна", "Кажан", 20);
        Student student11= new Student("Корней", "бамбук", 22);


        group.addToGroup(student1);
        group.addToGroup(student2);
        group.addToGroup(student3);
        group.addToGroup(student4);
        group.addToGroup(student5);
        group.addToGroup(student6);
        group.addToGroup(student7);
        group.addToGroup(student8);
        group.addToGroup(student9);
        group.addToGroup(student10);
        group.addToGroup(student11);

        group.deletFromGroup("Дереза");

        group.addToGroup(student11);

        group.findStudent("бамбук");
        group.aboutGroup();


    }
}
