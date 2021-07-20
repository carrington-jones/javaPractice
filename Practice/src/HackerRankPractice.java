import java.util.Scanner;
import java.util.Calendar;
import java.time.LocalDate;

public class HackerRankPractice {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        String s = scanner.nextLine();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//        if (n % 2 != 0) {
//            System.out.println("Weird1");
//        }
//
//        if ((n > 2 && n < 5) && (n % 2 == 0)) {
//            System.out.println("Not Weird2");
//        }
//
//        if ((n > 6 && n < 20) && (n % 2 == 0)) {
//            System.out.println("Weird3");
//        }
//
//        if (n > 20 && n % 2 == 0) {
//            System.out.println("Not Weird4");
//        } else {
//            System.out.println("Not Weird5");
//        }
//
//        scanner.close();

//        Scanner scan = new Scanner(System.in);
//        int i = scan.nextInt();
//        scan.nextLine();
//        double d = scan.nextDouble();
//        scan.nextLine();
//        String s = scan.nextLine();
//
//         Write your code here.
//
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);


//        Scanner sc=new Scanner(System.in);
//        System.out.println("================================");
//        for(int i=0;i<3;i++){
//            String s1=sc.next();
//            String x=sc.nextLine();
//            System.out.printf("%s %s%n",s1,x);
        //Complete this line
//        }
//        System.out.println("================================");

//        for (int i = 0; i <= 10;i++){
//            System.out.println("2 x " + i + " = " + (2*i));
//        }

//        Given an input integer, you must determine which primitive data types are capable of properly storing that input.

//        Scanner sc = new Scanner(System.in);
//        int t=sc.nextInt();
//
//        for(int i=0;i<t;i++)
//        {
//
//            try
//            {
//                long x=sc.nextLong();
//                System.out.println(x+" can be fitted in:");
//                if(x>=-128 && x<=127)
//                    System.out.println("* byte");
//                if(x>=-32_768 && x<=32_767)
//                System.out.println("* short");
//                if(x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1)
//                    System.out.println("* int");
//                if(x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1)
//                    System.out.println("* long");
//            }
//            catch(Exception e)
//            {
//                System.out.println(sc.next()+" can't be fitted anywhere.");
//            }
//
//        }
//
//     * Complete the 'findDay' function below.
//     *
//     * The function is expected to return a STRING.
//                * The function accepts following parameters:
//     *  1. INTEGER month
//     *  2. INTEGER day
//     *  3. INTEGER year
//     */
        //System.out.println(findDay(10,23,1989));
        //}

//    public static String findDay(int month, int day, int year) {
//        return LocalDate.of(year, month, day).getDayOfWeek().name();
//    }


        //You are given an integer n, you have to convert it into a string.
        //
        //Please complete the partially completed code in the editor. If your code successfully converts n into a string s the code will print "Good job". Otherwise it will print "Wrong answer".
        //
        // n can range between -100 to 100 inclusive.

//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        if(n<=100 && n>=-100){
//            String testString = Integer.toString(n);
//            if (testString instanceof String){
//                System.out.println("Good job");
//            } else {
//                System.out.println("Wrong answer");
//            }
//        }

//        Scanner scanner = new Scanner(System.in);
//        String A = scanner.nextLine();
//        String B = scanner.nextLine();
//        int count = 0;
//        int count2 = 0;
//        for (int i = 0; i < A.length(); i++) {
//            if (A.charAt(i) != ' ')
//                count++;
//        }
//        for (int i = 0; i < B.length(); i++) {
//            if (B.charAt(i) != ' ')
//                count2++;
//        }
//        System.out.println(count + count2);

//        There are three lines of output:
//        For the first line, sum the lengths of A and B.
//        For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
//        For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.

//        Scanner sc = new Scanner(System.in);
//        String A = sc.next();
//        String B = sc.next();
//        int add = A.length() + B.length();
//        System.out.println(add);
//        int lex = (A.compareTo(B));
//        if (lex > 0) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//        String firstWord = A.substring(0, 1).toUpperCase() + A.substring(1);
//        String secondWord = B.substring(0, 1).toUpperCase() + B.substring(1);
//        System.out.println(firstWord + " " + secondWord);

//        You are given an interface AdvancedArithmetic which contains a method signature int divisor_sum(int n). You need to write a class called MyCalculator which implements the interface.
//        divisorSum function just takes an integer as input and return the sum of all its divisors. For example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12. The value of n will be at most 1000.
//        Read the partially completed code in the editor and complete it. You just need to write the MyCalculator class only. Your class shouldn't be public.
//        class MyCalculator implements AdvancedArithmetic {
//            public int divisor_sum(int n) {
//                int s = 1;
//                int f = 0;
//                int v = 0;
//                while (s <= n) {
//                    if (n % s == 0) {
//                        f = s;
//                        v += f;
//                    }
//                    s++;
//
//                }
//                return v;
//            }

        }
    }





