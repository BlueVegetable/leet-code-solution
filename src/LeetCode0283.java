/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 */
public class LeetCode0283 extends BaseLeetCode {
    public static void main(String[] args) {
        ;
    }

    /**
     * 使用双指针，左指针指向当前已经处理好的序列的尾部，右指针指向待处理序列的头部。
     * 右指针不断向右移动，每次右指针指向非零数，则将左右指针对应的数交换，同时左指针右移。
     * @param numbers
     */
    public void moveZeroes(int[] numbers) {
        int left = 0;
        int right = 0;
        int length = numbers.length;
        while(right < length) {
            if(numbers[right] != 0) {
                int temp = numbers[right];
                numbers[right] = numbers[left];
                numbers[left] = temp;
                left++;
            }
            right++;
        }
    }
}