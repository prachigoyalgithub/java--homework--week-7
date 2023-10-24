package homework7week;

import java.util.Scanner;

public class Programme16_EnterNumber {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number > 0) {
                System.out.println("POSITIVE");
            } else if (number < 0) {
                System.out.println("NEGATIVE");
            } else {
                System.out.println("ZERO");
            }

            scanner.close();
        }
    }


