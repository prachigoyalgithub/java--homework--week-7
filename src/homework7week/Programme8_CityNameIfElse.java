package homework7week;

import java.util.Scanner;

public class Programme8_CityNameIfElse {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter an alphabet (A to F): ");
            char input = scanner.next().charAt(0);
            char uppercaseInput = Character.toUpperCase(input);

            String cityName;

            if (uppercaseInput == 'A') {
                cityName = "New York";
            } else if (uppercaseInput == 'B') {
                cityName = "Los Angeles";
            } else if (uppercaseInput == 'C') {
                cityName = "Chicago";
            } else if (uppercaseInput == 'D') {
                cityName = "Houston";
            } else if (uppercaseInput == 'E') {
                cityName = "San Francisco";
            } else if (uppercaseInput == 'F') {
                cityName = "Miami";
            } else {
                cityName = "Invalid Entry";
            }

            System.out.println("City Name: " + cityName);

            scanner.close();
        }
    }


