import java.util.Random;

public class Product {
    private long id;
    private String name;
    private String category;
    private double price;
Random random = new Random();
    public Product(String name, String category, double price){
        this.id = random.nextLong(1, 10000000000L);
        this.name = name;
        this.category = category;
        this.price = price;

    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {

        return category;
    }

    public void setPrice(double price){

        this.price = price;
    }
}
