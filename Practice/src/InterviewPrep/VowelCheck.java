package InterviewPrep;

public class VowelCheck {
    public static void main(String[] args) {

    }

    public static boolean stringContainsVowel(String input){
        return input.toLowerCase().matches(".*[aeiou].*"); //.matches uses regex to check for pattern
    }
}
