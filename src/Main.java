import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CartItem> cart = new ArrayList<>();
        cart.add(new Book("Clean Code", 35.0, 0.8));
        cart.add(new Electronics("Laptop", 1200.0, 2.5));
        cart.add(new Clothing("T-Shirt", 25.0, 0.3));


        TotalPriceVisitor priceVisitor = new TotalPriceVisitor();
        for (CartItem item : cart) {
            item.accept(priceVisitor);
        }
        System.out.println("Total Price: $" + priceVisitor.getTotalPrice());


        ShippingCostVisitor shippingVisitor = new ShippingCostVisitor();
        for (CartItem item : cart) {
            item.accept(shippingVisitor);
        }
        System.out.println("Shipping Cost: $" + shippingVisitor.getShippingCost());
    }
}