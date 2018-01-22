package homeWorks.homeWork09;


public class Group implements GroupInterface {

    private String nameOfGroupe;
    private int course;
    Student[] array = new Student[10];

    public Student[] getArray() {
        return array;
    }

    public Group(String nameOfGroupe, int course) {
        this.nameOfGroupe = nameOfGroupe;
        this.course = course;
    }

    @Override
    public void addToGroup(Student student) {

        for (int i = 0; i < array.length; i++) {
            if (i < array.length && array[i] == null) {
                array[i] = student;
                break;
            }

        }
    }


    @Override
    public void deletFromGroup(String name) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].getLastName().equals(name)) {
                array[i] = null;
                break;
            }
            if (i == array.length - 1) {
                System.out.println("такого студента не сущесвтует");
            }
        }

    }

    @Override
    public void aboutGroup() {
        System.out.println("Название групп: " + nameOfGroupe + "\nКурс: " + course);
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                System.out.println("Фамилия: " + array[i].getLastName() + "\nИмя: " + array[i].getFirstNAme() + "\nВозраст: " + array[i].getAge());
            } else {
                System.out.println("Пусто");
            }
        }

    }

    public void findStudent(String lastname) {
        for (int i = 0; i < array.length; i++) {

            if (array[i].getLastName().equals(lastname)) {
                array[i].printAbout();
                break;
            }
        }

    }
}

