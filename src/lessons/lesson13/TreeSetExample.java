package lessons.lesson13;

import java.util.*;

/**
 * Created by Hillel8 on 14.01.2018.
 */
public class TreeSetExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(2);
        list.add(1);
        list.add(8);
        list.add(3);

        Set<Integer> integerSet = new TreeSet<>(list); //Добавляет и сортирует к еррей листу знаечния сет листа , учитывая уникальность
        integerSet.add(11);
        integerSet.add(12);
        integerSet.add(10);
        integerSet.add(21);
        integerSet.add(33);

        System.out.println(integerSet.add(9));

        System.out.println(integerSet);


        Random random = new Random(30); //Количество чисел - 30
        SortedSet<Integer> numberSet = new TreeSet<>();

        Integer randomInt = null;
        for(int i= 0; i<30; i++){
            randomInt = random.nextInt(50);//Диапазон
            System.out.print(randomInt + ", ");
            numberSet.add(randomInt);
        }

        System.out.println();

        System.out.println(numberSet); //Отваливаются повторяющие значения , хотя рандомно было добавлено больше

        System.out.println(numberSet.first());//ПОлучаем первый самый меньший элемент

        System.out.println(numberSet.last());//Получаем последний самый большой

        System.out.println(numberSet.subSet(1,6));//Возвращем диапазон -- 6-ка не включительно

        System.out.println(numberSet.tailSet(6));//Вернет все значения от 6 тут включительно

        numberSet.clear();
        System.out.println(numberSet);



    }
}
