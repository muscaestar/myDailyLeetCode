package interview_cn_57;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by muscaestar on 3/6/20
 *
 * @author muscaestar
 */
public class SolutionBruteForce implements Solution {
    @Override
    public int[][] findContinuousSequence(int target) {
        if (target == 1) {
            return new int[][]{new int[]{1}};
        }
        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < target / 2; i++) {
            int curr = i + 1;
            int sum = 0;
            while (sum <= target) {
                sum += curr;
                if (sum == target) {
                    list.add(createAP(i + 1, curr));
                    break;
                }
                curr++;
            }
        }
        return list.toArray(new int[list.size()][]);
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
