import java.util.HashSet;
import java.util.Scanner;

public class CommonCharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input strings S1 and S2
        String S1 = scanner.nextLine();
        String S2 = scanner.nextLine();
        
        // Create a set to store unique characters of S1
        HashSet<Character> set1 = new HashSet<>();
        for (char ch : S1.toCharArray()) {
            set1.add(ch);
        }

        // Create another set to store common characters
        HashSet<Character> commonSet = new HashSet<>();
        for (char ch : S2.toCharArray()) {
            if (set1.contains(ch)) {
                commonSet.add(ch);  // Add to common set only if it exists in S1
            }
        }

        // Print the count of unique common characters
        System.out.println(commonSet.size());
        
        scanner.close();
    }
}
