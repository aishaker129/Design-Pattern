package Design_Patterns.Iterator.example;

public class Main {
    public static void main(String[] args) {
        Class student = new Class();
        student.addStudent(new Student("Shaker", 3.80,2));
        student.addStudent(new Student("Mahfuz", 3.50,3));
        student.addStudent(new Student("Rafiul", 3.90,1));
        student.addStudent(new Student("Dayan", 3.60,4));

        Iterator it = student.createStudent();

        System.out.println("Student record...");

        while(it.hasNext()){
            Student std = (Student) it.next();
            System.out.println("Name: "+std.getName()+" ID: "+std.getId()+" and CGPA: "+std.getCgpa());
        }
    }
}
