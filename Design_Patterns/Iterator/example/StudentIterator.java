package Design_Patterns.Iterator.example;

import java.util.List;

public class StudentIterator implements Iterator<Student>{
    private List<Student> students;
    int index = 0;

    StudentIterator(List<Student> students){
        this.students = students;
    }

    public boolean hasNext(){
        return index < students.size();
    }

    public Student next(){
        return students.get(index++);
    }
}
