import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 编写一个算法来判断一个数 n 是不是快乐数。
 */
public class LeetCode0202 extends BaseLeetCode {
    public static void main(String[] args) {
        ;
    }

    /**
     * 一个数的分解位数后平方绝对不会越变越大。都会有一个固定的上限，
     * 一个数不是快乐数，就一定是个快乐数
     * 不是快乐数的话，由于分解位数后平方的和有上限，因此只会产生循环
     * @param n
     * @return
     */
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n != 1 && !set.contains(n)) {
            set.add(n);
            n = getNext(n);
        }
        return n == 1;
    }

    public int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }
}