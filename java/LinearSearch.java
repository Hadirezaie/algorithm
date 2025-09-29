package java;

public class LinearSearch {

    /**
     * Linear search algorithm
     * Features:
     * - Correctness: Accurately finds the element
     * - Efficiency: O(n) - Suitable for small datasets
     * - Readability: Simple and understandable code
     */
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Index of the found element
            }
        }
        return -1; // Element not found
    }

    // Enhanced version with reporting
    public static int linearSearchDetailed(int[] array, int target) {
        System.out.println("Searching for element " + target + " in the array...");
        int steps = 0;

        for (int i = 0; i < array.length; i++) {
            steps++;
            System.out.println("Step " + steps + ": Checking index " + i + " - Value: " + array[i]);

            if (array[i] == target) {
                System.out.println("Element found at index " + i + "!");
                System.out.println("Number of steps: " + steps);
                return i;
            }
        }

        System.out.println("Element not found");
        System.out.println("Number of steps: " + steps);
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 25, 8, 42, 15, 30, 55, 3 };
        int target = 42;

        int index = linearSearchDetailed(numbers, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at position " + index);
        } else {
            System.out.println("Element " + target + " does not exist in the array");
        }
    }
}
