package Design_Patterns.Iterator.example;

public class Student {
    private String name;
    private double cgpa;
    private int id;

    public Student(String name, double cgpa, int id){
        this.name = name;
        this.cgpa = cgpa;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public double getCgpa(){
        return cgpa;
    }

    public int getId(){
        return id;
    }
}
