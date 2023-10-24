package homework7week;

import java.util.Scanner;

public class Programme10_Calculator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Enter a mathematical symbol (+, -, *, /): ");
            char symbol = scanner.next().charAt(0);

            double result = 0.0;

            if (symbol == '+') {
                result = num1 + num2;
                System.out.println("Addition: " + result);
            } else if (symbol == '-') {
                result = num1 - num2;
                System.out.println("Subtraction: " + result);
            } else if (symbol == '*') {
                result = num1 * num2;
                System.out.println("Multiplication: " + result);
            } else if (symbol == '/') {
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Division: " + result);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
            } else {
                System.out.println("Invalid mathematical symbol.");
            }

            scanner.close();
        }
    }


