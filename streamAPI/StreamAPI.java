
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 6, 7, 2);

        Stream<Integer> s1 = list.stream();
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        Stream<Integer> s3 = s2.map(n -> n * 2);

        // s3.forEach(n -> System.out.println(n));
        int res = s3.reduce(0, (c, a) -> c + a);
        System.out.println(res);

        int result = list.stream()
                    .filter(n -> n % 2 == 0)
                    .map(n -> n * 2)
                    .reduce(0, (c, a) -> c + a);
         System.out.println(result);
    }
}
