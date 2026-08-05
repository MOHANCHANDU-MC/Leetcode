# Valid Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

An input string is valid if:

- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.
- Every close bracket has a corresponding open bracket of the same type.

 

 **Example 1:** 

 **Input:**  s = "()"

 **Output:**  true

 **Example 2:** 

 **Input:**  s = "()[]{}"

 **Output:**  true

 **Example 3:** 

 **Input:**  s = "(]"

 **Output:**  false

 **Example 4:** 

 **Input:**  s = "([])"

 **Output:**  true

 **Example 5:** 

 **Input:**  s = "([)]"

 **Output:**  false

 

 **Constraints:** 

- 1 <= s.length <= 104
- s consists of parentheses only '()[]{}'.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 86.10%)  
**Memory:** 43.3 MB (beats 41.57%)  
**Submitted:** 2026-08-05T00:26:21.134Z  

```java
class Solution {
    public boolean isValid(String s) {
        if(s==null || s.length()%2!=0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                 char top = stack.pop();
                if(ch==')' && top !='(' || ch=='}' && top !='{' || ch==']' && top !='['){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-parentheses/)