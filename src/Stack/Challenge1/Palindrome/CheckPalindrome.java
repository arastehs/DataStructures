package Stack.Challenge1.Palindrome;

import java.util.LinkedList;

public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        System.out.println(checkForPalindrome("hello"));
    }

    private static boolean checkForPalindrome(String input) {
        LinkedList<Character> stack = new LinkedList<Character>();
        String noPunctuationStr = input.toLowerCase().trim();
        StringBuilder finalStr = new StringBuilder();
        int size = noPunctuationStr.length();
        for (int i = 0; i < size; i++) {
            if (noPunctuationStr.charAt(i) >= 'a' && noPunctuationStr.charAt(i) <= 'z') {
                stack.push(noPunctuationStr.charAt(i));
                finalStr.append(noPunctuationStr.charAt(i));
            }

        }

        StringBuilder reversedStr = new StringBuilder();

        while (!stack.isEmpty()) {
            reversedStr.append(stack.pop());
        }

        return reversedStr.toString().equals(finalStr.toString());


    }
}
