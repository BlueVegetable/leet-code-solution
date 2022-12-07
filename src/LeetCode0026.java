/**
 * 删除升序数组中的重复项
 */
public class LeetCode0026 extends BaseLeetCode {
    public static void main(String[] args) {
        ;
    }

    /**
     * 快慢指针定位
     * @param numbers
     * @return
     */
    public int removeDuplicates(int[] numbers) {
        int length = numbers.length;
        if(length == 0) {
            return 0;
        }
        int fast = 1;
        int slow = 1;
        while(fast < length) {
            if(numbers[fast] != numbers[fast-1]) {
                numbers[slow] = numbers[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}