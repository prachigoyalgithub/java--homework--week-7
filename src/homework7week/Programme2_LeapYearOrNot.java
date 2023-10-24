package homework7week;

import java.util.Scanner;

public class Programme2_LeapYearOrNot {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = scanner.nextInt();
        boolean isLeapYear = false;
        if (year % 4==0) {
            if (year % 100 != 0 || (year % 100 == 0 && year % 400 == 0)) {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}








