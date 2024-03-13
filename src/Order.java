import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class Order {
    private long id;
    private String status;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private List<Product> products;
    private Customer customer;

    Random random = new Random();
    public Order (String status, LocalDate orderDate, List<Product> products, Customer customer){
        this.id = random.nextLong(1, 10000000000L);
        this.status = status;
        this.orderDate = orderDate;
        this.products = products;
        this.customer = customer;
        this.deliveryDate = orderDate.plusDays(10);

    }

    public List<Product> getProducts(){
        return this.products;
    }

}
