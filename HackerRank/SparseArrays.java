import java.io.*;
import java.util.*;
import java.util.stream.*;
// import static java.util.stream.Collectors.joining;
// import static java.util.stream.Collectors.toList;



public class SparseArrays {
    public static void main(String[] args) throws IOException {
        List<String> strings = Arrays.asList("a", "b", "a", "c", "a");
        List<String> queries = Arrays.asList("a", "b", "d", "a");

        System.out.println(matchingStrings(strings, queries)); // Output: [3, 1, 0, 3]
    }

        /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     * 1. STRING_ARRAY strings
     * 2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here

        // O(n+m) complexity
        // Map<String, Integer> map = new LinkedHashMap<>();
        // for(String str : strings) {
        // map.put(str, map.getOrDefault(str, 0)+1);
        // }
        // List<Integer> result = new ArrayList<>();
        // for(String el: queries) {
        // result.add(map.getOrDefault(el, 0));
        // }
        // return result;

        // O(n*m) complexity

        // List<Integer> list = new ArrayList<>();
        // for(String query: queries) {
        // list.add(giveQueryCount(query, strings));
        // }
        // return list;

        // }

        // public static int giveQueryCount(String query, List<String> strings) {
        // int count = 0;
        // for(String string: strings) {
        // if(query.equals(string)) {
        // count++;
        // }
        // }
        // return count;

        // Java 8 solution O(n*m)

        return queries.stream().map(el -> Collections.frequency(strings, el)).collect(Collectors.toList());
    }
}
