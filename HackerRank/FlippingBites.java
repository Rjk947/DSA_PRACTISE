public class FlippingBites {
    public static void main(String[] args) {
        System.out.println(flippingBits(4294967293l));
    }

    public static long flippingBits(long n) {
        // Write your code here
        String binary = String.format("%32s", Long.toBinaryString(n))
                .replace(' ', '0');
        String flippedBinary = binary.chars().mapToObj(el -> el == '1' ? "0" : "1")
                .reduce("", (a, b) -> a + b);
        return Long.parseLong(flippedBinary, 2);
    }
}
