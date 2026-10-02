import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Tom", "Frank", "Robertx");

        Optional<String> name = list.stream().filter(str-> str.contains("x")).findFirst();

        System.out.println(name.orElse("Not found"));


        String name2 = list.stream().filter(str-> str.contains("x")).findFirst().orElse("We didnt get it");

         System.out.println(name2);

    }
}
