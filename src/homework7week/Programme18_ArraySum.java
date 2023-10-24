package homework7week;

public class Programme18_ArraySum {

        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Example array

            int sum = 0;

            // Loop through the array and sum the values
            for (int number : numbers) {
                sum += number;
            }

            System.out.println("The sum of the values in the array is: " + sum);
        }
    }


