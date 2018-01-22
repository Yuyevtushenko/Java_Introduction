package lessons.lessonSeven;

/**
 * Created by Hillel8 on 13.12.2017.
 */
public class Car {
    //ласс это способ опсиания сущности, определящий состояние и поведение,
    //зависящих от этого состояния
    //и также правила для взаимодействия с данной сущностью

    //Далее конструткор идет а потом метод

    public final Integer year = 2017;
    public String brandName;
    public String model;
    public String color;
    public String number;

    public void printInfo() {
        System.out.println(" Marka avtomoibilja: " + brandName + "\n Model avtomobila: "
                + model + "\n Cvet avtomobila: " + color + "\n Nomer avtomobila: "
                + number + "\n God avtomobila: " + year);
    }
}
