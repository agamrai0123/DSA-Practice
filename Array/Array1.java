//Given an array of size N, count the number of elements having atleast one element greater than itself
package Array;
import Array.HelperArray;
@SuppressWarnings("unused")

public class Array1 {
    public static void main(String[] args) {
        HelperArray helper = new HelperArray();
        // int[] N = TestCase();
        //helper.printArray(N);
        // int count = Solution1(testArray1);
        //System.out.println("Number of elements having atleast one element greater than itself: " + count);

        for (int i = 1; i <= 10; i++) {
            int[] testArray = helper.getTestCase(i);
            System.out.print("Test Case " + i + ": ");
            helper.printArray(testArray);
            System.out.println("Count: " + Solution1(testArray));
            System.out.println("Count: " + Solution2(testArray));

        }
    }

    // public static int[] TestCase() {
    //     int[] arr = { 5, 3, 7, 2, 8, 9, 1, 6, 4 };
    //     return arr;
    // }

    public static int Solution1(int[] arr) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < max) {
                count++;
            }
        }
        return count;
    }

    public static int Solution2(int[] arr) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count = 1;
            } else if(arr[i] == max){
                count++;
            }
        }
        return arr.length - count;
    }

    public void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}