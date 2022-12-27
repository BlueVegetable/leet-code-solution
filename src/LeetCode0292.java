/**
 * Nim 游戏
 * 假设你们每一步都是最优解。请编写一个函数，来判断你是否可以在给定石头数量为 n 的情况下赢得游戏。如果可以赢，返回 true；否则，返回 false
 */
public class LeetCode0292 extends BaseLeetCode {
    public static void main(String[] args) {
        ;
    }

    /**
     * 两边都是最优解
     * 1. 1-3个，我赢
     * 2. 4个，他赢
     * 3. 5-7个，我赢
     * 4. 8个，他赢
     */
    public boolean canWinNim(int n) {
        return n%4 != 0;
    }
}