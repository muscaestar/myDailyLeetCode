package interview_cn_59;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/**
 * Created by muscaestar on 3/7/20
 *
 * @author muscaestar
 */
class MaxQueue {
    Queue<Integer> queue;
    Deque<Integer> maxDeque;

    public MaxQueue() {
      this.queue = new ArrayDeque<>();
      this.maxDeque = new ArrayDeque<>();
    }

    public int max_value() {
        return (maxDeque.isEmpty()) ? -1 : maxDeque.peekFirst();
    }

    public void push_back(int value) {
        queue.add(value);
        while (!maxDeque.isEmpty() && maxDeque.peekLast() < value) {
            maxDeque.pollLast();
        }
        maxDeque.add(value);
    }

    public int pop_front() {
        if (queue.isEmpty()) {
            return -1;
        }
        int res = queue.poll();
        if (!maxDeque.isEmpty() && res == maxDeque.peek()) {
            maxDeque.pollFirst();
        }
        return res;
    }

    public Queue<Integer> getQueue() {
        return queue;
    }

    public Deque<Integer> getMaxDeque() {
        return maxDeque;
    }

    @Override
    public String toString() {
        return "MaxQueue{" +
                "queue=" + queue.toString() +
                ", \nmaxDeque=" + maxDeque.toString() +
                '}';
    }
}

/**
 * Your MaxQueue object will be instantiated and called as such:
 * MaxQueue obj = new MaxQueue();
 * int param_1 = obj.max_value();
 * obj.push_back(value);
 * int param_3 = obj.pop_front();
 */
