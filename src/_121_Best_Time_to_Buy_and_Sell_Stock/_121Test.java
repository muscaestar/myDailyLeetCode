package _121_Best_Time_to_Buy_and_Sell_Stock;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by muscaestar on 3/9/20
 *
 * @author muscaestar
 */
public class _121Test {
    Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    @Test
    public void testCase1() {
        int res = s.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        assertEquals(5, res);
    }

    @Test
    public void testCase2() {
        int res = s.maxProfit(new int[]{4, 3, 2, 1});
        assertEquals(0, res);
    }
}