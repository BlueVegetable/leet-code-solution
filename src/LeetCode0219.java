import java.util.HashSet;
import java.util.Set;

/**
 * 存在重复元素 II
 */
public class LeetCode0219 extends BaseLeetCode {
    public static void main(String[] args) {
        ;
    }

    /**
     * 使用滑动窗口解题
     * @param numbers
     * @param k
     * @return
     */
    public boolean containsNearbyDuplicate(int[] numbers, int k) {
        Set<Integer> set = new HashSet<>();
        int index = 0;
        int length = numbers.length;
        for (;index < length;index++) {
            if(index > k) {
                //滑动窗口滑到右边,去掉左边的
                set.remove(numbers[index - k - 1]);
            }
            //加上右边的，如果加失败，代表存在，返回真
            if(!set.add(numbers[index])) {
                return true;
            }
        }
        return false;
    }
}