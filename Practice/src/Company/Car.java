package Company;

public class Car extends Product{
    protected String make;
    protected String model;

    public Car(String name, double price, String type, double cost, String make, String model) {
        super(name, price, type, cost);
        this.make = make;
        this.model = model;
    }

    @Override public String getName(){
        return "This car is a " + make + " " + model + "!";
    }
}
