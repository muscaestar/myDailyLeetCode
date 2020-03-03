From:
https://leetcode.com/problems/merge-sorted-array/

https://leetcode-cn.com/problems/merge-sorted-array/

https://leetcode-cn.com/problems/sorted-merge-lcci/

# 88. Merge Sorted Array 

Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
Example:

```
Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]
```

# 88. 合并两个有序数组 (面试题 10.01. 合并排序的数组)
给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。

说明:

初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
示例:

```
输入:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

输出: [1,2,2,3,5,6]
```

# 解题思路
### 解题方案
1. 双指针，两个数组各一个，从右往左，比较后移动
2. 三指针，基本思路同上，增加一个指针指向比较后元素移动的目标位置

### 方案选择
使用三指针。两个方案的思路是一样的，三指针更直观，可读性更强。

### 基本思路
- 因为两个数组都是有序的，且数组A的右侧有足够空间，于是考虑在空余空间上做文章
- 指针初始位置如下:
```
               <-end = m+n-1
                  |
A [2, 4, 6, 0, 0, 0, 0, 0, ... ]
         |
       <-pA = m-1

B [1, 3, 5]
         |
       <-pB = n-1

```
- 迭代条件：pA和pB都没有到达（超过）下标0
- 迭代内容：pA和pB比较元素大小，数值大的一方将元素放到end当前指向的位置。然后end和大元素指针（pA或pB）向左移动
- 迭代结束后，两种情况：
    1. pA没有到达下标0：因为数组A原本就是有序的，所以结果理想，不用调整
    2. pB没有到达下标0：数组B里还没有被处理的元素，需要全部放到数组A的头部


