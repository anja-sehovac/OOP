package People;

import java.util.ArrayList;

public class Main {
    public static void printDepartment(ArrayList<Person> people){
        for (Person person : people){
            System.out.println(person);
        }

    }
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<Person>();
        people.add( new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200) );
        people.add( new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki") );


        printDepartment(people);
    }}
