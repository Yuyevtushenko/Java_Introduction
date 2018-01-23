package homeWorks.homeWork13;

import java.util.*;

public class Student {
    private String firstName;
    private String lastname;
    private String fathersName;
    private int yearOfBirth;
    private int course;
    private int markOfMath;
    private int markOfHistory;
    private int markOfLunguage;
    private int markOfPsychology;
    private int markOfSomething;
    ArrayList<Student> students = new ArrayList<>();


    public Student() {
    }

    public Student(String firstName, String lastname,
                   String fathersName, int yearOfBirth, int course, int markOfMath,
                   int markOfHistory, int markOfLunguage, int markOfPsychology, int markOfSomething) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.fathersName = fathersName;
        this.yearOfBirth = yearOfBirth;
        this.course = course;
        this.markOfMath = markOfMath;
        this.markOfHistory = markOfHistory;
        this.markOfLunguage = markOfLunguage;
        this.markOfPsychology = markOfPsychology;
        this.markOfSomething = markOfSomething;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getMarkOfMath() {
        return markOfMath;
    }

    public void setMarkOfMath(int markOfMath) {
        this.markOfMath = markOfMath;
    }

    public int getMarkOfHistory() {
        return markOfHistory;
    }

    public void setMarkOfHistory(int markOfHistory) {
        this.markOfHistory = markOfHistory;
    }

    public int getMarkOfLunguage() {
        return markOfLunguage;
    }

    public void setMarkOfLunguage(int markOfLunguage) {
        this.markOfLunguage = markOfLunguage;
    }

    public int getMarkOfPsychology() {
        return markOfPsychology;
    }

    public void setMarkOfPsychology(int markOfPsychology) {
        this.markOfPsychology = markOfPsychology;
    }

    public int getMarkOfSomething() {
        return markOfSomething;
    }

    public void setMarkOfSomething(int markOfSomething) {
        this.markOfSomething = markOfSomething;
    }


    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", fathersName='" + fathersName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", course=" + course +
                ", markOfMath=" + markOfMath +
                ", markOfHistory=" + markOfHistory +
                ", markOfLunguage=" + markOfLunguage +
                ", markOfPsychology=" + markOfPsychology +
                ", markOfSomething=" + markOfSomething +
                '}';
    }

    public void printAbout() {
        System.out.println(toString());
    }

    public void sortStudents() {
        Collections.sort(getStudents(), new StudentChainedComporator(
                new CompareStudent(),
                new CompareLastName()
        ));
    }

    public void allPrint() {

        for (Student students : students) {
            students.printAbout();
        }
    }

    public void avg(Integer course){
        System.out.println("Средний бал для курса = " + course);
        int count = 0;
        double avg = 0;
        for (Student student : students){

            if (student.getCourse()==course){
                count +=1;
                avg +=student.getMarkOfHistory();
            }
        }
        System.out.println(avg/count);
    }
}

