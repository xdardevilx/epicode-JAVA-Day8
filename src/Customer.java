import java.util.Random;

public class Customer {
    private long id;
    private String name;
    private String tier;

Random random = new Random();
    public Customer(String name, String tier) {
        this.id = random.nextLong(1, 10000000000L);

        this.name = name;
        this.tier = tier;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTier() {
        return tier;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tier='" + tier + '\'' +
                '}';
    }

}
