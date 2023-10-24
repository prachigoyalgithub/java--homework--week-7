package homework7week;

public class Programme4_SwitchStatement {

        public static boolean isLeapYear(int year) {
            if (year < 1 || year > 9999) {
                return false;
            }

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return true;
            }

            return false;
        }

        public static int getDaysInMonth(int month, int year) {
            if (month < 1 || month > 12 || year < 1 || year > 9999) {
                return -1;
            }

            int daysInMonth;
            switch (month) {
                case 1: // January
                case 3: // March
                case 5: // May
                case 7: // July
                case 8: // August
                case 10: // October
                case 12: // December
                    daysInMonth = 31;
                    break;
                case 4: // April
                case 6: // June
                case 9: // September
                case 11: // November
                    daysInMonth = 30;
                    break;
                case 2: // February
                    if (isLeapYear(year)) {
                        daysInMonth = 29;
                    } else {
                        daysInMonth = 28;
                    }
                    break;
                default:
                    return -1;
            }

            return daysInMonth;
        }

        public static void main(String[] args) {
            int month = 2; // Change the month you want to check here
            int year = 2024; // Change the year you want to check here
            int days = getDaysInMonth(month, year);

            if (days == -1) {
                System.out.println("Invalid input. Please check the month and year values.");
            } else {
                System.out.println("There are " + days + " days in month " + month + " of year " + year + ".");
            }
        }
    }


