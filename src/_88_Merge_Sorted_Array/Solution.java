package _88_Merge_Sorted_Array;

/**
 * Created by muscaestar on 3/3/20
 *
 * @author muscaestar
 */
public class Solution {

    public void merge(int[] A, int m, int[] B, int n) {
        int end = m + n - 1;
        int pA = m - 1;
        int pB = n - 1;

        while (pA >= 0 && pB >= 0) {
            if (A[pA] <= B[pB]) {
                A[end--] = B[pB--];
            } else {
                A[end--] = A[pA--];
            }
        }

        System.arraycopy(B, 0, A, 0, pB + 1);
    }
}
