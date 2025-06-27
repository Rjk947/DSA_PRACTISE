import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LonelyInteger {
    public static void main(String[] args) {
        System.out.println(lonelyinteger(Arrays.asList(1,2,3,4,3,2,1)));
    }


    public static int lonelyinteger(List<Integer> a) {
    // Write your code here
    
        return a.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(el -> el.getValue() == 1)
                .map(el -> el.getKey())
                .findFirst()
                .get();

    }
}
