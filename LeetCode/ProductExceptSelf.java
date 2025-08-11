package LeetCode;

import java.util.Arrays;
import java.util.List;

public class ProductExceptSelf {
    public static void main(String[] args) {
       List<Integer> list = Arrays.stream(productExceptSelfUsingDivision(new int[]{1,2,3,4})).boxed().toList();
       System.out.println(list); 

       for(int n : productExceptSelfWithoutDivision(new int[]{2,2,3,4})) {
        System.out.print(n + ",");
       }
    }




    //Time Complexicity O(n)
    public static int[] productExceptSelfUsingDivision(int[] nums) {
        //24, 12, 8, 6

        int[] newArr = new int[nums.length];

        int totalProduct = 1;
        int zeroCount = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                totalProduct *= nums[i];
            }else {
               zeroCount++; 
            }
        }
        if(zeroCount > 1) {
            return newArr;
        }
        
        if(zeroCount == 1) {
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] == 0) {
                    newArr[i] = totalProduct;
                    return newArr;
                }
            }
        }
        for(int i = 0; i < newArr.length; i++) {

            if(nums[i] != 0)
            newArr[i] = totalProduct/nums[i];
        }
        return newArr;
    }

    //without division approach

    public static int[] productExceptSelfWithoutDivision(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];

        output[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            output[i] = output[i-1] * nums[i - 1];
        }

        int suffix = 1;
        for (int i = n -1; i >=0; i--) {
            output[i] *= suffix;
            suffix *= nums[i];
        }

        return output;
    }

}