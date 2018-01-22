package lessons.lesson12;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Hillel8 on 10.01.2018.
 */
public class LinkedListExample {

    public static void main(String[] args) {

        Integer int1 = 5;
        Integer int2 = 9;
        Integer int3 = 2;
        Integer int4 = 8;
        Integer int5 = 1;

        List<Integer> integerList = new LinkedList<>();
        integerList.add(int1);
        integerList.add(int2);
        integerList.add(int3);
        integerList.add(int4);
        integerList.add(int5);
        integerList.add(5);

        System.out.println(integerList.isEmpty());

        System.out.println(integerList.lastIndexOf(8));

        integerList.clear();

        System.out.println(integerList.isEmpty());

        System.out.println(integerList);


        integerList.add(int1);
        integerList.add(int2);
        integerList.add(int3);
        integerList.add(int4);
        integerList.add(int5);
        integerList.add(5);
        System.out.println(integerList);

        Iterator<Integer> iterator = integerList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        if (iterator.hasNext())
            System.out.println(iterator.next());

        System.out.println();

        ListIterator<Integer> listIterator = integerList.listIterator();

        while (listIterator.hasNext())
            System.out.println(listIterator.next());

        System.out.println();

//Привиус возвращает предыдущий эелемент , если такого нет , то генерируется исключение

        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

    }
}
