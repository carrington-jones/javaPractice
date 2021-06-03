import java.util.Arrays;

public class ArraysLec {
    public static void main(String[] args) {
        int[] numbers = {14, 64, 34, 44};

        //To change element in an array
        numbers[1] = 33;

        //Will not be able to read
        System.out.println(numbers);

        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        //This is an enhanced for loop. Same loop as line 5.
        for (int number : numbers) {
            System.out.println(number);
        }

        String[] topFiveExampleNames = new String[6];
        // The 6th element is null which is default value given when not assigned.

        topFiveExampleNames[0] = "Greg";
        topFiveExampleNames[1] = "Jim";
        topFiveExampleNames[2] = "Geoff";
        topFiveExampleNames[3] = "Naysa";
        topFiveExampleNames[4] = "Hideo";

        for(String name : topFiveExampleNames){
            System.out.println(name);
        }

        boolean[] lookingAtDefaultValues = new boolean[3];

        for (boolean boo: lookingAtDefaultValues){
            System.out.println(boo);
        }

        //Changes value to true
        Arrays.fill(lookingAtDefaultValues, true);

        for (boolean boo: lookingAtDefaultValues){
            System.out.println(boo);
        }

        //This changes values of all array elements to "Jim"
        Arrays.fill(topFiveExampleNames, "Jim");

        for(String name : topFiveExampleNames){
            System.out.println(name);
        }

        int[] alsoNumbers = {14, 35, 67, 29};

        for(int number : alsoNumbers){
            System.out.println(number);
        }

        //This is how you compare arrays. This particular example returns false.
        System.out.println(Arrays.equals(numbers, alsoNumbers));


        //This is how you add length to numbers. You can now define value of the 5th element.
        int[] yetEvenMoreNumbers = Arrays.copyOf(numbers, 5);

        for(int number : yetEvenMoreNumbers){
            System.out.println(number);
        }


        //This is how you sort arrays in Java
        int[] unsortedNightmare = {99, -19, 88, 0, 3, 44, 13};

        Arrays.sort(unsortedNightmare);

        System.out.println(Arrays.toString(unsortedNightmare));

        //Double Array
        char[][] letters = {
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'},
        };

        for (char[] row : letters) {
            System.out.println("+---+---+---+");

            System.out.print("| "); // Notice this line is just "print" and not "println"

            for(char n : row){
                System.out.print(n + " | "); // Notice this line is just "print" and not "println"
            }
            System.out.println();
        }
        System.out.println("+---+---+---+");
    }
}
