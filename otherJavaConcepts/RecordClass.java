

public class RecordClass {
    public static void main(String[] args) {
        Alien alien = new Alien("Frank",30);
        System.out.println(alien.toString());
    }
}

record Alien (String name, int age) {};