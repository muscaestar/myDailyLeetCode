package interview_cn_57;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by muscaestar on 3/6/20
 *
 * @author muscaestar
 */
public class SolutionSlidingWindow implements Solution {
    @Override
    public int[][] findContinuousSequence(int target) {
        if (target == 1) {
            return new int[][]{new int[]{1}};
        }
        List<int[]> res = new ArrayList<>();
        int[] array = createAP(1, target);

        int winL = 0;
        int winR = 1;
        while (winL <= target / 2) {
            int sum = sumOfWin(winL, winR, array);
            if (sum == target) {
                int[] tmp = new int[winR - winL + 1];
                System.arraycopy(array, winL, tmp, 0, tmp.length);
                res.add(tmp);
                winL++;
            } else if (sum < target) {
                winR++;
            } else {
                winL++;
            }
        }

        return res.toArray(new int[res.size()][]);
    }

    private int sumOfWin(int winL, int winR, int[] array) {
        int res = (array[winL] + array[winR]) * (winR - winL + 1) / 2;
//        int res = 0;
//        for (int i = 0; i < winR - winL + 1; i++) {
//            res += array[winL + i];
//        }
        return res;
    }

    @Override
    public int[] createAP(int start, int end) {
        int[] res = new int[end - start + 1];
        for (int i = 0; i < res.length; i++) {
            res[i] = start++;
        }
        return res;
    }
}
