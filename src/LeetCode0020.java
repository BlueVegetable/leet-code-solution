import java.util.Stack;

/**
 * 有效的括号
 */
public class LeetCode0020 extends BaseLeetCode {
    public static void main(String[] args) {
        solution(new LeetCode0020().isValid("()]"));
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push('?');
        for (int i=0;i<s.length();i++) {
            char current = s.charAt(i);
            switch (current) {
                case '(':
                case '[':
                case '{':stack.push(current);break;
                case ')':{
                    Character top = stack.peek();
                    if('(' == top) {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;
                }
                case ']':{
                    Character top = stack.peek();
                    if('[' == top) {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;
                }
                case '}': {
                    Character top = stack.peek();
                    if('{' == top) {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;
                }
            }
        }
        if(stack.size() == 1 && stack.peek() == '?') {
            return true;
        } else {
            return false;
        }
    }
}