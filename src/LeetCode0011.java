import java.util.Arrays;

/**
 * 盛最多水的容器
 * 给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 */
public class LeetCode0011 extends BaseLeetCode {
    public static void main(String[] args) {
        int[] list = new int[]{1,8,6,2,5,4,8,3,7};
        solution(new LeetCode0011().maxArea(list));
    }

    /**
     * 双指针解决
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int result = 0;
        while(left < right) {
            result = Math.max(result, (right - left) * Math.min(height[left], height[right]));
            if(height[left] >= height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return result;
    }
}