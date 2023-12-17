package unitTesting;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentSystem {

    List<Student> students = new ArrayList<>();

    public StudentSystem(String filename) throws StudentNotFoundException, IOException {

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));

            List<String> lines = reader.lines().collect(Collectors.toList());

            for(String line: lines) {
                String[] studentParts = line.split(",");
                Student s = new Student(studentParts[0] != "" ? Integer.parseInt(studentParts[0]) : 000,
                        studentParts[1],
                        studentParts[2],
                        studentParts[3],
                        studentParts[4] != "" ? Double.parseDouble(studentParts[4]) : 000);
                students.add(s);
            }

            reader.close();

        } catch (FileNotFoundException e) {
            throw new StudentNotFoundException("Student not found");
        }


    }

    public void printAll() {

        for(Student student: students) {

            System.out.println(student);
        }
    }


    public Optional<Student> getStudentById(int ID) throws StudentNotFoundException {

        for(Student student: students) {
            if(student.getID() == ID) {
                return Optional.of(student);
            }
        }
        throw new StudentNotFoundException("student not found");
    }


    public Student getStudentByIdNotOptional(int ID) throws StudentNotFoundException {

        for(Student student: students) {
            if(student.getID() == ID) {
                return student;
            }
        }return null;

    }

    public Student getHighestGPAStudent() {

        if(students.size() == 0) {
            throw new EmptyStudentListException("List of students is empty");
        }

        Student highestGPAStudent = students.get(0);

        for(Student student: students) {
            if(student.getGPA() > highestGPAStudent.getGPA()) {
                highestGPAStudent = student;
            }
        }

        return highestGPAStudent;
    }




    public Student getLongestNameStudent() {

        if(students.size() == 0) {
            throw new EmptyStudentListException("List of students is empty");
        }

        Student longestNameStudent = students.get(0);

        for(Student student : students) {
            if(student.getName().length() > longestNameStudent.getName().length()) {
                longestNameStudent = student;
            }
        }

        return longestNameStudent;
    }

    public List<Student> getStudents(){
        return students;
    }

    public String[] getFiveStudentNames() {

        List<String> names = new ArrayList<>();

        int count = 0;
        for(Student s : students) {
            names.add(s.getName());
            count++;

            if(count == 5) break;
        }
        return names.toArray(new String[0]);
    }

}
