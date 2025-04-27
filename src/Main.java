import services.FinanceService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FinanceService financeService = new FinanceService();

        System.out.println("Welcome to the Personal Finance System!");

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Add Transaction");
            System.out.println("2. View Transactions");
            System.out.println("3. Add Goal");
            System.out.println("4. View Goals");
            System.out.println("5. Add Money to Goal");
            System.out.println("6. View Budgets");
            System.out.println("7. View Summary");
            System.out.println("8. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter description of transaction:");
                    String description = scanner.nextLine();
                    System.out.println("Enter amount (negative for expense, positive for income):");
                    double amount = scanner.nextDouble();
                    financeService.addTransaction(description, amount);
                    System.out.println("Transaction added successfully.");
                    break;
                case 2:
                    financeService.viewTransactions();
                    break;
                case 3:
                    System.out.println("Enter goal name:");
                    String goalName = scanner.nextLine();
                    System.out.println("Enter target amount for the goal:");
                    double targetAmount = scanner.nextDouble();
                    financeService.addGoal(goalName, targetAmount);
                    System.out.println("Goal added successfully.");
                    break;
                case 4:
                    financeService.viewGoals();
                    break;
                case 5:
                    System.out.println("Enter goal name to add money towards:");
                    String targetGoal = scanner.nextLine();
                    System.out.println("Enter amount to add to the goal:");
                    double amountToAdd = scanner.nextDouble();
                    financeService.addMoneyToGoal(targetGoal, amountToAdd);
                    break;
                case 6:
                    financeService.viewBudgets();
                    break;
                case 7:
                    financeService.viewSummary();
                    break;
                case 8:
                    System.out.println("Exiting system...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
