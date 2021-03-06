From:

https://leetcode-cn.com/problems/implement-stack-using-queues/

https://leetcode.com/problems/implement-stack-using-queues/

# 225 - Implement Stack using Queues
Implement the following operations of a stack using queues.

- `push(x)` -- Push element x onto stack.
- `pop()` -- Removes the element on top of the stack.
- `top()` -- Get the top element.
- `empty()` -- Return whether the stack is empty.
Example:
```
MyStack stack = new MyStack();

stack.push(1);
stack.push(2);  
stack.top();   // returns 2
stack.pop();   // returns 2
stack.empty(); // returns false
```

Notes:

- You must use only standard operations of a queue -- which means only `push to back`, `peek/pop from front`, `size`, and `is empty` operations are valid.
- Depending on your language, queue may not be supported natively. You may simulate a queue by using a list or deque (double-ended queue), as long as you use only standard operations of a queue.
- You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).

# 225 - 用队列实现栈
使用队列实现栈的下列操作：

- `ush(x)` -- 元素 x 入栈
- `pop()` -- 移除栈顶元素
- `top()` -- 获取栈顶元素
- `empty()` -- 返回栈是否为空

注意:

- 你只能使用队列的基本操作-- 也就是`push to back`, `peek/pop from front`, `size`, 和 `is empty` 这些操作是合法的。
- 你所使用的语言也许不支持队列。 你可以使用 list 或者 deque（双端队列）来模拟一个队列 , 只要是标准的队列操作即可。
- 你可以假设所有操作都是有效的（例如, 对一个空的栈不会调用 pop 或者 top 操作）。

# 解题思路
### Java的三种实现方案
1. 使用Deque
2. 使用两个Queue
3. 使用一个Queue

### 方案选择
- 出题目的是使用**先进先出**的普通队列实现栈，双端队列不是先进先出，使用Deque没有意义
- 队列能用一个为什么要用两个

### 基本思路
- 每一次队列元素增减时，调整队列结构，使得最终得到的队列结构为：最后入队的元素在队头，依次往后，如`{new, ..., third, second, first}`
- 如何调整队列结构：队头**出队**然后**入队**，循环，直到实现理想结构
- 什么时候调整队列结构：
    - `push`：新元素入队，接着调整结构
    - `pop`：新元素出队，队列结构理想，无需调整
