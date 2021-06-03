public class JavaArraysPractice {
    public static void main(String[] args) {
        System.out.println("Welcome to our zombie program!!");

        String backpack[] = {"Shotgun", "Rifle", "Sniper"};
        String zombies[] = {"Close-range zombie", "Mid-range zombie", "Long-range zombie"};
        System.out.println("Backpack items!");
        System.out.println(backpack[0]);
        System.out.println(backpack[1]);
        System.out.println(backpack[2]);

        System.out.println("These are the zombies!");
        System.out.println(zombies[0]);
        System.out.println(zombies[1]);
        System.out.println(zombies[2]);

        int numbersZombiesHATE[] = {4, 90, 70, 123, 12, 4, 561, 1};
        System.out.println(numbersZombiesHATE[6]);

        double[] prices;
        prices = new double [4];

        int [] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 75;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]); //Throws an error because there is not a fourth element in the array.
    }

}
