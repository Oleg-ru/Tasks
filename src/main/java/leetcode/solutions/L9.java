package leetcode.solutions;

/*
    9. Palindrome Number
Given an integer x, return true if x is palindrome integer.
An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.
 */
public class L9 {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        StringBuilder reverseInt = new StringBuilder();
        reverseInt.append(x).reverse();
        if (Long.parseLong(reverseInt.toString()) == x) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(99876543));
    }
}
