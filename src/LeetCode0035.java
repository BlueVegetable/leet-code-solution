public class LeetCode0035 extends BaseLeetCode {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,3,5,6};
        solution(new LeetCode0035().searchInsert(numbers, 7));
    }

    public int searchInsert(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int index = numbers.length;
        while(left <= right) {
            int middle = (right - left) / 2 + left;
            if(numbers[middle] >= target) {
                //在左边
                index = middle;
                right = middle - 1;
            } else {
                //在右边
                left = middle + 1;
            }
        }
        return index;
    }
}