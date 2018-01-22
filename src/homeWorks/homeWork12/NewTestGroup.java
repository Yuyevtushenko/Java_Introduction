package homeWorks.homeWork12;

import homeWorks.homeWork09.Student;

public class NewTestGroup {
    public static void main(String[] args) {

        NewGroup group = new NewGroup("МЕ 102", 1, 10);

        group.addToGroup(new Student("Генадий", "Букин", 21));
        group.addToGroup(new Student("Александр", "Пушкин", 21));
        group.addToGroup(new Student("Виталий", "Дудка", 20));
        group.addToGroup(new Student("Алефтина", "Бабак", 24));
        group.addToGroup(new Student("Иосиф", "Петроясн", 26));
        group.addToGroup(new Student("Инокентий", "Гаврила", 23));
        group.addToGroup(new Student("Денис", "Голубь", 20));
        group.addToGroup(new Student("Коза", "Дереза", 21));
        group.addToGroup(new Student("Жанна", "Кажан", 20));
        group.addToGroup(new Student("Корней", "бамбук", 22));


        group.addToGroup(new Student("Марина", "Тварина", 23));

        group.findStudent("бамбук");
        group.aboutGroup();

        group.deletFromGroup("Дереза");


    }
}

