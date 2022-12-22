/**
 * 编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为汉明重量）。
 */
public class LeetCode0191 extends BaseLeetCode {
    public static void main(String[] args) {
        solution(new LeetCode0191().hammingWeight(11));
    }

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int length = 32;
        int result = 0;
        for (int i=0;i<length;i++) {
            if((n&1) != 0) {
                result++;
            }
            n >>>= 1;
        }
        return result;
    }
}