import java.util.*;

public class MissingAlphabetPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        System.out.println(findMissingCharacter(s));
    }

    public static char findMissingCharacter(String s) {
        int left = 0, right = s.length() - 1;

        // Compare characters from both ends towards the center.
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                // If removing the left character makes it a palindrome.
                if (isPalindromeAfterRemoval(s, left)) {
                    return s.charAt(left);
                } else {
                    return s.charAt(right);
                }
            }
            left++;
            right--;
        }
        return '\0';  // Shouldn't reach here for valid inputs.
    }

    // Helper function to check if the string becomes a palindrome after removing a character at index 'pos'.
    public static boolean isPalindromeAfterRemoval(String s, int pos) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (left == pos) left++;  // Skip the removed character.
            else if (right == pos) right--;  // Skip the removed character.
            else if (s.charAt(left) != s.charAt(right)) return false;

            left++;
            right--;
        }
        return true;
    }
}
