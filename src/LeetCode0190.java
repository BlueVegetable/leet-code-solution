/**
 * 颠倒二进制位
 */
public class LeetCode0190 extends BaseLeetCode {
    public static void main(String[] args) {
        ;
    }

    public int reverseBits(int n) {
        int length = 32;
        int result = 0;
        for (int i=0;i<length && n!=0;i++) {
            //或操作
            result |= (n & 1) << (31 - i);
            n >>>= 1;
        }
        return result;
    }
}