package Company;

public class Subscription extends Product{
    public String subscriptionType;

    public Subscription(String name, double price, String type, double cost, String subscriptionType) {
        super(name, price, type, cost);
        this.subscriptionType = subscriptionType;
    }

    @Override public String getName(){
        return "This subscription type is " + subscriptionType;
    }
}
