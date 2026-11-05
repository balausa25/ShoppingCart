public interface CartItem {
    void accept(CartVisitor visitor);
    String getName();
    double getPrice();
}