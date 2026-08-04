import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        // Fast fail: an odd length string cannot be balanced
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // Push the corresponding closing bracket onto the stack
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } 
            // If it's a closing bracket, check for matching pairs
            else {
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }

        // String is valid only if no unmatched opening brackets are left
        return stack.isEmpty();
    }
}
