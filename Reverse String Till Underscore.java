import java.util.Scanner;

public class ReverseUntilUnderscore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        scanner.close();

        int underscoreIndex = S.indexOf('_'); // Find the first underscore

        // If underscore exists, reverse the substring till the first underscore
        if (underscoreIndex != -1) {
            String reversedPart = new StringBuilder(S.substring(0, underscoreIndex)).reverse().toString();
            String result = reversedPart + S.substring(underscoreIndex);
            System.out.println(result);
        } 
        // If no underscore exists, reverse the entire string
        else {
            String reversedString = new StringBuilder(S).reverse().toString();
            System.out.println(reversedString);
        }
    }
}
