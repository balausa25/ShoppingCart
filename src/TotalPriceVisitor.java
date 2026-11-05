public class TotalPriceVisitor implements CartVisitor {
    private double totalPrice = 0;

    @Override
    public void visit(Book book) {
        totalPrice += book.getPrice();
    }

    @Override
    public void visit(Electronics electronics) {
        totalPrice += electronics.getPrice();
    }

    @Override
    public void visit(Clothing clothing) {
        totalPrice += clothing.getPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}