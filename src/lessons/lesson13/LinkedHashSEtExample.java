package lessons.lesson13;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Hillel8 on 14.01.2018.
 */
public class LinkedHashSEtExample {
    public static void main(String[] args) {
        Set<Integer> integerSet = new LinkedHashSet<>();
        integerSet.add(5);
        integerSet.add(9);
        integerSet.add(1);
        integerSet.add(3);
        integerSet.add(8);

        System.out.println(integerSet.add(9));
        System.out.println(integerSet);

        Set<String> countryHashSet = new LinkedHashSet<>(); //тоб удалить данные необходимо добавлять итератор. Чтб поменять или посмотреть , то достаточно фор ич
        countryHashSet.add("Ukraine");
        countryHashSet.add("Poland");
        countryHashSet.add("Russia");
        countryHashSet.add("China");
        countryHashSet.add("Ukraine");

        Iterator<String> iterator = countryHashSet.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next()+ ", ");


    }
}
