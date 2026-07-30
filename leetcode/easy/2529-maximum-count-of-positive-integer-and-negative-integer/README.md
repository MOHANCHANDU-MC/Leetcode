# Maximum Count of Positive Integer and Negative Integer

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array `nums` sorted in  **non-decreasing**  order, return  *the maximum between the number of positive integers and the number of negative integers.* 

- In other words, if the number of positive integers in nums is pos and the number of negative integers is neg, then return the maximum of pos and neg.

 **Note**  that `0` is neither positive nor negative.

 

 **Example 1:** 

```
Input: nums = [-2,-1,-1,1,2,3]
Output: 3
Explanation: There are 3 positive integers and 3 negative integers. The maximum count among them is 3.

```

 **Example 2:** 

```
Input: nums = [-3,-2,-1,0,0,1,2]
Output: 3
Explanation: There are 2 positive integers and 3 negative integers. The maximum count among them is 3.

```

 **Example 3:** 

```
Input: nums = [5,20,66,1314]
Output: 4
Explanation: There are 4 positive integers and 0 negative integers. The maximum count among them is 4.

```

 

 **Constraints:** 

- 1 <= nums.length <= 2000
- -2000 <= nums[i] <= 2000
- nums is sorted in a non-decreasing order.

 

 **Follow up:**  Can you solve the problem in `O(log(n))` time complexity?

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 47.1 MB (beats 37.66%)  
**Submitted:** 2026-07-30T07:14:35.904Z  

```java
class Solution {
    public int maximumCount(int[] nums) {
        int posCount=lowerBound(nums,0);
        int negCount=nums.length-upperBound(nums,0);
        return Math.max(posCount,negCount);
        
    }
    public static int lowerBound(int[] nums , int target){
        int high=nums.length-1;
        int low = 0;
        int mid=0;
        int ans=nums.length;
        while(low<=high){
           mid=(high+low)/2;
           if(nums[mid]>=target){
            ans=mid;
            high=mid-1;
           }
           else {
            low=mid+1;
           }
        }
        return ans;
    }
    public static int upperBound(int[] nums , int target){
        int high=nums.length-1;
        int low = 0;
        int mid=0;
        int ans=nums.length;
        while(low<=high){
           mid=(high+low)/2;
           if(nums[mid]>target){
            ans=mid;
            high=mid-1;
           }
           else {
            low=mid+1;
           }
        }
        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/)