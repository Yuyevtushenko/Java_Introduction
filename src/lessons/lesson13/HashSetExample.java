package lessons.lesson13;


import lessons.lesson12.Student;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Hillel8 on 14.01.2018.
 */
public class HashSetExample {

    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(5);
        integerSet.add(9);
        integerSet.add(1);
        integerSet.add(3);
        integerSet.add(8);

        System.out.println(integerSet);

        System.out.println(integerSet.add(9)); //Добавляет хэшсет только уникальные значения

        Student student1 = new Student("Ivan", "Ivanych", 18);
        Student student2 = new Student("Victor", "phursin", 25);
        Student student3 = new Student("Ruslan", "Popov", 20);

        Set<Student> students = new HashSet<>();
        students.add(student3);
        students.add(student1);
        students.add(student2);

        System.out.println(student1.hashCode()); //При добавление эелеменов по хэшам последовательность не сохраняется
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());

        for (Student student : students) {
            System.out.println(student);
        }

        HashSet<String> countryHashSet = new HashSet<>();
        countryHashSet.add("USA");
        countryHashSet.add("Spain");
        countryHashSet.add("France");
        countryHashSet.add("Gonduras");
        countryHashSet.add("USA");

//        while (countryHashSet.iterator().hasNext())
//            System.out.println(countryHashSet.iterator().next()); //Такой код зациклится так как какждый раз вызывается новый итератор, который будет все время вызывать первое значение

        Iterator<String> iterator = countryHashSet.iterator();//alt+enter local introduce veriable
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + ", ");
        }


    }
}
