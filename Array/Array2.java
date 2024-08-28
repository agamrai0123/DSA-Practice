//Givin N array elements check if there exists a pair (i, j) such that A[i]+A[j]=k && i!=j
package Array;
import Array.HelperArray;
import java.util.Random;
@SuppressWarnings("unused")

public class Array2 {
    public static void main(String args[]){
        HelperArray helper = new HelperArray();
        Random rand = new Random();
        int[] R = new int[2];

        for (int i = 1; i <= 11; i++) {
            int[] testArray = helper.getTestCase(i);
            System.out.print("Test Case " + i + ": ");
            helper.printArray(testArray);
            R=Solution1(testArray, 10);
            System.out.println(R[0] + " " + R[1]);
            // System.out.println("Count: " + Solution2(testArray));
        }
    }


    public static int[] Solution1(int[] N, int k){
        int[] p = new int[2];

        for(int i = 0; i < N.length; i++){
            for(int j = i+1; j < N.length; j++){
                if(N[i] + N[j] == k){
                    p[0] = i;
                    p[1] = j;
                }
            }
        }
        return p;
    }

    // public static int[] Solution2(int[] N, int k){
    //     int[] p = new int[2];
    //     for(int i = 0; i < N.length; i++){

    //     }
    //     return p;
    // }
}
