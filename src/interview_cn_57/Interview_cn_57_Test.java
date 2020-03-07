package interview_cn_57;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by muscaestar on 3/6/20
 *
 * @author muscaestar
 */
public class Interview_cn_57_Test {

    Solution s;

    @Before
    public void setUp() throws Exception {
//        s = new SolutionBruteForce();
        s = new SolutionSlidingWindow();
    }

    @Test
    public void findContinuousSequence() {
        assertArrayEquals(new int[][]{
                new int[]{2, 3, 4},
                new int[]{4, 5}},
                s.findContinuousSequence(9));

        assertArrayEquals(new int[][]{
                        new int[]{1, 2, 3, 4, 5},
                        new int[]{4, 5, 6},
                        new int[]{7, 8}},
                s.findContinuousSequence(15));

        assertArrayEquals(new int[][]{
                        new int[]{1}},
                s.findContinuousSequence(1));
    }

    @Test
    public void createAP() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, s.createAP(1, 5));
        assertArrayEquals(new int[]{3, 4, 5, 6, 7}, s.createAP(3, 7));
        assertArrayEquals(new int[]{1}, s.createAP(1, 1));
    }

}