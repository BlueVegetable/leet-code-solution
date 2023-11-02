/**
 * 实现pow(x,n), 即计算 x 的证书 n 次幂函数
 */
public class LeetCode0050 extends BaseLeetCode {
    public static void main(String[] args) {
        solution(new LeetCode0050().myPow(2.1, 3));
    }

    public double myPow(double x, int n) {
        long N = n;
        return N >= 0 ? quickMull(x, N):1.0/quickMull(x, -N);
    }

    private double quickMull(double x, long N) {
        if(N == 0) {
            return 1.0;
        }
        double y = quickMull(x, N/2);
        return N % 2 == 0?y*y:y*y*x;
    }
}