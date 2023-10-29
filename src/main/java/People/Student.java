package People;

import java.util.ArrayList;

class Student extends Person{
    private int credits;
    private int studentId;
    ArrayList grades = new ArrayList();
    public Student(String name, String street) {
        super(name, street);
        this.credits=0;

    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public ArrayList getGrades() {
        return grades;
    }

    public void setGrades(ArrayList grades) {
        this.grades = grades;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void study(){
        this.credits++;
    }
    public int credits(){
        return this.credits;
    }

}