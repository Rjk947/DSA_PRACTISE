import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ChallengeWeek1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,6,4,5,2,3,8);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(findMedianNumberOfList(list));
    }

    public static int findMedianNumberOfList(List<Integer> arr) {
        int result = 0;
        if(arr.size() %2 != 0) {
            result = arr.get(arr.size()/2);
        }else {
            int firstIndex = arr.size()/2 -1;
            int secondIndex = arr.size()/2;
            result = (arr.get(firstIndex)+arr.get(secondIndex))/2;
        }

       return result;
    }
}
