package LeetCode;

public class JumpArray {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,1,0,4};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        int reachable = 0;

        for (int i = 0; i < nums.length; i++) {
            // If current index is not reachable
            if (i > reachable) {
                return false;
            }

            // Update the farthest reachable index
            reachable = Math.max(reachable, i + nums[i]);

            // Optional early exit
            if (reachable >= nums.length - 1) {
                return true;
            }
        }

        return true;
    }
    }

