## Search in Rotated Sorted Array
### Description
Suppose a sorted array is rotated at some pivot unknown to you beforehand. (i.e., `0 1 2 4 5 6 7` might become `4 5 6 7 0 1 2`).<br/>
Given a target value, if it is found in the array, return its index, otherwise, return `-1`. <br/>
There is no duplicates exists in the array.

### Example
#### Example 1
**Input**
```
array = [4, 5, 1, 2, 3]
target = 1
```
**Output**
```
2
```
#### Example 2
**Input**
```
array = [4, 5, 1, 2, 3]
target = 0
```
**Output**
```
-1
```
### Challenge
Time complexity O(log n)

### Solution
Solution: [SearchRotatedSortedArray](../src/main/java/solutions/search/rotatedsortedarray/SearchRotatedSortedArray.java)
Test case: [SearchRotatedSortedArrayTest](../src/test/java/solutions/search/rotatedsortedarray/SearchRotatedSortedArrayTest.java)

### Reference
[LeetCode problem 33: Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/description/)
[LintCode problem 62: Search in Rotated Sorted Array](https://www.lintcode.com/problem/62/)