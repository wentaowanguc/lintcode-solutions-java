## Find Peak Element
### Description
There is an integer array which has the following features:
* The numbers in adjacent positions are different.
* `A[0] < A[1]` and `A[length - 2] > A[length - 1]`
<br/>
A position `P` is a peak if
* `A[P] > A[P - 1]` and `A[P] > A[P+1]`
<br/>
Find a peak in the given array and return the index of that peak.
### Example
#### Example 1
```
Input: A = [1, 2, 1, 3, 4, 5, 7, 6]
Output: 1 or 6
```
#### Example 2
```
Input: A = [1,2,3,4,1]
Output: 3
```
### Challenge
Time complexity O(log n)

### Solution
Solution: [FindPeakElement](../src/main/java/solutions/search/findpeakelement/FindPeakElement.java) <br/>
Test cases: [FindPeakElementTest](../src/test/java/solutions/search/findpeakelement/FindPeakElementTest.java)

### Reference
[LeetCode problem 162: Find Peak Element](https://leetcode.com/problems/find-peak-element/submissions/1294025083/) <br/>
[LintCode problem 75: Find Peak Element](https://www.lintcode.com/problem/75/)