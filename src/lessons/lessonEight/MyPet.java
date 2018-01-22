package lessons.lessonEight;

/**
 * Created by Hillel8 on 17.12.2017.
 */
public class MyPet {
    public static void main(String[] args) {

        Pet pet = new Pet();
        pet.setAge(12);
        pet.setName("Pet");

        System.out.println("name: " + pet.getName());
        System.out.println("age: " + pet.getAge());
        System.out.println("legs: " + pet.getLegs());

        Cat cat = new Cat();
        cat.setName("Murzik");
        cat.setAge(3);

        System.out.println("name: " + cat.getName());
        System.out.println("age: " + cat.getAge());
        System.out.println("legs: " + cat.getLegs());

        cat.sayCat();

        Dog dog = new Dog();
        dog.setName("Barsbos");
        dog.setAge(4);

        System.out.println("name: " + dog.getName());
        System.out.println("age: " + dog.getAge());
        System.out.println("legs: " + dog.getLegs());

        dog.sayDog();


    }
}
