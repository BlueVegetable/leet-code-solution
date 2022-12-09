import java.util.Stack;

/**
 * 用栈实现队列
 */
public class LeetCode0232 extends BaseLeetCode {
    public static void main(String[] args) {
        ;
    }

    private Stack<Integer> input;
    private Stack<Integer> output;

    public LeetCode0232() {
        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        if(output.empty()) {
            while(!input.empty()) {
                Integer inline = input.pop();
                output.push(inline);
            }
        }
        return output.pop();
    }

    public int peek() {
        if(output.empty()) {
            while(!input.empty()) {
                Integer inline = input.pop();
                output.push(inline);
            }
        }
        return output.peek();
    }

    public boolean empty() {
        return output.empty() && input.empty();
    }
}