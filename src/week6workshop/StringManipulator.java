package week6workshop;

public class StringManipulator {

    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public String toUpperCase(String input) {
        return input.toUpperCase();
    }

    public boolean isPalindrome(String input) {
        return input.equals(reverse(input));
    }

    public int countVowels(String input) {
        int count = 0;
        for (char c : input.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) count++;
        }
        return count;
    }
}
