package models;

public class Budget {
    private String category;
    private double limit;
    private double currentAmount;

    public Budget(String category, double limit) {
        this.category = category;
        this.limit = limit;
        this.currentAmount = 0;
    }

    public String getCategory() {
        return category;
    }

    public double getLimit() {
        return limit;
    }

    public double getCurrentAmount() {
        return currentAmount;
    }

    public void addAmount(double amount) {
        this.currentAmount += amount;
    }

    @Override
    public String toString() {
        return "Category: " + category + " | Limit: " + limit + " | Current: " + currentAmount;
    }
}
