package _225_ImplementStack_using_Queues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by muscaestar on 3/1/20
 *
 * @author muscaestar
 */
public class _225Test {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testDequeue() {
        MyStack_Deque obj = new MyStack_Deque();

        obj.push(1);
        // {1}
        assertEquals(1, obj.top());
        assertEquals(1, obj.pop());
        assertTrue(obj.empty());

        obj.push(1);
        obj.push(2);
        // {2, 1}
        assertEquals(2, obj.top());

        obj.push(3);
        // {3, 2, 1}
        obj.pop();
        obj.pop();
        // {1}
        assertEquals(1, obj.top());

        obj.push(2);
        obj.push(3);
        obj.push(1);
        obj.push(1);
        obj.push(3);
        // {3, 1, 1, 3, 2, 1}
        obj.pop();
        // {1, 1, 3, 2, 1}
        assertEquals(1, obj.top());

    }

    @Test
    public void testTwoQueue() {
        MyStack_TwoQueue obj = new MyStack_TwoQueue();
        obj.push(1);
        // {1}
        assertEquals(1, obj.top());
        assertEquals(1, obj.pop());
        assertTrue(obj.empty());

        obj.push(1);
        obj.push(2);
        // {2, 1}
        assertEquals(2, obj.top());

        obj.push(3);
        // {3, 2, 1}
        obj.pop();
        obj.pop();
        // {1}
        assertEquals(1, obj.top());

        obj.push(2);
        obj.push(3);
        obj.push(1);
        obj.push(1);
        obj.push(3);
        // {3, 1, 1, 3, 2, 1}
        obj.pop();
        // {1, 1, 3, 2, 1}
        assertEquals(1, obj.top());
    }

    @Test
    public void testOneQueue() {
        MyStack_Queue obj = new MyStack_Queue();

        obj.push(1);
        // {1}
        assertEquals(1, obj.top());
        assertEquals(1, obj.pop());
        assertTrue(obj.empty());

        obj.push(1);
        obj.push(2);
        // {2, 1}
        assertEquals(2, obj.top());

        obj.push(3);
        // {3, 2, 1}
        obj.pop();
        obj.pop();
        // {1}
        assertEquals(1, obj.top());

        obj.push(2);
        obj.push(3);
        obj.push(1);
        obj.push(1);
        obj.push(3);
        // {3, 1, 1, 3, 2, 1}
        obj.pop();
        // {1, 1, 3, 2, 1}
        assertEquals(1, obj.top());
    }

}