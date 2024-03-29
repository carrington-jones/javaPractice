package Company;

public class Product {
    protected String name;
    protected double price;
    protected String type;
    protected double cost;

    public Product(String name, double price, String type, double cost) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.cost = cost;
    }

//    public double getProfit() {
//        return price - cost;
//    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getType() {
        System.out.println("Product is a " + type);
    }

    public void setType(String type) {
        this.type = type;
    }
}
