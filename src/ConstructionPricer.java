public class ConstructionPricer {
    private int lumber;
    private int window;
    private double taxRate;

    public ConstructionPricer(int lumber, int window, double taxRate) {
        this.lumber = lumber;
        this.window = window;
        this.taxRate = taxRate;
    }

    public double calculateTotalCost()
    {
        double costPerBoard = 11.50 * lumber;
        double costPerWindow = 25.75 * window;
        double totalCost = costPerBoard + costPerWindow;
        return (totalCost);
    }

    public double calculateTotalCostTaxed()
    {
        double taxAmt = calculateTotalCost() * taxRate;
        return(calculateTotalCost() + taxAmt);
    }
}
