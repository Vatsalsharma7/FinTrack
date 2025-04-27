package services;

import models.Transaction;
import models.Goal;
import models.Budget;

import java.util.ArrayList;
import java.util.List;

public class FinanceService {
    private List<Transaction> transactions;
    private List<Goal> goals;
    private List<Budget> budgets;

    public FinanceService() {
        this.transactions = new ArrayList<>();
        this.goals = new ArrayList<>();
        this.budgets = new ArrayList<>();
    }

    // Adding a transaction (income or expense)
    public void addTransaction(String description, double amount) {
        Transaction transaction = new Transaction(description, amount);
        transactions.add(transaction);
    }

    // Adding a goal
    public void addGoal(String goalName, double targetAmount) {
        Goal goal = new Goal(goalName, targetAmount);
        goals.add(goal);
    }

    // Add money towards a specific goal
    public void addMoneyToGoal(String goalName, double amount) {
        for (Goal goal : goals) {
            if (goal.getGoalName().equalsIgnoreCase(goalName)) {
                goal.addAmount(amount);
                System.out.println("Added " + amount + " to goal: " + goalName);
                return;
            }
        }
        System.out.println("Goal not found!");
    }

    // Viewing all transactions
    public void viewTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions to display.");
        } else {
            for (Transaction transaction : transactions) {
                System.out.println(transaction);
            }
        }
    }

    // Viewing all goals with stored money details
    public void viewGoals() {
        if (goals.isEmpty()) {
            System.out.println("No goals to display.");
        } else {
            for (Goal goal : goals) {
                System.out.println(goal);
            }
        }
    }

    // Viewing all budgets
    public void viewBudgets() {
        if (budgets.isEmpty()) {
            System.out.println("No budgets to display.");
        } else {
            for (Budget budget : budgets) {
                System.out.println(budget);
            }
        }
    }

    // View financial summary - showing each goal's saved amount and progress
    public void viewSummary() {
        double totalIncome = 0;
        double totalExpenses = 0;
        double totalSavedForGoals = 0;

        // Summing up income and expenses
        for (Transaction transaction : transactions) {
            if (transaction.getAmount() > 0) {
                totalIncome += transaction.getAmount();
            } else {
                totalExpenses += transaction.getAmount();
            }
        }

        // Summing up saved money towards goals
        double totalRemainingForGoals = 0;
        System.out.println("\nDetailed Goals Summary:");
        for (Goal goal : goals) {
            double remainingAmount = goal.getRemainingAmount();
            totalRemainingForGoals += remainingAmount;

            // Printing goal-specific details
            System.out.println("\nGoal: " + goal.getGoalName());
            System.out.println("  Target Amount: " + goal.getTargetAmount());
            System.out.println("  Amount Saved: " + goal.getCurrentAmount());
            System.out.println("  Remaining Amount: " + remainingAmount);
        }

        // Overall summary
        System.out.println("\nOverall Financial Summary:");
        System.out.println("Total Income: " + totalIncome);
        System.out.println("Total Expenses: " + totalExpenses);
        System.out.println("Net Balance: " + (totalIncome + totalExpenses));
        System.out.println("Total Saved for Goals: " + totalSavedForGoals);
        System.out.println("Total Remaining for Goals: " + totalRemainingForGoals);
    }
}
