package homework7week;

public class Programme4_LeapYear {

        public static boolean isLeapYear(int year) {
            if (year < 1 || year > 9999) {
                return false;
            }

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return true;
            }

            return false;
        }

        public static void main(String[] args) {
            int year = 2024; // Change the year you want to check here
            boolean isLeap = isLeapYear(year);

            if (isLeap) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }
    }


