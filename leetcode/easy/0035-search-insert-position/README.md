# Search Insert Position

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with `O(log n)` runtime complexity.

 

 **Example 1:** 

```
Input: nums = [1,3,5,6], target = 5
Output: 2

```

 **Example 2:** 

```
Input: nums = [1,3,5,6], target = 2
Output: 1

```

 **Example 3:** 

```
Input: nums = [1,3,5,6], target = 7
Output: 4

```

 

 **Constraints:** 

- 1 <= nums.length <= 104
- -104 <= nums[i] <= 104
- nums contains distinct values sorted in ascending order.
- -104 <= target <= 104

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 44.9 MB (beats 12.34%)  
**Submitted:** 2026-07-30T06:59:37.241Z  

```java
class Solution {
    public int searchInsert(int[] nums, int target) {
       int low=0;
       int high=nums.length-1;
       int mid=0;
       int pos=0;
       while(low<=high){
            mid=(high+low)/2;
            if(target==nums[mid]){
                pos=mid;
                return pos;
            }
            else if(target<nums[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
                pos=low;
            }
        }
        return pos;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/search-insert-position/)