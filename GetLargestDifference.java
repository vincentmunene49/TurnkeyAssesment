import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class GetLargestDifference {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
//adding some values to test for correctness
        list.add(1);
        list.add(9);
        list.add(3);
        list.add(7);
        System.out.println(getLargestDifference(list));
    }


   //I use functional programming concept,using streams to retrieve distinct list along with the largest and smallest number and find the difference
    public static int getLargestDifference(List<Integer> list){
        Optional<Integer> smallestOptional = list.stream().distinct().min(Integer::compareTo);
        Optional<Integer> largestOptional = list.stream().distinct().max(Integer::compareTo);
        int smallestNumber = 0;
        int largestNumber = 0;
        if (smallestOptional.isPresent() && largestOptional.isPresent()) {
            smallestNumber = smallestOptional.get();
            largestNumber = largestOptional.get();
        } else {
            System.out.println("List is empty or contains no distinct elements.");
        }
        return largestNumber-smallestNumber;
    }
}
