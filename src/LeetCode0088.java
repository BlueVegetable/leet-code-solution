/**
 * 合并两个有序数组
 */
public class LeetCode0088 extends BaseLeetCode {
    public static void main(String[] args) {
        int[] numbers1 = new int[]{0};
        int[] numbers2 = new int[]{1};
        new LeetCode0088().merge(numbers1, 0,numbers2,1);
    }

    /**
     * 逆向双尾指针。从第一个数组的最后开始逆序来排
     * @param numbers1
     * @param m
     * @param numbers2
     * @param n
     */
    public void merge(int[] numbers1, int m, int[] numbers2, int n) {
        int i=m-1,j=n-1,location= m + n - 1;
        while(i >=0 && j >= 0) {
            if(numbers1[i] < numbers2[j]) {
                numbers1[location] = numbers2[j];
                j--;
            } else {
                numbers1[location] = numbers1[i];
                i--;
            }
            location--;
        }
        while(i>=0) {
            numbers1[location] = numbers1[i];
            i--;
            location--;
        }
        while(j>=0) {
            numbers1[location] = numbers2[j];
            j--;
            location--;
        }
    }
}