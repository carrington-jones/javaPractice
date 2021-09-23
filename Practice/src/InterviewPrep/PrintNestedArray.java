package InterviewPrep;

public class PrintNestedArray {
    public static void main(String[] args) {
        int[][] nestedArray = { {20, 15, 7},
                                {8, 7, 19},
                                {7, 13, 47} };

        System.out.println(nestedArray[0] [0]);
        System.out.println("-------------");

        for(int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                System.out.println(nestedArray[i][j]);

    }
}
