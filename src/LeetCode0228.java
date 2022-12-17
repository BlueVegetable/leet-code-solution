import java.util.ArrayList;
import java.util.List;

/**
 * 汇总区间
 */
public class LeetCode0228 extends BaseLeetCode {
    public static void main(String[] args) {
        ;
    }

    /**
     * 给定一个  无重复元素 的 有序 整数数组 nums
     * 返回 恰好覆盖数组中所有数字 的 最小有序 区间范围列表。
     * @param numbers
     * @return
     */
    public List<String> summaryRanges(int[] numbers) {
        List<String> result = new ArrayList<>();
        int i = 0;
        int n = numbers.length;
        while(i<n) {
            int low = i;
            i++;
            while(i<n && numbers[i] == numbers[i-1] + 1) {
                i++;
            }
            int high = i - 1;
            StringBuilder temp = new StringBuilder(Integer.toString(numbers[low]));
            if(low < high) {
                temp.append("->");
                temp.append(Integer.toString(numbers[high]));
            }
            result.add(temp.toString());
        }
        return result;
    }
}