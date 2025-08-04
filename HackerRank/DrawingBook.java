
public class DrawingBook {
    public static void main(String[] args) {
        System.out.println(pageCount(5, 3));
    }

    public static int pageCount(int n, int p) {
        return Math.min(p/2, (n/2-p/2));
    }
}
