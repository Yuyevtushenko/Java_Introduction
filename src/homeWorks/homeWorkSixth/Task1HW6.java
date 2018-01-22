package homeWorks.homeWorkSixth;

import java.util.Arrays;

public class Task1HW6 {

        public static void main(String[] args) {
//        Дана строка, содержащая пробелы. Найдите, сколько в ней слов (слово – это
//                последовательность непробельных символов, слова разделены одним пробелом, первый
//                и последний символ строки – не пробел).

            String str = "Надо всего лишь быть внимательным. Урок усваивается, когда ты готов к постижению, и, если ты обращаешь внимание на знаки и приметы, ты непременно поймёшь, что необходимо для следующего шага.";
            String[] stringArray = str.split(" ");
            System.out.println(Arrays.toString(stringArray));

            System.out.println("Количество слов без символов: " + stringArray.length);
        }
    }

