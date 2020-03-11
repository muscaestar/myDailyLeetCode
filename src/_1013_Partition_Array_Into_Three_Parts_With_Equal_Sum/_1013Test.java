package _1013_Partition_Array_Into_Three_Parts_With_Equal_Sum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by muscaestar on 3/11/20
 *
 * @author muscaestar
 */
public class _1013Test {

    Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    @Test
    public void testCase1() {
        boolean res = s.canThreePartsEqualSum(new int[]{0,2,1,-6,6,-7,9,1,2,0,1});
        assertTrue(res);
    }

    @Test
    public void testCase2() {
        boolean res = s.canThreePartsEqualSum(new int[]{0,2,1,-6,6,7,9,-1,2,0,1});
        assertFalse(res);
    }

    @Test
    public void testCase3() {
        boolean res = s.canThreePartsEqualSum(new int[]{3,3,6,5,-2,2,5,1,-9,4});
        assertTrue(res);
    }

    @Test
    public void testCase4() {
        boolean res = s.canThreePartsEqualSum(new int[]{1,1,1});
        assertTrue(res);
    }

    @Test
    public void testCase5() {
        boolean res = s.canThreePartsEqualSum(new int[]{18,12,-18,18,-19,-1,10,10});
        assertTrue(res);
    }
}