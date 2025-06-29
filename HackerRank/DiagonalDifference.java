import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>(Arrays.asList(Arrays.asList(1,3,4), Arrays.asList(2, 7, 8), Arrays.asList(2, 7, 8)));
        System.out.println(diagonalDifference(list));

    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int firstDiagonal = 0;
        int secondDiagonal = 0;
        int n = arr.size() - 1;
        for (int i = 0; i<arr.size(); i++) {
            firstDiagonal += arr.get(i).get(i);
            secondDiagonal += arr.get(i).get(n-i);
        }

        return Math.abs(firstDiagonal - secondDiagonal);

    }
}
