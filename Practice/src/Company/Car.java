package Company;

public class Car extends Product{
    protected String make;
    protected String model;

    public Car(double price, String name, double cost, String type, String make, String model) {
        super(price, name, cost, type);
        this.make = make;
        this.model = model;
    }

    @Override public String getName(){
        return "This car is a " + make + " " + model + "!";
    }
}
