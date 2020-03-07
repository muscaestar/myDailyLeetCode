package interview_cn_59;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by muscaestar on 3/7/20
 *
 * @author muscaestar
 */
public class Interview_cn_59_Test {

    MaxQueue mq;

    @Before
    public void setUp() throws Exception {
        mq = new MaxQueue();
    }

    @Test
    public void testCase1() {
        mq.push_back(5);
        mq.push_back(4);
        mq.push_back(5);
        mq.push_back(6);
        mq.push_back(5);
        mq.push_back(5);
//        System.out.println(mq.toString());
        assertArrayEquals(new Integer[]{5, 4, 5, 6, 5, 5}, mq.getQueue().toArray(new Integer[0]));
        assertArrayEquals(new Integer[]{6, 5, 5}, mq.getMaxDeque().toArray(new Integer[0]));
        assertEquals(6, mq.max_value());

        mq.pop_front();
        mq.pop_front();
        mq.pop_front();
        mq.pop_front();
        mq.pop_front();
//        System.out.println(mq.toString());
        assertArrayEquals(new Integer[]{5}, mq.getQueue().toArray(new Integer[0]));
        assertArrayEquals(new Integer[]{5}, mq.getMaxDeque().toArray(new Integer[0]));
        assertEquals(5, mq.max_value());
    }

    @Test
    public void testCase2() {
        assertEquals(-1, mq.max_value());
        assertEquals(-1, mq.pop_front());
    }
}
