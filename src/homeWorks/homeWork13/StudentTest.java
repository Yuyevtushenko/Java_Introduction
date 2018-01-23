package homeWorks.homeWork13;

import lessons.lesson13.User;
import lessons.lesson13.UserSalaryComparator;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();

        student.getStudents().add(new Student("Игорь", "Попов", "Генадиевич",
                2000, 3, 5, 5, 5, 5, 5));
        student.getStudents().add(new Student("Станислав", "Иванов", "Петрович",
                1998, 1, 4, 4, 4, 4, 4));
        student.getStudents().add(new Student("Евгений", "Дуров", "Батькович",
                1999, 2, 3, 3, 3, 3, 3));
        student.getStudents().add(new Student("Платон", "Платон", "Сергеевич",
                1997, 3, 2, 2, 2, 2, 2));
        student.getStudents().add(new Student("Игорь", "Попов", "Генадиевич",
                2001, 1, 4, 5, 3, 2, 4));
        student.getStudents().add(new Student("Максим", "Максимов", "Максимович",
                1996, 3, 3, 5, 4, 3, 2));
        student.getStudents().add(new Student("Казан", "Казанов", "Казанович",
                2000, 1, 3, 3, 5, 4, 5));
        student.getStudents().add(new Student("Банан", "Бананов", "Бананович",
                1998, 2, 4, 4, 5, 5, 5));
        student.getStudents().add(new Student("Ананас", "Ананасов", "Ананасович",
                1999, 2, 3, 3, 3, 4, 4));




        student.sortStudents();

        student.allPrint();

        student.avg(1);
    }
}
