package _88_Merge_Sorted_Array;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by muscaestar on 3/3/20
 *
 * @author muscaestar
 */
public class _88Test {
    Solution s;

    @Before
    public void setUp() {
        s = new Solution();
    }

    @Test
    public void testCase1() {
        int[] A = {5, 6, 7, 0, 0, 0};
        int[] B = {1, 5, 9};

        s.merge(A, 3, B, 3);
        System.out.println(Arrays.toString(A));
        assertEquals("[1, 5, 5, 6, 7, 9]", Arrays.toString(A));
    }

    @Test
    public void testCase2() {
        int[] A = {5, 6, 10, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] B = {1, 2, 7, 11};

        s.merge(A, 3, B, 4);
        System.out.println(Arrays.toString(A));
        assertEquals("[1, 2, 5, 6, 7, 10, 11, 0, 0, 0, 0]", Arrays.toString(A));
    }

    @Test
    public void testCase3() {
        int[] A = {1, 2, 6, 10, 0, 0, 0, 0};
        int[] B = {5, 9, 11};

        s.merge(A, 4, B, 3);
        System.out.println(Arrays.toString(A));
        assertEquals("[1, 2, 5, 6, 9, 10, 11, 0]", Arrays.toString(A));
    }
}