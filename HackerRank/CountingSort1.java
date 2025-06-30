// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountingSort1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,1,2,3);
        System.out.println(countingSort(list, 4));

    }

    public static List<Integer> countingSort(List<Integer> arr, int element) {
        // Write your code here
        List<Integer> result = IntStream.range(0, element)
                .mapToObj(i -> 0)
                .collect(Collectors.toList());
        for (Integer el : arr) {
            int updatedValue = result.get(el) + 1;
            result.set(el, updatedValue);
        }
        return result;

    }
}
