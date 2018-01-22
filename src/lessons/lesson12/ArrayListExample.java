package lessons.lesson12;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by Hillel8 on 10.01.2018.
 */
public class ArrayListExample {

    public static void main(String[] args) {
        String str1 = "First";
        String str2 = "Second";
        String str3 = "Third";
        String str4 = "Fourth";
        String str5 = "Fifth";


        Integer int1 = 5;
        Integer int2 = 9;
        Integer int3 = 2;
        Integer int4 = 8;
        Integer int5 = 1;

        Student student1 = new Student("Andrej", "Petrov", 26);
        Student student2 = new Student("Sergej", "Petrov", 22);
        Student student3 = new Student("Denis", "Petrov", 12);


        List<String> stringList = new ArrayList<>();  //Указываем лист или еррей лист. Дальше указываем какой тип данных мы исползуем, ьакже можно указать обьекты
        stringList.add(str1);
        stringList.add(str2);
        stringList.add(str3);
        stringList.add(str4);
        stringList.add(str5);

        System.out.println(stringList.contains("First"));


        List<Integer> integerList = new ArrayList<>();
        integerList.add(int1);
        integerList.add(int2);
        integerList.add(int3);
        integerList.add(int4);
        integerList.add(int5);
        integerList.add(5);

        System.out.println(integerList.size());


        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println(students.indexOf(student1));
        System.out.println(students.toString());


        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }


        for (String wasja : stringList) {
            System.out.println(wasja);
        }

        System.out.println();

        System.out.println(stringList.get(2));

        stringList.remove(2);
        System.out.println(stringList.size());

        System.out.println(stringList);


        stringList.add(2, "Zero");

        System.out.println(stringList);

        System.out.println(integerList);
        integerList.set(4, null);
        System.out.println(integerList);

//        Integer x = 3;
//        Integer x1 = 8;
//        Integer x2 = 19;

        List<Integer> newInt = new ArrayList<>();
        newInt.add(60);
        newInt.add(100);

        System.out.println(integerList);
        integerList.addAll(1, newInt);
        System.out.println(integerList);

        List<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(-2);
        listInt.add(55);
        listInt.add(222);
        listInt.add(-45);
        listInt.add(12);
        listInt.add(0);

        listInt.sort(Integer::compareTo);

        System.out.println(listInt);


        //трисет хранит только уникальные значения и метод адд возвращает только тру или фолс (добавлено или не добавлено)

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(-2);
        treeSet.add(55);
        treeSet.add(222);
        treeSet.add(-45);
        treeSet.add(12);
        treeSet.add(0);

        System.out.println(treeSet);
    }
}
