import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素
 */
public class LeetCode0169 extends BaseLeetCode {
    public static void main(String[] args) {
        int[] numbers = new int[]{2,2,1,1,1,2,2};
        solution(new LeetCode0169().majorityElement(numbers));
    }

    /**
     * 哈希表保存频率
     * @param numbers
     * @return
     */
    public int majorityElement(int[] numbers) {
        int length = numbers.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int number : numbers) {
            Integer count = map.getOrDefault(number, 0);
            count++;
            if(count >= length / 2 + 1) {
                return number;
            }
            map.put(number, count);
        }
        return -1;
    }
}