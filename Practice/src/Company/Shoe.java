package Company;

public class Shoe extends Product{
    public String brand;
    public String shoeType;

    public Shoe(String name, double price, String type, double cost, String brand, String shoeType) {
        super(name, price, type, cost);
        this.brand = brand;
        this.shoeType = shoeType;
    }

    @Override public String getName(){
        return "This show is a " + shoeType + " " + "and it is made by " + brand;
    }
}
