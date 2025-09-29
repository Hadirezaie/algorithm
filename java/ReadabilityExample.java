package java;

public class ReadabilityExample {

    // Bad - Unclear
    public static double calc(double a, double b, double c) {
        return (a * b) + (a * c) - (b * c);
    }

    // Good - Clear and readable
    public static double calculateProjectProfit(
            int unitsSold,
            double productionCost,
            double sellingPrice) {
        final double totalRevenue = unitsSold * sellingPrice;
        final double totalCost = unitsSold * productionCost;
        final double netProfit = totalRevenue - totalCost;

        return netProfit;
    }

    public static void main(String[] args) {
        double profit = calculateProjectProfit(100, 5.0, 8.5);
        System.out.println("Net profit: " + profit); // Output: 350.0
    }
}
