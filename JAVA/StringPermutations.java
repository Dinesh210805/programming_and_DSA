import java.util.*;

public class StringPermutations {
    
    static int callCount = 0;

    static void permute(String str, String result, Set<String> results) {
        callCount++;
        System.out.println("Call " + callCount + ": permute(str=\"" + str + "\", result=\"" + result + "\")");

        if (str.length() == 0) {
            System.out.println("  ↳ Base Case Hit! Adding permutation: " + result);
            results.add(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            
            System.out.println("  i = " + i + ", ch = '" + ch + "', remaining = \"" + remaining + "\", newResult = \"" + result + ch + "\"");

            permute(remaining, result + ch, results);
        }

        System.out.println("Returning from: permute(str=\"" + str + "\", result=\"" + result + "\")");
    }

    public static void main(String[] args) {
        String input = "aaaaaaaa";
        Set<String> uniquePermutations = new HashSet<>();

        System.out.println("Starting permutation generation for input: \"" + input + "\"\n");

        permute(input, "", uniquePermutations);

        System.out.println("\n✅ Final Unique Permutations:");
        for (String perm : uniquePermutations) {
            System.out.println(" - " + perm);
        }

        System.out.println("\n🔢 Total Unique Permutations: " + uniquePermutations.size());
    }
}
