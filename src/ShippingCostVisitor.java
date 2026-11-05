public class ShippingCostVisitor implements CartVisitor {
    private static final double COST_PER_KG = 5.0;
    private double totalWeight = 0;

    @Override
    public void visit(Book book) {
        totalWeight += book.getWeightKg();
    }

    @Override
    public void visit(Electronics electronics) {
        totalWeight += electronics.getWeightKg();
    }

    @Override
    public void visit(Clothing clothing) {
        totalWeight += clothing.getWeightKg();
    }

    public double getShippingCost() {
        return totalWeight * COST_PER_KG;
    }
}
