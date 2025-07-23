import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SalesByMatch {
    public static void main(String[] args) {
        System.out.println(sockMerchant(9, Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20)));
    }

    public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
    //create map
    //filter count >1
    //then divide each element by 2
    int countPair = 0;
    List<Long> list = ar.stream()
    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
    .entrySet().stream()
    .filter(entry -> entry.getValue() > 1)
    .map(entry -> entry.getValue())
    .collect(Collectors.toList());
    
    for(Long num: list) {
        countPair += num/2;
    }
    
    return countPair;

    }
}
