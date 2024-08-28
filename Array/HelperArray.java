package Array;
import java.util.Random;

public class HelperArray {
    
    // Method to print elements of an array
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    // Method to generate test case arrays
    public int[] getTestCase(int testCaseNumber) {
        switch (testCaseNumber) {
            case 1:
                return new int[]{5, 3, 7, 2, 8, 9, 1, 6, 4};
            case 2:
                return new int[]{10, 20, 20, 10, 30};
            case 3:
                return new int[]{1, 1, 1, 1};
            case 4:
                return new int[]{9, 8, 7, 6, 5};
            case 5:
                return new int[]{3, 3, 3, 4};
            case 6:
                return generateRandomArray(10, 1, 50);  // Random array of 10 elements with values between 1 and 50
                case 7:
                return new int[0]; // Edge case: empty array
            case 8:
                return new int[]{42}; // Edge case: single element array
            case 9:
                return new int[]{-1, -2, -3, -4, -5}; // Edge case: array with negative numbers
            case 10:
                return new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE}; // Edge case: extreme values
            default:
                throw new IllegalArgumentException("Invalid test case number.");
        }
    }

    // Method to generate a random array
    private int[] generateRandomArray(int size, int min, int max) {
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt((max - min) + 1) + min;
        }
        return arr;
    }
}
