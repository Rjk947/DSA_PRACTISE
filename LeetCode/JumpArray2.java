package LeetCode;

public class JumpArray2 {
    public static void main(String[] args) {
        System.out.println(jumpArray2(new int[]{2,3,1,1,4}));
    }

    public static int jumpArray2(int [] nums) {
        int n = nums.length;
        int jump = 0;
        int farthest = 0;
        int currentEnd = 0;
        for(int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            if(currentEnd == i) {
                jump++;
                currentEnd = farthest;
            }
        }

        return jump;
    }
}
