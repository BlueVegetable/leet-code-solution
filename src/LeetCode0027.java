import java.util.Arrays;

/**
 * 移除元素
 */
public class LeetCode0027 extends BaseLeetCode {
    /**
     * 由于题目要求删除数组中等于 val 的元素，
     * 因此输出数组的长度一定小于等于输入数组的长度，我们可以把输出的数组直接写在输入数组上。
     * 可以使用双指针：右指针 right 指向当前将要处理的元素，左指针 left 指向下一个将要赋值的位置。
     * @param s
     * @return
     */
    public int removeElement(int[] numbers, int value) {
        int first = 0;
        int second = 0;
        int length = numbers.length;

        //两个指针实现
        int resultLength = 0;
        while(second < length) {
            if(numbers[second] == value) {
                second++;
                continue;
            }

            numbers[first] = numbers[second];
            resultLength++;
            first++;
            second++;
        }
        return resultLength;
    }

    public static void main(String[] args) {
        int[] numbers = new int[4];
        numbers[0] = 3;
        numbers[1] = 2;
        numbers[2] = 2;
        numbers[3] = 3;
        solution(new LeetCode0027().removeElement(numbers, 3));
    }
}