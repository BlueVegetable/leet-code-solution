/**
 * x 的平方根
 */
public class LeetCode0069 {
    public int mySqrt(int x) {
        /**
         * 思路：使用指数函数和对数函数进行换底
         * 转化为 e^(0.5ln x)
         */
        if (x == 0) {
            return 0;
        }
        //算出指数值
        int ans = (int) Math.exp(0.5 * Math.log(x));
        //由于浮点数转化为整数有误差，可能会有 1 个值得误差
        return (long) (ans + 1) * (ans + 1) <= x ? ans + 1 : ans;
    }

    /**
     * 二分查找法
     * @param x
     * @return
     */
    public int mySqrt2(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}