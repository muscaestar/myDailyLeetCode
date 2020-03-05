package _1103_Distribute_Candies_to_People;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by muscaestar on 3/5/20
 *
 * @author muscaestar
 */
public class _1103Test {

    private Solution s;

    @Before
    public void setUp() throws Exception {
//        s = new SolutionEmulate();
        s = new SolutionMath();
    }

    @Test
    public void testCase1() {
        int[] res = s.distributeCandies(7, 4);
        System.out.println(Arrays.toString(res));
        assertEquals("[1, 2, 3, 1]", Arrays.toString(res));
    }

    @Test
    public void testCase2() {
        int[] res = s.distributeCandies(10, 3);
        System.out.println(Arrays.toString(res));
        assertEquals("[5, 2, 3]", Arrays.toString(res));
    }

    @Test
    public void testCase3() {
        int[] res = s.distributeCandies(3, 5);
        System.out.println(Arrays.toString(res));
        assertEquals("[1, 2, 0, 0, 0]", Arrays.toString(res));
    }
}