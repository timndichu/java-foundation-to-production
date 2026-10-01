import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsDemo {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(51);
        nums.add(1);
        nums.add(4);
        nums.add(12);

        Set<Integer> uniqueNums = new HashSet<Integer>();
        uniqueNums.add(880);
        uniqueNums.add(573324);
        uniqueNums.add(22567);
        uniqueNums.add(5333);
        uniqueNums.add(2);

        

        System.out.println(nums);
        System.out.println("uniquenums: " + uniqueNums);
    

        for(int num : uniqueNums) {
              System.out.println(num);
        }

        // nums.forEach((num) -> {
        //     System.out.println(num);
        // });

        Set<Integer> sortedNums = new TreeSet<Integer>();

        sortedNums.add(573324);
        sortedNums.add(22567);
        sortedNums.add(5333);
        sortedNums.add(2);
        sortedNums.add(880);

        System.out.println(sortedNums);

        Iterator<Integer> items = sortedNums.iterator();

        while (items.hasNext()) {
             System.out.println(items.next());
        }

    }
}   
