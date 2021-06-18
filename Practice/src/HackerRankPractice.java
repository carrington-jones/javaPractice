import java.util.Scanner;

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

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        scan.nextLine();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

