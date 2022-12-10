import java.util.Arrays;

/**
 * 给你两个整数数组nums1 和 nums2 ，
 * 请你以数组形式返回两数组的交集。
 * 返回结果中每个元素出现的次数，
 * 应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。
 * 可以不考虑输出结果的顺序。
 */
public class LeetCode0350 extends BaseLeetCode {
    public static void main(String[] args) {
        ;
    }

    /**
     * 排序 + 双指针
     * @param numbers1
     * @param numbers2
     * @return
     */
    public int[] intersect(int[] numbers1, int[] numbers2) {
        Arrays.sort(numbers1);
        Arrays.sort(numbers2);

        int index1 = 0;
        int index2 = 0;
        int length1 = numbers1.length;
        int length2 = numbers2.length;
        int[] intersection = new int[Math.min(length1,length2)];
        int resultLength = 0;
        while(index1 < length1 && index2 < length2) {
            if(numbers1[index1] < numbers2[index2]) {
                index1++;
            } else if(numbers1[index1] > numbers2[index2]) {
                index2++;
            } else {
                //相等的情况
                intersection[resultLength] = numbers1[index1];
                resultLength++;
                index1++;
                index2++;
            }
        }
        return Arrays.copyOfRange(intersection, 0, resultLength);
    }
}