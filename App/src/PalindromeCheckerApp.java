public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Define input string
        String input = "madam";

        // Call recursive check method
        boolean isPalindrome = check(input, 0, input.length() - 1);

        // Output result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    /**
     * Recursively checks whether a string is palindrome.
     */
    private static boolean check(String s, int start, int end) {

        // Base case: If pointers cross or meet
        if (start >= end) {
            return true;
        }

        // If mismatch found
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call moving inward
        return check(s, start + 1, end - 1);
    }
}