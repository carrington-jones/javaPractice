package InterviewPrep;

public class StringReversal {
    public static void main(String[] args) {
        String testStr = "Carrington";
        System.out.println(reverse(testStr));

    }

    public static String reverse (String in){
        StringBuilder out = new StringBuilder();

        char[] chars = in.toCharArray();
        for(int i = chars.length -1; i >= 0; i--)
            out.append(chars[i]);

        return out.toString();
    }
}
