import java.util.HashSet;
import java.util.Set;

public class Pangrams {
    public static void main(String[] args) {
        System.out.println(pangrams("We promptly judged antique ivory buckles for the next prize"));
    }

    public static String pangrams(String s) {
        Set<Character> set = new HashSet<>();
        for (char ch : s.toLowerCase().replace(" ", "").toCharArray()) {
            set.add(ch);
        }

        return set.size() == 26 ? "pangram" : "not pangram";

    }
}
