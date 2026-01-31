import java.util.Stack;

class Solution {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] list = s.toCharArray();
        if (list.length % 2 != 0) {
            return false;
        }
        for (char p : list) {
            if (p=='(' || p=='[' || p=='{') {
                stack.push(p);
                continue;
            }
            if(stack.isEmpty())return false;
            char pop= stack.pop();
            if((p==')'&&pop=='(')||
                    (p==']'&&pop=='[')||
                    (p=='}'&&pop=='{')){
                continue;
            }
                return false;


        }
        return stack.isEmpty();
    }
}
