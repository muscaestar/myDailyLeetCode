package _1013_Partition_Array_Into_Three_Parts_With_Equal_Sum;

/**
 * Created by muscaestar on 3/11/20
 *
 * @author muscaestar
 */
public class Solution {

    public boolean canThreePartsEqualSum(int[] A) {

        int sum = 0;
        for (int value : A) {
            sum += value;
        }

        if (sum % 3 != 0) {
            return false;
        }
        sum /= 3;

        int round = 1;
        int i = 0;
        int iSum = A[i];
        while (i < A.length - 1) {
            if (round == 1 && iSum == sum) {
                round++;
                iSum = A[++i];
            } else if (round == 2 && iSum == sum) {
                return true;
            } else {
                iSum += A[++i];
            }
        }
        return false;
    }
}
