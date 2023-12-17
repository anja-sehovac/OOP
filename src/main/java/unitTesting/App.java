package unitTesting;

import java.io.IOException;

public class App
{
    public static void main( String[] args ) throws StudentNotFoundException, IOException
    {


        StudentSystem studentSystem = new StudentSystem("students.csv");


        for(String s : studentSystem.getFiveStudentNames()) {
            System.out.println(s);
        }
    }
}