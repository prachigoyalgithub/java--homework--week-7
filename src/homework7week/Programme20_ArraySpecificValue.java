package homework7week;

public class Programme20_ArraySpecificValue {

        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5}; // Example array of integers
            int targetValue = 3; // The specific value to search for

            boolean found = false;

            // Iterate through the array to check if it contains the target value
            for (int number : numbers) {
                if (number == targetValue) {
                    found = true;
                    break; // Exit the loop as soon as the value is found
                }
            }

            if (found) {
                System.out.println("The array contains the value " + targetValue + ".");
            } else {
                System.out.println("The array does not contain the value " + targetValue + ".");
            }
        }
    }


