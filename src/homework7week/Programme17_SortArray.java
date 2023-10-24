package homework7week;

import java.util.Arrays;

public class Programme17_SortArray {

        public static void main(String[] args) {
            // Sorting a numeric array
            int[] numericArray = {5, 2, 9, 1, 5, 6};
            System.out.println("Original Numeric Array: " + Arrays.toString(numericArray));
            Arrays.sort(numericArray);
            System.out.println("Sorted Numeric Array: " + Arrays.toString(numericArray));

            // Sorting a string array
            String[] stringArray = {"apple", "banana", "cherry", "date", "blueberry"};
            System.out.println("Original String Array: " + Arrays.toString(stringArray));
            Arrays.sort(stringArray);
            System.out.println("Sorted String Array: " + Arrays.toString(stringArray));
        }
    }



