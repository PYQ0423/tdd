/**
 * @program: unitTest1
 * @author: Programming Queen
 * @create: 2019-11-06 20:59
 **/

public class PalindromeChecker {


    public boolean isPalindrome(String string) {
        return  (string.equalsIgnoreCase(getReversedString(string)));
    }

    private String getReversedString(String string) {
        StringBuilder reverseString = new StringBuilder(string);
        reverseString.reverse();
        return reverseString.toString();
    }
}

