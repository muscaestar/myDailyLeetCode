package _994_Rotting_Oranges;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by muscaestar on 3/4/20
 *
 * @author muscaestar
 */
public class _994Test {

    Solution s;

    @Before
    public void setUp() throws Exception {
//        s = new SolutionPointQueue();
//        s = new SolutionArrayQueue();
        s = new SolutionRecursive();
    }

    @Test
    public void testCase1() {
        int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        assertEquals(4, s.orangesRotting(grid));
    }

    @Test
    public void testCase2() {
        int[][] grid = {{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};
        assertEquals(-1, s.orangesRotting(grid));
    }

    @Test
    public void testCase3() {
        int[][] grid = {{0, 2}};
        assertEquals(0, s.orangesRotting(grid));
    }

    @Test
    public void testCase4() {
        int[][] grid = {{2, 1, 1}, {2, 1, 0}, {0, 1, 1}};
        assertEquals(3, s.orangesRotting(grid));
    }

    @Test
    public void testCase5() {
        int[][] grid = {{0}};
        assertEquals(0, s.orangesRotting(grid));
    }
}