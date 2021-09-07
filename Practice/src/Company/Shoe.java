package Company;

public class Shoe extends Product{
    public String brand;
    public String shoeType;

    public Shoe(double price, String name, double cost, String type, String brand, String shoeType) {
        super(price, name, cost, type);
        this.brand = brand;
        this.shoeType = shoeType;
    }

    @Override public String getName(){
        return "This show is a " + shoeType + " " + "and it is made by " + brand;
    }
}
