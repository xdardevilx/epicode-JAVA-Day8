import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        Product n1 = new Product("harry potter e la camera dei segreti", "books", 15.10);
        Product n2= new Product("il signore degli anelli", "books", 30.10);
        Product n3 = new Product("divergent", "books", 45.99);
        Product n4 = new Product("insurgent", "books", 62.10);
        Product n5 = new Product("mary poppins", "books", 150.55);
        Product n6 = new Product("pannolini", "baby", 101.50);
        Product n7 = new Product("tutina", "baby", 55.25);
        Product n8 = new Product("scarpette", "baby", 180.99);
        Product n9 = new Product("boxer", "boys", 55.99);
        Product n10 = new Product("t-shirt", "boys", 75);
        Product n11 = new Product("jeans", "boys", 95);
        products.add(n1);
        products.add(n2);
        products.add(n3);
        products.add(n4);
        products.add(n5);
        products.add(n6);
        products.add(n7);
        products.add(n8);
        products.add(n9);
        products.add(n10);
        products.add(n11);

        Customer customer = new Customer("valerio", "10");
        Order order = new Order("pendind", LocalDate.now(), products, customer);

        n1.sameCategory(products).forEach(product ->{
            if( product.getPrice() > 100 ){
                System.out.println(product.getName() + " - " + product.getPrice());
            }
        } );

        System.out.println("----------------------------------ordine baby------------------");

        order.getProducts().forEach(product ->{
            if(product.getCategory().equals("baby")){
                System.out.println(product.getName() + " - " + " - " + product.getCategory() +  " - " + product.getPrice());
            }
        });

        System.out.println("-------------------------------- prodotti boys-------------------------");
        n1.searchCategoryByBoys(products).forEach(product -> {
            System.out.println(product.getName() + " - " + " - " + product.getCategory() +  " - " + product.getPrice());
        });



    }
}