import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConstructorReference {
    public static void main(String[] args) {
         List<String> names = Arrays.asList("Rob", "John", "Greg");
         List<Student> students = new ArrayList<>();

        //  names.forEach(name -> {
        //     students.add(new Student(name));
        //  });
        
        students = names.stream().map(name -> new Student(name,3)).toList();
        students = names.stream().map(Student::new).toList();

         System.out.println(students);
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    
}