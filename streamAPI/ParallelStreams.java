
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStreams {
    public static void main(String[] args) {
        int capacity = 10_000;
        List<Integer> list = new ArrayList<>(capacity);

        for (int i = 0; i <= capacity; i++) {
            Random ran = new Random();
            int newNumber = ran.nextInt(100);
            list.add(newNumber);
        }
        ;

        // for(int num : list) {
        // System.out.println(num);
        // }
        long startSeqTime = System.currentTimeMillis();

        int sum1 = list.stream().map(n -> n * 2).mapToInt(i -> i).sum();

        long endSeqTime = System.currentTimeMillis();

        long startParallelTime = System.currentTimeMillis();
        int sum2 = list.parallelStream().map(n -> n * 2).mapToInt(i -> i).sum();
        long endParallelTime = System.currentTimeMillis();

        System.out.println("Seq Time: " + (endSeqTime - startSeqTime) + " result "+ sum1);

        System.out.println("Parallel Time: " + (endParallelTime - startParallelTime) + " result "+ sum2);
    }
}
