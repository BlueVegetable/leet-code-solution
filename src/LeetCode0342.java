public class LeetCode0342 extends BaseLeetCode {
    public static void main(String[] args) {
        solution(new LeetCode0342().isPowerOfFour(5));
    }

    public boolean isPowerOfFour(int n) {
        //第一步：判断是否大于等于0
        //第二步：判断是否为2的多次幂
        //第三部：判断是否为4的多次幂
        return n >= 0 && ((n & (n-1)) == 0) && ((n & 0xAAAAAAAA) == 0);
    }
}