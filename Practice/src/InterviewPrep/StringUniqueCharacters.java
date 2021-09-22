package InterviewPrep;

// Determine if String has all unique characters

public class StringUniqueCharacters {
    public static void main(String[] args) {
        System.out.println(hasUniqueCharacters("Alve i@wsom"));
    }

    public static boolean hasUniqueCharacters(String input){
        for (int i = 0; i < input.length(); i++){
            char characterOfInputString = input.charAt(i);
            int count = 0;
            for (int j = i; j < input.length(); j++)
            {
                if(characterOfInputString==input.charAt(j))
                    count++;
            }
            if(count>1)
                return false;
        }
        return true;
    }
}
