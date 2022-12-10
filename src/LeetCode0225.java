import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 用队列实现栈
 */
public class LeetCode0225 extends BaseLeetCode {

    private Queue<Integer> input;

    private Queue<Integer> output;

    /**
     * 实现逻辑：不断取队头，放到队尾
     */
    public LeetCode0225() {
        input = new LinkedList<>();
        output = new LinkedList<>();
    }

    public void push(int x) {
        output.offer(x);
        while(!input.isEmpty()) {
            int number = input.poll();
            output.offer(number);
        }
        Queue<Integer> temp = input;
        input = output;
        output = temp;
    }

    public int pop() {
        return input.poll();
    }

    public int top() {
        return input.peek();
    }

    public boolean empty() {
        return output.isEmpty() && input.isEmpty();
    }

    public static void main(String[] args) {
        ;
    }
}