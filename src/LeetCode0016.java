import java.util.Arrays;

/**
 * 最接近的三数之和
 * 给你一个长度为 n 的整数数组 numbers 和 一个目标值 target。请你从 numbers 中选出三个整数，使它们的和与 target 最接近。
 * 返回这三个数的和。
 */
public class LeetCode0016 extends BaseLeetCode {
    public static void main(String[] args) {
        solution(new LeetCode0016().threeSumClosest(new int[]{4,0,5,-5,3,3,0,-4,-5},-2));
    }

    /**
     * 排序+双指针
     * @param numbers
     * @param target
     * @return
     */
    public int threeSumClosest(int[] numbers, int target) {
        //先排序
        Arrays.sort(numbers);

        //长度
        int length = numbers.length;

        Integer value = Integer.MAX_VALUE;

        for (int first = 0;first<length;first++) {
            if(first>0 && numbers[first] == numbers[first-1]) {
                //不能重复
                continue;
            }

            //第二个指针
            int second = first + 1;

            //第三个指针
            int third = length - 1;

            //开始双向奔赴
            for (;second < third;) {
                int sum = numbers[first] + numbers[second] + numbers[third];
                if(sum == target) {
                    return target;
                } else {
                    if(value == null) {
                        value = sum;
                    } else {
                        if(Math.abs(sum-target) < Math.abs(value-target)) {
                            value = sum;
                        }
                    }
                    if(sum > target) {
                        int thirdNext = third-1;
                        while(thirdNext > second && numbers[thirdNext]==numbers[third]) {
                            thirdNext--;
                        }
                        third = thirdNext;
                    } else {
                        int secondNext = second+1;
                        while(secondNext<third && numbers[secondNext] == numbers[second]) {
                            secondNext++;
                        }
                        second = secondNext;
                    }
                }
            }
        }
        return value;
    }
}