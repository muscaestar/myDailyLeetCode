package _225_ImplementStack_using_Queues;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by muscaestar on 3/1/20
 *
 * Easiest. But not the point of this puzzle.
 *
 * @author muscaestar
 */
class MyStack_Deque {

    Deque<Integer> deque;

    /** Initialize your data structure here. */
    public MyStack_Deque() {
        deque = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        deque.push(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return deque.pop();
    }

    /** Get the top element. */
    public int top() {
        return deque.peekFirst();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return deque.size() == 0;
    }
}

