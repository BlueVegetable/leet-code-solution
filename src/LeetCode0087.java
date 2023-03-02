/**
 * 删除有序数组中的重复项 II
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使得出现次数超过两次的元素只出现两次 ，返回删除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 */
public class LeetCode0087 extends BaseLeetCode {
    public static void main(String[] args) {
        int[] array = new int[]{1,1,1,2,2,3};
        int result = new LeetCode0087().removeDuplicates(array);
        solution(result);
    }

    /**
     * 快慢双指针处理
     * 重要条件：数组有序
     * @param numbers
     * @return
     */
    public int removeDuplicates(int[] numbers) {
        int originLength = numbers.length;
        //长度小于等于2的数组一定符合条件
        if(originLength <= 2) {
            return originLength;
        }

        int quickIndex = 2, slowIndex = 2;
        while(quickIndex < originLength) {
            if(numbers[slowIndex-2] != numbers[quickIndex]) {
                //没有重复
                numbers[slowIndex] = numbers[quickIndex];
                slowIndex++;
            }
            quickIndex++;
        }
        return slowIndex;
    }
}