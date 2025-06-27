package GeeksForGeeKs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MajorityElement_2 {
    public static void main(String[] args) {
        int [] nums = new int[]{2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};
        System.out.println(findMajority(nums));
    }

    public static List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        
       return map.entrySet().stream()
                    .filter(entry -> entry.getValue() > nums.length/3)
                    .map(entry -> entry.getKey()).collect(Collectors.toList());
    }
}
