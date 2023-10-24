package homework7week;

import java.util.Scanner;

public class Programme9_CityNames_SwitchStatement {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter an alphabet (A to F): ");
            char input = scanner.next().charAt(0);
            char uppercaseInput = Character.toUpperCase(input);

            String cityName;

            switch (uppercaseInput) {
                case 'A':
                    cityName = "New York";
                    break;
                case 'B':
                    cityName = "Los Angeles";
                    break;
                case 'C':
                    cityName = "Chicago";
                    break;
                case 'D':
                    cityName = "Houston";
                    break;
                case 'E':
                    cityName = "San Francisco";
                    break;
                case 'F':
                    cityName = "Miami";
                    break;
                default:
                    cityName = "Invalid Entry";
                    break;
            }

            System.out.println("City Name: " + cityName);

            scanner.close();
        }
    }


