From:

https://leetcode-cn.com/problems/dui-lie-de-zui-da-zhi-lcof/

# 面试题59 - II. 队列的最大值
请定义一个队列并实现函数 `max_value` 得到队列里的最大值，要求函数`max_value`、`push_back` 和 `pop_front` 的时间复杂度都是O(1)。

若队列为空，`pop_front` 和 `max_value` 需要返回 -1

示例 1：


```
输入: 
["MaxQueue","push_back","push_back","max_value","pop_front","max_value"]
[[],[1],[2],[],[],[]]
输出: [null,null,null,2,1,2]
```
示例 2：
```
输入: 
["MaxQueue","pop_front","max_value"]
[[],[],[]]
输出: [null,-1,-1]
``` 

限制：

- `1 <= push_back,pop_front,max_value的总操作数 <= 10000`
- `1 <= value <= 10^5`

# 解题思路
### 题目考点
- 一个普通队列天然具有时间复杂度O(1)的出队入队特性
- 因此关键点在于，用O(1)的时间复杂度得到队列的最大元素

### 具体思路
- 空间换时间：增加一个用来记录最大元素的空间
- 储存空间的数据结构选择：
    - 如果只储存一个当前最大元素，那么当这个最大元素出队后，必定需要O(1)的时间复杂度寻找下一个最大元素，此方案不可行
    - 可行方案：不仅储存当前最大元素，还依序储存未来的一系列最大元素