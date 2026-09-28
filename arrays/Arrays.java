public class Arrays {
    public static void main(String[] args) {
        int num[] = { 1, 3, 5, 7 };
        // int[] num2 = {3};
        int num2[] = new int[4];
        num2[0] = 4;
        num2[1] = 5;
        num2[2] = 6;
        num2[3] = 7;

        for (int i = 0; i < num2.length; i++) {
            // System.out.println(num2[i]);
        }

        // System.out.println(num2[1]);
        // System.out.println(num2);

        int multidim[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                // double random = Math.random() * 10;
                // int rand = (int)random;
                multidim[i][j] = (int) (Math.random() * 10);
            }

        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                int element = multidim[i][j];
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // to loop through the multidim array
        System.out.println("multidim");
        for (int n[] : multidim) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

        // jagged array
        // array
        System.out.println("J A G G E D   A R R A Y");
        int jagged[][] = new int[3][];

        for (int i = 0; i < jagged.length; i++) {
            int randomt = (int) (Math.random() * 10);
            jagged[i] = new int[randomt];
            for (int j = 0; j < jagged[i].length; j++) {
                int randomj = (int) (Math.random() * 10);
                jagged[i][j] = randomj;
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }

        // Array of objects
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.name = "Robert";
        s1.rollno = 1;
        s1.age = 23;

        s2.name = "Mary";
        s2.rollno = 2;
        s2.age = 33;

        s3.name = "Frank";
        s3.rollno = 3;
        s3.age = 14;

        Student students[] = new Student[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0; i<students.length;i++ ) {
            System.out.println(students[i].name);
        }


    }
}

class Student {
    int rollno;
    String name;
    int age;
}