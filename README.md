# FinTrack💰📊
[![Java](https://img.shields.io/badge/Java-21-blue.svg)](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
[![Status](https://img.shields.io/badge/Build-Complete-brightgreen.svg)](https://github.com/yourusername/PersonalFinanceSystem/actions)
[![OOP](https://img.shields.io/badge/OOP-Yes-blue.svg)](https://en.wikipedia.org/wiki/Object-oriented_programming)
[![CLI](https://img.shields.io/badge/CLI-Command_Line-yellow.svg)](https://en.wikipedia.org/wiki/Command-line_interface)

FinTrack is a simple yet powerful CLI-based personal finance management system designed to help individuals track their income, expenses, and financial goals. The application enables users to manage their finances more efficiently by offering tools to record transactions, manage savings goals, and view detailed summaries of their financial status.

In today's fast-paced world, managing personal finances has become increasingly important, and FinTrack provides a straightforward way for individuals to keep track of their spending habits and savings progress. Whether you are a student trying to manage a small budget or someone looking to save up for a big purchase, FinTrack provides the basic tools to track your finances and keep a close eye on your savings goals.

## Features🛠️
### 1. Add Transactions💵
Record Income and Expenses: Track all your income and expenses by specifying a description (e.g., "Salary", "Grocery Shopping") and an amount. Transactions are categorized as income (positive amounts) or expenses (negative amounts).

### 2. Track Financial Goals🎯
Set and Manage Goals: Create financial goals like "Emergency Fund", "Vacation Fund", or "Car Purchase". Set a target amount for each goal and monitor progress by adding funds towards the goal over time.

### 3. View Transactions📜
View All Transactions: A comprehensive list of all recorded transactions (both income and expenses), showing the description, amount, and the time the transaction occurred.

### 4. View Goals🎯
Goal Tracking: View a list of all financial goals, showing the target amount, the amount saved, and the remaining amount required to achieve the goal.

### 5. Add Money to Goal💸
Track Goal Contributions: Allocate money towards a specific goal. This feature helps you track how much you have contributed to each goal over time and allows for incremental savings.

### 6. View Financial Summary📊
Detailed Overview: Get a summary of your financial health, including:

Total income and expenses

Net balance (income minus expenses)

Detailed savings progress for each financial goal

## Concepts Used🧑‍💻
This project demonstrates the use of several key programming concepts:

### 1. Object-Oriented Programming (OOP)
Classes and Objects: The system uses classes like Transaction, Goal, and FinanceService to represent real-world entities and encapsulate related behaviors.

Encapsulation: Attributes (e.g., amount, description) are private to the classes and can only be accessed through getter and setter methods.

Inheritance (Planned): Future versions may incorporate subclasses to represent different types of transactions or goals.

Polymorphism (Planned): Future improvements can include method overriding for specialized goal types or transaction behaviors.

Abstraction: The FinanceService class abstracts the logic of managing financial data, keeping the main program logic clean and focused on interacting with the user.

### 2. MVC Architecture
The project follows the Model-View-Controller pattern, even though it is CLI-based. Models represent the financial entities (transactions, goals), the service layer handles business logic, and the controller (not fully used in CLI) interacts with the user.

### 3. Input/Output Handling
The application uses Java’s standard input-output system to take user input and display the results.

### 4. Data Structure Usage
ArrayLists: Used to store transactions and goals dynamically.

Loops and Conditionals: Employed to iterate over user data and present information in a structured format.

### 5. Exception Handling
Basic error handling is in place to ensure that user inputs are valid and provide appropriate feedback.

## Future Enhancements🚀
Data Persistence: Implement file-based storage (using JSON or text files) to save transactions and goals across application runs.

Budgeting: Introduce a budgeting system to categorize expenses and compare actual spending against budgeted amounts.

Report Generation: Add monthly/annual reports and visualizations (possibly in a future GUI version).

Advanced Goal Management: Allow for multi-goal prioritization and savings targets across multiple years.
