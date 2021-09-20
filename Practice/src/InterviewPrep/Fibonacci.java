package InterviewPrep;


public class Fibonacci {
    public static void main(String[] args) {
        printFibonacciNumbers(10);
    }

    public static void printFibonacciNumbers(int input){
        int firstNumber = 0;
        int secondNumber = 1;
        int thirdNumber;

        if(input == 1 || input ==2){
            System.out.println(1);
        }

        for (int i = 0; i <= input; i++){
            thirdNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
            System.out.println(thirdNumber);
        }
    }

}
