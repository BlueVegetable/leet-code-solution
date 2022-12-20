/**
 * 给你一个整数 n，请你判断该整数是否是 2 的幂次方。如果是，返回 true ；否则，返回 false
 */
public class LeetCode0231 extends BaseLeetCode {
    public static void main(String[] args) {
        solution(new LeetCode0231().isPowerOfTwo(4));
    }

    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n-1)) == 0;
    }
}