package LeetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class H_index {
    public static void main(String[] args) {
        // System.out.println(hIndex(new int[]{3,0,6,1,5}));
        System.out.println(hIndexOptimized(new int[]{3,0,6,1,5}));
    }

    //Time Complexity O(nlogn), space O(n)
    public static int hIndex(int[] citations) {
        List<Integer> list = Arrays.stream(citations).boxed().collect(Collectors.toList());
        Collections.sort(list, Collections.reverseOrder());
        int hIndex = 0;
        for(int i = 0; i<list.size(); i++) {
            if(list.get(i) >= i+1) {
                hIndex = i+1;
            }else {
                return hIndex;
            }
        }

        return hIndex;
    }

    //Time Complexity O(n), space O(n) use when sorting cost is high and dealing with data > 10^6
    //Optimized Approach (Bucket Sort)
    public static int hIndexOptimized(int[] citations) {
    int n = citations.length;
    int[] buckets = new int[n + 1]; // bucket[i] = number of papers with i citations

    // Fill buckets
    for (int c : citations) {
        if (c >= n) {
            buckets[n]++; // all citations >= n go into last bucket
        } else {
            buckets[c]++;
        }
    }

    // Traverse buckets from high to low
    int total = 0;
    for (int i = n; i >= 0; i--) {
        total += buckets[i]; // total papers with at least i citations
        if (total >= i) {
            return i;
        }
    }

    return 0;
}

}
