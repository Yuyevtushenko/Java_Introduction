package lessons.lesson09.phones;

import java.util.Scanner;

/**
 * Created by Hillel8 on 20.12.2017.
 */
public class Order {

    static {
        String welcome = "Welcome to PhoneSoft";
        String enter = "Please enter client order";

        System.out.println(welcome);
        System.out.println(enter);
    }

    public static void main(String[] args) {
        Samsung order = new Samsung();
        Iphone order2 = new Iphone();
        HTC order3 = new HTC();
        buyTelefon(order3, order2);

        System.out.println();
        order3.printAbout();
        System.out.println();
        order2.printAbout();
    }

    public static void buyTelefon(Phone... phones) {
        for (Phone phone : phones) {

            if (phone instanceof Samsung) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Please insert Samsung Model Name: ");
                phone.setModel(sc.nextLine());
                System.out.println("Please insert Samsung Memory: ");
                phone.setMemory(sc.nextInt());
            }

            if (phone instanceof Iphone) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Please insert Iphone Model Name: ");
                phone.setModel(sc.nextLine());
                System.out.println("Please insert Iphone Memory: ");
                phone.setMemory(sc.nextInt());
            }

            if (phone instanceof HTC) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Please insert HTC Model Name: ");
                phone.setModel(sc.nextLine());
                System.out.println("Please insert HTC Memory: ");
                phone.setMemory(sc.nextInt());
            }
        }
    }
}
