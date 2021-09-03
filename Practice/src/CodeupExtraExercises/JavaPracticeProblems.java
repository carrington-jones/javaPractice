package CodeupExtraExercises;

public class JavaPracticeProblems {
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));

    }

//    A palindrome is a word which reads the same backward or forward. 'abcba' is a palindrome.
//    Write a method that detects if a string is a palindrome.

//    SOLUTION:
public static boolean isPalindrome(String word) {
    int i1 = 0;
    int i2 = word.length() - 1;
    while (i2 > i1) {
        if (word.charAt(i1) != word.charAt(i2)) {
            return false;
        }
        ++i1;
        --i2;
    }
    return true;
}

}
