package homeWorks.homeWork12;

import homeWorks.homeWork09.GroupInterface;
import homeWorks.homeWork09.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class NewGroup implements GroupInterface {

    private int limitOfStudents;
    private String nameOfGroupe;
    private int course;
    List<Student> students= new ArrayList<>();



    public NewGroup(String nameOfGroupe, int course, int limitOfStudents) {
        this.nameOfGroupe = nameOfGroupe;
        this.course = course;
        this.limitOfStudents = limitOfStudents;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public void addToGroup(Student student) {

     if (students.size() >= limitOfStudents){
         System.out.println("Группа переполнена");
        }else{
         students.add(student);
     }
    }


    @Override
    public void deletFromGroup(String name) {
        System.out.println();
        for(Student student : students){
            if (student.getLastName().equals(name)) {
                students.remove(student);
                break;
            }

        }

    }

    @Override
    public void aboutGroup() {
        System.out.println();
        System.out.println("Название групп: " + nameOfGroupe + "\nКурс: " + course);
        for (Student group : students) {
                System.out.println("Фамилия: " + group.getLastName() + "\nИмя: " + group.getFirstNAme() + "\nВозраст: " + group.getAge());

            }
        }


    public void findStudent(String lastname) {
        System.out.println();
        for (Student student : students) {
            if (student.getLastName().equals(lastname)) {
                student.printAbout();
                break;
            }
        }

    }
}
