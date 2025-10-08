import java.util.List;

public class ChallengeWeek3 {

    public static void main(String[] args) {
        int result = getTotalX(List.of(2,4), List.of(16,32,96));
        System.out.println(result);
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
    //lets Integer being considered i.e x is -> x%2 == 0, x % 6 == 0
    //x is factor of all element in second array i.e is 24 % x == 0, 36 % x == 0
        int count = 0;
        int maxA = a.stream().max(Integer::compare).get();
        int minB = b.stream().min(Integer::compare).get();

        for(int i = maxA; i <= minB; i++) {
            boolean factorOfAllA = true;
            boolean factorForAllB = true;

            for(int n : a) {
                if(i % n != 0) {
                    factorOfAllA = false;
                    break;
                }
            }

            for(int n : b) {
                if(n % i != 0) {
                    factorForAllB = false;
                    break;
                }
            }

            if(factorOfAllA && factorForAllB) {
                count++;
            }
        }
        return count;
    }
    
}
