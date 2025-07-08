package GeeksForGeeKs;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubArraySum(arr));
    }

    public static int maxSubArraySum(int[] arr) {
        int result = arr[0];
        // for(int i = 0; i<arr.length; i++) {
        //     int currSum = 0;

        //     for(int j = i; j<arr.length; j++) {
        //         currSum = currSum +arr[j];

        //         result = Math.max(result, currSum);
        //     }
        // }

        //Kadane's Algorithm

        int maxEnding = arr[0];
        for(int i = 1; i<arr.length; i++) {
            maxEnding = Math.max(arr[i], arr[i]+maxEnding);

            result = Math.max(maxEnding, result);
        }
        return result;
    }
}

