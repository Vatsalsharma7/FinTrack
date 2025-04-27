package models;

public class Goal {
    private String goalName;
    private double targetAmount;
    private double currentAmount;

    public Goal(String goalName, double targetAmount) {
        this.goalName = goalName;
        this.targetAmount = targetAmount;
        this.currentAmount = 0;
    }

    public String getGoalName() {
        return goalName;
    }

    public double getTargetAmount() {
        return targetAmount;
    }

    public double getCurrentAmount() {
        return currentAmount;
    }

    public void addAmount(double amount) {
        this.currentAmount += amount;
    }

    public double getRemainingAmount() {
        return targetAmount - currentAmount;
    }

    @Override
    public String toString() {
        return "Goal: " + goalName + ", Target: " + targetAmount + ", Saved: " + currentAmount;
    }
}
