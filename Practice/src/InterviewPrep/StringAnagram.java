package InterviewPrep;

import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args) {
        String word1 = "Angel";
        String word2 = "Anelg";

        System.out.println(isAnagram(word1, word2));

        String arraySortWord1 = "listen";
        String arraySortWord2 = "silent";

        System.out.println(isAnagramArraySort(arraySortWord1, arraySortWord2));
    }

    public static boolean isAnagram(String firstWord, String secondWord){
        if(firstWord.length() != secondWord.length())
            return false;

        for (int i = 0; i < firstWord.length(); i++){
            char c = firstWord.charAt(i);
            int index = secondWord.indexOf(c);

            if (index != -1) {
                secondWord = secondWord.substring(0, index) + secondWord.substring(index + 1, secondWord.length());
            } else {
                return false;
            }
        }
        return secondWord.isEmpty();
    }

    //Much easier way
    public static boolean isAnagramArraySort(String firstWord, String secondWord){
        String sortedFirstWord = sortChars(firstWord);
        String sortedSecondWord = sortChars(secondWord);
        return sortedFirstWord.equals(sortedSecondWord);
    }

    public static String sortChars(String word){
        char[] wordArr = word.toLowerCase().toCharArray();
        Arrays.sort(wordArr);
        return String.valueOf(wordArr);
    }
}


