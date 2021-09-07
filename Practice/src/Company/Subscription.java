package Company;

public class Subscription extends Product{
    public String subscriptionType;

    public Subscription(double price, String name, double cost, String type, String subscriptionType) {
        super(price, name, cost, type);
        this.subscriptionType = subscriptionType;
    }

    @Override public String getName(){
        return "This subscription type is " + subscriptionType;
    }
}
