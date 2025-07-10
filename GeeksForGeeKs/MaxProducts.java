package GeeksForGeeKs;

public class MaxProducts {
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[] { 6, -3, -10, 0, 2 }));
    }

    public static int maxProduct(int[] arr) {
        // code here
        int maxProduct = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int mul = 1;

            for (int j = i; j < arr.length; j++) {
                mul *= arr[j];

                maxProduct = Math.max(maxProduct, mul);
            }
        }

        return maxProduct;

    }
}
