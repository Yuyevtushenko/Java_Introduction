package lessons.lessonSixth;



/**
 * Created by Hillel8 on 10.12.2017.
 */
public class StringTest {
    public static void main(String[] args) {
        /*
        //трингы неизменны
        String str = "Hello World";
        System.out.println(str.length());

        char[] chr = str.toCharArray();

        for (int i = 0; i < chr.length; i++) {
            System.out.print("[" + chr[i] + "]");
        }
        System.out.println();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                System.out.print(" ");
            } else {
                System.out.print("[" + chr[i] + "]");  //|'' - это символ, и там может быть только один символ,  "" - это строка
            }
        }

        System.out.println();
        char[] c = {'h', 'e', 'l', 'l', 'o'};
        String constructorString = new String(c);
        System.out.println(constructorString);

        char[] ch = constructorString.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }

        System.out.println();

        //переворачиваем массив чаров

        for (int i = 0; i < ch.length / 2; i++) {
            char tmp = ch[i];
            ch[i] = ch[ch.length - i - 1];
            ch[ch.length - i - 1] = tmp;
        }

        System.out.println(ch);

        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }

        System.out.println();

        String first = "Milan";
        String second = "Berlin";

        System.out.println(first + second);
        System.out.println(first += second);//перезапишим  переменную

        String third;
        third = first.concat(second);
        System.out.println(third + " !!! ");

        System.out.println(first.concat(second));//не перезаписывает переменную при конкатенации метод конкат
        System.out.println(first);

        String ua = "kiev ukraine summer";

        //аканчивается ли тсрочка на "n"
        System.out.println(ua.endsWith("in"));

        //содержит ли "киев"

        System.out.println(ua.contains("kiev"));

        //Все символы в верхний регистр
        System.out.println(second.toUpperCase());

        //Все символы в малый регистр
        System.out.println(first.toLowerCase());

        String strM = "MilanM";
        String strB = "BerlinB";
        System.out.println(strM.replace('M', 'B') + '\n' + strB.replace('B', 'M'));

        //азбить строку на массив строк
        String plitString = "We love New Year";

        String[] splitStringArray = plitString.split(" ");
        System.out.println(java.util.Arrays.toString(splitStringArray));
        */

        String x = "USA German".replace("USA", "Ukraine");
        System.out.println(x);

        String str1 = "java";
        String cap = str1.substring(0, 1).toUpperCase()+ str1.substring(1);//возвращает сабстринг строку , диапазон последнее не включает
        System.out.println(cap);


        //capacity - размер буфера//стандартный размер на 16 стринг баффер безопасней но медленне
        StringBuffer strbf = new StringBuffer("New World");
        System.out.println(strbf);
        System.out.println(strbf.capacity());


        String str2 = "Товар стоит ";
        String str3 = " баксов";
        int sum = 10;

        StringBuffer sb = new StringBuffer(20);
        sb.append(str2).append(sum).append(str3);
        System.out.println(sb);      //append это как concat


        //озвращает индекс в данной строке первого вхождения
        //указанного символа или -1, если символ не встречается

        System.out.println(sb.indexOf(str3));

        //Запись массива строк в Стрингбаффер или стрингбилдер

        String[] stringArray = {"My name is Petia", "I am president of Ukraine", " I have factory"};

        StringBuffer buffer = new StringBuffer();

        for(int i=0; i<stringArray.length; i++){
            buffer.append("[" + stringArray[i] + "]");
        }
        System.out.println(buffer);

        //еняем местами строки в массиве строк

        String[] changeWords = {"Ivan Petrov", "Stas Ivanov", "Petr Stasovich"};

        System.out.println(java.util.Arrays.toString(changeWords));
        String tmp = changeWords[0];
        changeWords[0] = changeWords[changeWords.length-1];
        changeWords[changeWords.length-1] = tmp;

        System.out.println(java.util.Arrays.toString(changeWords));

        //Метод инсерт добавляет строку или символ по определенному индексу в стрингбаффер
        StringBuffer strBuffer = new StringBuffer("word");
        System.out.println(strBuffer);
        strBuffer.insert(0, "My "); //Будет смещаться все что находится справа от указанного индекса и нельзя указывать индекс больше, чем есть
        System.out.println(strBuffer);

        //метод реверс меняет порядок в стрингбаффере на обратный
        StringBuffer strBuffer3  = new StringBuffer("olleH");
        strBuffer3.reverse();
        System.out.println(strBuffer3);
    }
}
