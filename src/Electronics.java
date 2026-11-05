public class Electronics implements CartItem {
    private final String name;
    private final double price;
    private final double weightKg;

    public Electronics(String name, double price, double weightKg) {
        this.name = name;
        this.price = price;
        this.weightKg = weightKg;
    }

    public double getWeightKg() { return weightKg; }

    @Override
    public String getName() { return name; }

    @Override
    public double getPrice() { return price; }

    @Override
    public void accept(CartVisitor visitor) {
        visitor.visit(this);
    }
}