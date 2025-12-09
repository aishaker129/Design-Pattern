package Design_Patterns.Iterator.example;

import java.util.ArrayList;
import java.util.List;

public class Class implements Course{
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }

    public Iterator<Student> createStudent(){
        return new StudentIterator(students);
    }
    
}
