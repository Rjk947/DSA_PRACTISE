import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class MaxPerimeterTriangle {
    public static void main(String[] args) {

        // non-degenerate triangle -> a + b > c, a + c > b, b + c > a
        System.out.println(maximumPerimeterTriangle(Arrays.asList(1,1,3,3,3)));
    }

    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        // Write your code here
        Collections.sort(sticks);
       
        for (int i = sticks.size()-1; i >=2; i--) {
            int a = sticks.get(i-2);
            int b = sticks.get(i-1);
            int c = sticks.get(i);
            if (a + b > c) {
                return Arrays.asList(a,b,c);
            }
        }

        return Arrays.asList(-1);

    }
}
