package java8.iQs.streams.code;

import java.util.stream.IntStream;

// reverse the given number / given string
public class PalindromeCheckUsingStreams {

    public static void main(String[] args) {
        int numberToCheck = 12321;  // Change this to the number you want to check

        if (isPalindrome(numberToCheck)) {
            System.out.println(numberToCheck + " is a palindrome.");
        } else {
            System.out.println(numberToCheck + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int number) {
        String numStr = String.valueOf(number);
        return IntStream.range(0, numStr.length() / 2)
                .noneMatch(i -> numStr.charAt(i) != numStr.charAt(numStr.length() - i - 1));
    }
}
