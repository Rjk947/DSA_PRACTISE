public class CountingValleys {
    public static void main(String[] args) {
        System.out.println(countingValleys(8, "UDDDUDUU"));
    }

    public static int countingValleys(int steps, String path) {
    // Write your code here
    int level = 0;
    int valleys = 0;
    for(char chr: path.toCharArray()) {
        if(chr == 'U'){
            level++;
            if(level == 0) {
                valleys++;
            }
         }else if(chr == 'D'){
            level--;
         }
    
    }
    return valleys;
    }
}
