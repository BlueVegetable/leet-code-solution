import java.util.Arrays;

/**
 * 两个数组的交集
 * 给定两个数组 nums1 和 nums2 ，返回 它们的交集 。输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序 。
 */
public class LeetCode0349 extends BaseLeetCode {
    public static void main(String[] args) {
        ;
    }

    /**
     * 排序+双指针处理
     * @param numbers1
     * @param numbers2
     * @return
     */
    public int[] intersection(int[] numbers1, int[] numbers2) {
        //先排序
        Arrays.sort(numbers1);
        Arrays.sort(numbers2);

        //大数组
        int[] numberAll = new int[numbers1.length + numbers2.length];
        int i=0, j=0,current=0;
        int length1 = numbers1.length;
        int length2 = numbers2.length;
        while(i<length1 && j<length2) {
            if(numbers1[i] == numbers2[j]) {
                //保证加入集合的唯一性
                if(current == 0 || numberAll[current-1] != numbers1[i]) {
                    numberAll[current] = numbers1[i];
                    current++;
                }
                i++;
                j++;
            } else if(numbers1[i] < numbers2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return Arrays.copyOfRange(numberAll, 0, current);
    }
}