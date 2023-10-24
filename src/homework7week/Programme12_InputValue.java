package homework7week;

import java.util.Scanner;

public class Programme12_InputValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System .in);
        System.out.println("Enter a Character: ");
        String input = scanner .nextLine();

        if (input.length()==1) {
            char character = input.charAt(0);
            if (Character.isDigit(character)) {
                System.out.println("You entered a number.");
            } else if (Character.isLetter(character)) {
                System.out.println("You entered an alphabet.");
            } else {
                System.out.println("You entered a symbol.");
            }
        } else {
            System.out.println("Please enter a single character.");
        }

        scanner.close();
        }

    }

