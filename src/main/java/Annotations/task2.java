package Annotations;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int ID;
    private List<Integer> grades;

    public Student(String name, int ID, List<Integer> grades) {
        this.name = name;
        this.ID = ID;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    public void printInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + ID);
        System.out.println("Grades: " + grades);
    }
}

class GradeAnalyzer {
    private List<Integer> grades;

    public GradeAnalyzer(List<Integer> grades) {
        this.grades = grades;
    }

    public double calculateAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.size();
    }

    public void printSummary() {
        System.out.println("Grades Summary:");
        for (int i = 0; i < grades.size(); i++) {
            System.out.println("Grade " + (i + 1) + ": " + grades.get(i));
        }
    }
}

class Start {
    public static void main(String[] args) {
        List<Integer> studentGrades = new ArrayList<>();
        studentGrades.add(85);
        studentGrades.add(90);
        studentGrades.add(75);

        GradeAnalyzer analyzer = new GradeAnalyzer(studentGrades);


        Class<?> analyzerClass = analyzer.getClass();
        Field[] fields = analyzerClass.getDeclaredFields();

        System.out.println("Fields and Values of GradeAnalyzer:");
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                System.out.println(field.getName() + ": " + field.get(analyzer));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }


        Method[] methods = analyzerClass.getDeclaredMethods();

        System.out.println("\nInvoking methods starting with 'calculate' or 'print':");
        for (Method method : methods) {
            if (method.getName().startsWith("calculate") || method.getName().startsWith("print")) {
                try {
                    Object result = method.invoke(analyzer);
                    System.out.println("Method Name: " + method.getName() + ", Result: " + result);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
