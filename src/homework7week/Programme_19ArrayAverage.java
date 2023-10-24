package homework7week;

public class Programme_19ArrayAverage {

        public static void main(String[] args) {
            double[] numbers = {1.5, 2.0, 3.5, 4.0, 5.5}; // Example array of double values

            double sum = 0.0;

            // Calculate the sum of array elements
            for (double number : numbers) {
                sum += number;
            }

            // Calculate the average
            double average = sum / numbers.length;

            System.out.println("Array elements: " + java.util.Arrays.toString(numbers));
            System.out.println("Sum of array elements: " + sum);
            System.out.println("Average of array elements: " + average);
        }
    }


