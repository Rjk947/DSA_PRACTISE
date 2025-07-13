import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChallengeWeek2 {
    public static void main(String[] args) {

        // Flipping the Matrix
        List<List<Integer>> matrix = new ArrayList<>(Arrays.asList(Arrays.asList(   112, 42, 83, 119), Arrays.asList(56, 125, 56, 49), Arrays.asList(15, 78, 101, 43), Arrays.asList(62, 98, 114, 108)));

        System.out.println(flippingMatrix(matrix));


    }

    public static int flippingMatrix(List<List<Integer>> matrix) {
        int n = matrix.size()/2;
        int maxSum = 0;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                int topLeft = matrix.get(i).get(j);
                int topRight = matrix.get(i).get(2*n-1-j);
                int bottomLeft = matrix.get(2*n-1-i).get(j);
                int bottomRight = matrix.get(2*n-1-i).get(2*n-1-j);

                maxSum += Math.max(Math.max(topLeft, topRight), Math.max(bottomLeft, bottomRight));
            }
        }
        return maxSum;
    }

}
