import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TwoArrays {
    public static void main(String[] args) {
        String result = twoArrays(1, new ArrayList<>(Arrays.asList(1,0)), new ArrayList<>(Arrays.asList(0,2)));
        System.out.println(result);
    }

    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
    // Write your code here
    Collections.sort(A);
    Collections.sort(B, Collections.reverseOrder());
    int count = 0;
    for(int i = 0; i < A.size(); i++) {
        if((A.get(i) + B.get(i)) >= k) {
            count ++;
        }
    }

    return count == A.size() ? "YES" : "NO";

    }
}
