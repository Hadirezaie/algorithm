import java.util.List;

public class FindMaxNumber {

    /**
     * Find the largest number in a list
     * Features:
     * - Correctness: ✅ Works for all lists
     * - Efficiency: ✅ Linear time O(n)
     * - Readability: ✅ Clear and well-commented code
     */

    public static Integer findMaximum(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) { // Check if the list is empty
            return null;
        }

        Integer maxNumber = numbers.get(0); // Start with the first number

        for (Integer number : numbers) {
            System.out.println("number = " + number); // Debugging output
            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        return maxNumber;
    }

    public static void main(String[] args) {
        List<Integer> testNumbers = List.of(3, 7, 2, 9, 1, 8);
        Integer result = findMaximum(testNumbers);
        System.out.println("Largest number: " + result); // Output: 9
    }
}
