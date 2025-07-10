import java.util.ArrayList;
import java.util.List;

public class MarsExploration {
    public static void main(String[] args) {
        //due to radiation in space, message from marsh coming in form of SOSSOS is changed to SOSTOT give the count of letter in SOS message changed

        System.out.println(marsExploration("SOSTOT"));
    }

    public static int marsExploration(String s) {
        // Write your code here
        int count = 0;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i += 3) {
            list.add(s.substring(i, i + 3));
        }

        for (String str : list) {
            if (str.charAt(0) != 'S')
                count++;
            if (str.charAt(1) != 'O')
                count++;
            if (str.charAt(2) != 'S')
                count++;

        }

        return count;

    }
}
