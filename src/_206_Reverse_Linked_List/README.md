From:

https://leetcode.com/problems/reverse-linked-list/

https://leetcode-cn.com/problems/reverse-linked-list/

# 206. Reverse Linked List
Reverse a singly linked list.

Example:

```
Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
```
Follow up:

A linked list can be reversed either iteratively or recursively. 
Could you implement both?
  
  
# 206. 反转链表
反转一个单链表。

示例:
```
输入: 1->2->3->4->5->NULL
输出: 5->4->3->2->1->NULL
```
进阶:

你可以迭代或递归地反转链表。你能否用两种方法解决这道题？

# 解题思路
### 解题方案
1. 迭代的方法
2. 递归的方法

### 方案选择
两种方案在思路上基本一致，可以一并理解。

### 基本思路
- 依据分治的思想，最终要解决的子问题就是将**当前节点**的next指针指向**前驱节点**
- 从一个子问题到下一个子问题：更新**当前节点**和当前节点的**前驱节点**
- 技巧：将空节点一起考虑进来，`NULL -> Node1 -> Node2 -> NULL`

#### 分步详解
1. 子问题1: `前驱节点NULL  <-> 当前节点Node1`
2. 子问题2: `前驱节点Node1 <-> 当前节点Node2`
3. 子问题3: `前驱节点Node2 <-> 当前节点NULL`