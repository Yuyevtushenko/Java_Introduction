package homeWorks.homeWork09;

public interface GroupInterface {


    void addToGroup(Student student);

    void deletFromGroup(String name);

    default void aboutGroup() {
        System.out.println("Новая группа");

    }
}
