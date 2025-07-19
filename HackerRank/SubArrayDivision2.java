import java.util.Arrays;
import java.util.List;

public class SubArrayDivision2 {
    public static void main(String[] args) {
        System.out.println(birthday(Arrays.asList(2,2,1,3,2), 4, 2));
    }

    public static int birthday(List<Integer> s, int d, int m) {
    // Write your code here
    //s.size();
    //d = date
    //m = month
    int result = 0;
    for(int i = 0; i <= s.size()-m; i++) {
        if(s.subList(i, i+m).stream().reduce(0, Integer::sum) == d) {
            result++;
        }
    }
    
    return result;

    }
}
