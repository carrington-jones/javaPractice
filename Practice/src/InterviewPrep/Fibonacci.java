package InterviewPrep;


public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(printFibonacciNumbers("12"));
    }

    public static int printFibonacciNumbers(String input) {
        int i = Integer.parseInt(input);
        int num = 0;
        int num2 = 1;

        for (int j = 0; j < i; j++) {
            int fibonacci = num + num2;
            num = num2;
            num2 = fibonacci;
        }
        return num;
    }
}


