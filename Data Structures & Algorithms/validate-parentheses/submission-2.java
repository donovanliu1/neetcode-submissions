class Solution {
    public boolean isValid(String s) {
        Stack<Character> parenthesisStack = new Stack();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') parenthesisStack.push(c);
            else if (parenthesisStack.empty()) return false;
            else if (c == ')' && parenthesisStack.pop() != '(') return false;
            else if (c == ']' && parenthesisStack.pop() != '[') return false;
            else if (c == '}' && parenthesisStack.pop() != '{') return false;
            // else parenthesisStack.pop();
        }
        return parenthesisStack.empty();
    }
}
