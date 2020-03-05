
From:

https://leetcode.com/problems/distribute-candies-to-people/

https://leetcode-cn.com/problems/distribute-candies-to-people/

# 1103. Distribute Candies to People
We distribute some number of `candies`, to a row of `n = num_people` people in the following way:

We then give 1 candy to the first person, 2 candies to the second person, and so on until we give `n` candies to the last person.

Then, we go back to the start of the row, giving `n + 1` candies to the first person, `n + 2` candies to the second person, and so on until we give `2 * n` candies to the last person.

This process repeats (with us giving one more candy each time, and moving to the start of the row after we reach the end) until we run out of candies.  The last person will receive all of our remaining candies (not necessarily one more than the previous gift).

Return an array (of length `num_people` and sum `candies`) that represents the final distribution of candies.

 

Example 1:

```
Input: candies = 7, num_people = 4
Output: [1,2,3,1]
Explanation:
On the first turn, ans[0] += 1, and the array is [1,0,0,0].
On the second turn, ans[1] += 2, and the array is [1,2,0,0].
On the third turn, ans[2] += 3, and the array is [1,2,3,0].
On the fourth turn, ans[3] += 1 (because there is only one candy left), and the final array is [1,2,3,1].
```
Example 2:
```
Input: candies = 10, num_people = 3
Output: [5,2,3]
Explanation: 
On the first turn, ans[0] += 1, and the array is [1,0,0].
On the second turn, ans[1] += 2, and the array is [1,2,0].
On the third turn, ans[2] += 3, and the array is [1,2,3].
On the fourth turn, ans[0] += 4, and the final array is [5,2,3].
```

Constraints:
- `1 <= candies <= 10^9`
- `1 <= num_people <= 1000`

# 1103. 分糖果 II
排排坐，分糖果。

我们买了一些糖果 `candies`，打算把它们分给排好队的 `n = num_people` 个小朋友。

给第一个小朋友 1 颗糖果，第二个小朋友 2 颗，依此类推，直到给最后一个小朋友 `n` 颗糖果。

然后，我们再回到队伍的起点，给第一个小朋友 `n + 1` 颗糖果，第二个小朋友 `n + 2` 颗，依此类推，直到给最后一个小朋友 `2 * n` 颗糖果。

重复上述过程（每次都比上一次多给出一颗糖果，当到达队伍终点后再次从队伍起点开始），直到我们分完所有的糖果。注意，就算我们手中的剩下糖果数不够（不比前一次发出的糖果多），这些糖果也会全部发给当前的小朋友。

返回一个长度为 `num_people`、元素之和为 `candies` 的数组，以表示糖果的最终分发情况（即 `ans[i]` 表示第 `i` 个小朋友分到的糖果数）。

 

示例 1：
```
输入：candies = 7, num_people = 4
输出：[1,2,3,1]
解释：
第一次，ans[0] += 1，数组变为 [1,0,0,0]。
第二次，ans[1] += 2，数组变为 [1,2,0,0]。
第三次，ans[2] += 3，数组变为 [1,2,3,0]。
第四次，ans[3] += 1（因为此时只剩下 1 颗糖果），最终数组变为 [1,2,3,1]。
```
示例 2：
```
输入：candies = 10, num_people = 3
输出：[5,2,3]
解释：
第一次，ans[0] += 1，数组变为 [1,0,0]。
第二次，ans[1] += 2，数组变为 [1,2,0]。
第三次，ans[2] += 3，数组变为 [1,2,3]。
第四次，ans[0] += 4，最终数组变为 [5,2,3]。
```

提示：

- `1 <= candies <= 10^9`
- `1 <= num_people <= 1000`

# 解题思路
### 解题方案
1. 直接一步步模拟题目步骤
2. 找到规律，使用数学公式简化计算

### 方案选择
1. 暴力解法直观，不易出错
2. 数学解法效率更高，需要花时间理解

### 暴力解法
没什么好说的，直接看代码


### 数学解法
#### 抽象问题
- 分发糖果的数量依次排列，得到一个增长的等差数列 + 最后剩下的糖
```text
[ 0,  0,  0,  0,  0]
 +1, +2, +3, +4, +5   完整轮
 +6, +7, +8, +r       最后一轮

r代表最后剩下的糖，也就是（总数 - 等差数列之和）
0 <= r < 8, 8代表这个等差数列的最后一个数
```
- 对于数组中的每个元素，只需要计算一次，分为两步
    1. 加上所有 完整轮 中，这个下标位置增加的值
    2. 加上 最后一轮 中，这个下标位置增加的值
        - 需要判断等差数列是否结束

#### 问题难点
- 给定数列之和，求这个等差数列的长度
- `Math#sqrt`和`double`到`int`的类型转换，都会造成精度丢失，需要特别注意一下


