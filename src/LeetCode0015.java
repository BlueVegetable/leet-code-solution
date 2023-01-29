import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和
 * 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]]
 * 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请
 *
 * 你返回所有和为 0 且不重复的三元组。
 */
public class LeetCode0015 extends BaseLeetCode {
    public static void main(String[] args) {
        int[] testArray = new int[]{0,0,0};
        solution(new LeetCode0015().threeSum(testArray));
    }

    /**
     * 排序+双指针
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] numbers) {
        //先排序
        Arrays.sort(numbers);

        List<List<Integer>> result = new ArrayList<>();
        int length = numbers.length;

        //两重循环,first为第一个数的索引
        for (int first=0;first < length;first++) {
            if(first > 0 && numbers[first] == numbers[first-1]) {
                //两数重复，跳过
                continue;
            }

            //second为第二个数的索引
            int second = first + 1;
            //third为第三个数的索引
            int third = length - 1;
            //双指针双向奔赴看是否满足条件
            for (;second < length;second++) {
                //检查second索引处的值是否重复
                if (second > first + 1 && numbers[second] == numbers[second - 1]) {
                    //重复跳过
                    continue;
                }
                //开始定位指针C的具体位点
                while (second < third && numbers[second] + numbers[third] > -numbers[first]) {
                    third--;
                }
                if (second == third) {
                    //指针重合代表不满足，结束遍历
                    break;
                }
                if (check(numbers[first], numbers[second], numbers[third])) {
                    List<Integer> inline = new ArrayList<>();
                    inline.add(numbers[first]);
                    inline.add(numbers[second]);
                    inline.add(numbers[third]);
                    result.add(inline);
                }
            }
        }
        return result;
    }

    private boolean check(int first, int second, int third) {
        return first + second + third == 0;
    }
}