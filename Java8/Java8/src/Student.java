import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;

public class Student {
    int id;
    String name;
    double marks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    static void main(String[] args) {
        List<Student> l1= Arrays.asList(new Student(101,"sona",89),
                new Student( 102,"tanya",88),
                new Student(103,"soni",87));
        System.out.println("list of student :-"+l1);
        Collections.sort(l1,(Student a,Student b) -> a.id- b.id);
        System.out.println(l1);
    }
}
