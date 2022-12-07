/**
 * 只出现一次的数字
 * 除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 */
public class LeetCode0136 extends BaseLeetCode {
    public static void main(String[] args) {
        int[] numbers = new int[]{4,1,2,1,2};
        solution(new LeetCode0136().singleNumber(numbers));
    }

    /**
     * 关键信息：任何数与自己做 异或运算 结果为0
     * @param numbers
     * @return
     */
    public int singleNumber(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            result = result ^ number;
        }
        return result;
    }
}