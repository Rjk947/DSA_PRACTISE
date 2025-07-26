import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {
    public static void main(String[] args) {
        System.out.println(migratoryBirds(Arrays.asList(1,1,2,2,3)));
    }

    public static int migratoryBirds(List<Integer> arr) {
    // Write your code here
    Map<Integer, Integer> mapA = new HashMap<>();
    arr.stream().forEach(el -> mapA.put(el, mapA.getOrDefault(el, 0)+1));
    
    int maxKey = arr.get(0);
    int maxValue = Integer.MIN_VALUE; 
    for(Map.Entry<Integer, Integer> entry: mapA.entrySet()) {
        if(entry.getValue() > maxValue) {
            maxValue = entry.getValue();
            maxKey = entry.getKey();
        }
    }
    return maxKey;
    }
}
