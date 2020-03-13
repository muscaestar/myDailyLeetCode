package _169_Majority_Element;

import java.util.Arrays;

/**
 * Created by muscaestar on 3/13/20
 *
 * @author muscaestar
 */
public class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];

    }
}
