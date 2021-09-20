package InterviewPrep;

import static InterviewPrep.StringReversal.reverse;

public class StringPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(stringReversal("abcd"));

    }

    public static boolean isPalindrome(String input){
        String reverse = reverse(input);
        if(input.equals(reverse)){
            return true;
        }
        return false;
    }

    //
    public static String stringReversal(String input){
        if(input == null || input.isEmpty()){
            return input;
        }

        return input.charAt(input.length() - 1) + reverse(input.substring(0, input.length() - 1));
    }
}
