/**
 * 不同路径
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。
 * 问总共有多少条不同的路径？
 */
public class LeetCode0062 extends BaseLeetCode {
    public static void main(String[] args) {
        solution(new LeetCode0062().uniquePaths(3,2));
    }

    /**
     * 动态规划
     * dp[m][n] = dp[m-1][n] + dp[m][n-1]
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        //第一行或第一列都只有一种路径
        for (int i=1;i<=m;i++) {
            dp[i][1] = 1;
        }
        for (int i=1;i<=n;i++) {
            dp[1][i] = 1;
        }

        //开始进行动态规划
        for (int i=2;i<=m;i++) {
            for (int j=2;j<=n;j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m][n];
    }
}