package Company;

import java.util.Scanner;

public class CompanyInventoryApplication {

    static Product[] products = new Product[3];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        products[0] = new Product("toothbrush", 3.99, "product", 1.99);
        products[1] = new Car("Ford Truck", 49_000.99, "car", 25_000.00, "Ford", "f150");
        products[2] = new Shoe("CowboyBoots", 149.99, "shoe", 59.99, "Justin", "Boot");
    }
}
