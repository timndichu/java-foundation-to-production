import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();

        students.put("Tom", 34);
        students.put("Robert", 20);
        students.put("Chris", 80);
        students.put("Robert", 84);

        System.out.println(students);

        for (String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }

        // To be used when you need thread safety
        Map<String, Integer> studentsSafe = new Hashtable<>();

        Comparator<Integer> com = new Comparator<>() {
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10) {
                    return 1;
                } else
                    return -1;
            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(51);
        nums.add(1);
        nums.add(4);
        nums.add(12);

        Collections.sort(nums, com);

        System.out.println(nums);

        Comparator<Student> comStudents = (i, j) -> {
            return i.age > j.age ? 1 : -1;
        };

        List<Student> students3 = new ArrayList<>();
        students3.add(new Student("Henry", 24));
        students3.add(new Student("Frank", 13));
        students3.add(new Student("Greg", 46));
        students3.add(new Student("Henry", 9));

        Collections.sort(students3, comStudents);

        for (Student s : students3)
            System.out.println("Student " + s.age + " " + s.name);

    }
}

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}