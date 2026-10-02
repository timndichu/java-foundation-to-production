import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rob", "John", "Greg");

        List<String> namesUp = names.stream().map(name-> name.toUpperCase()).toList();

        List<String> namesUpMx = names.stream().map(String::toUpperCase).toList();

        namesUpMx.forEach(System.out::println); 
    }
}
