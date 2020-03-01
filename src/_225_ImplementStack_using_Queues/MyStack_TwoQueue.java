package _225_ImplementStack_using_Queues;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by muscaestar on 3/1/20
 *
 * @author muscaestar
 */
class MyStack_TwoQueue {
    Queue<Integer> emptyQueue;
    Queue<Integer> storageQueue;

    /** Initialize your data structure here. */
    public MyStack_TwoQueue() {
        emptyQueue = new LinkedList<>();
        storageQueue = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        emptyQueue.add(x);
        while (!storageQueue.isEmpty()) {
            emptyQueue.add(storageQueue.poll());
        }

        //swap two queues
        Queue<Integer> temp = emptyQueue;
        emptyQueue = storageQueue;
        storageQueue = temp;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return storageQueue.poll();
    }

    /** Get the top element. */
    public int top() {
        return storageQueue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return storageQueue.isEmpty();
    }
}