package homework7week;

import java.util.Scanner;

public class Programme7_SalesCommission {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input sales details
            System.out.print("Enter Sales ID: ");
            int salesId = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter Seller's Name: ");
            String sellerName = scanner.nextLine();

            System.out.print("Enter Sales Amount: ");
            double salesAmount = scanner.nextDouble();

            System.out.print("Enter Basic Salary: ");
            double basicSalary = scanner.nextDouble();

            // Calculate sales commission based on the provided criteria
            double salesCommission = 0.0;
            if (salesAmount >= 50000) {
                salesCommission = salesAmount * 0.35;
            } else if (salesAmount >= 30000) {
                salesCommission = salesAmount * 0.20;
            } else if (salesAmount >= 20000) {
                salesCommission = salesAmount * 0.10;
            } else if (salesAmount >= 10000) {
                salesCommission = salesAmount * 0.05;
            } else {
                salesCommission = salesAmount * 0.02;
            }

            // Calculate total earnings (basic salary + sales commission)
            double totalEarnings = basicSalary + salesCommission;

            // Display the results
            System.out.println("\nSales ID: " + salesId);
            System.out.println("Seller's Name: " + sellerName);
            System.out.println("Sales Amount: $" + salesAmount);
            System.out.println("Basic Salary: $" + basicSalary);
            System.out.println("Sales Commission: $" + salesCommission);
            System.out.println("Total Earnings: $" + totalEarnings);

            scanner.close();
        }
    }


