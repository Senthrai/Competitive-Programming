package com.mycompany.foutoir;

import java.util.Stack;

public class ValidParentheses {
    static boolean isValid(String s){
        // Create a stack to store opening brackets
        Stack<Character> stack = new Stack<>();

        // Traverse the input string
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                // Push opening brackets onto the stack
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                // Check if the stack is empty
                if (stack.isEmpty()) {
                    return false; // No matching opening bracket
                }

                // Pop the top element from the stack
                char top = stack.pop();

                // Check if the current closing bracket matches the popped opening bracket
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false; // Mismatched brackets
                }
            }
        }
        return stack.isEmpty();
    }
}
