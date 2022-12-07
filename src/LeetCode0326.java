/**
 * 给定一个整数，写一个函数来判断它是否是 3 的幂次方
 */
public class LeetCode0326 extends BaseLeetCode {
    public static void main(String[] args) {
        ;
    }

    /**
     * 简单粗暴的做法,一直除
     * @param n
     * @return
     */
    public boolean isPowerOfThree(int n) {
        while(n != 0 && (n % 3) == 0) {
            n = n/3;
        }
        //能约到底结果便是 1
        return n == 1;
    }

    /**
     * 不使用循环的做法
     * @param n
     * @return
     */
    public boolean isPowerOfThree2(int n) {
        /**
         * 取出给定区间最大的数，然后看是否可以被 n 整除
         * 区间最大的数是 3^19
         */
        return n > 0 && 1162261467 % n == 0;
    }
}