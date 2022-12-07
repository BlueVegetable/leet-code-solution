public class LeetCode1796 extends BaseLeetCode {
    //时间复杂度：O(n)：只需遍历一遍字符串
    //空间复杂度：O(1)：仅需常数个空间即可
    public int secondHighest(String s) {
        char[] chars = s.toCharArray();
        int first = -1, second = -1;
        for (char aChar : chars) {
            //如果第 s[i]s[i] 为字母则跳过；
            if(Character.isDigit(aChar)) {
                int digit = aChar - '0';
                //如果第 s[i]s[i] 为数字，则令 num 表示 s[i]s[i] 对应的十进制数字：

                //如果满足 num>first，则当前最大的数字为 num，第二大的数字为 first，则此时更新second 等于当前的first，更新当前的first 为num 即可
                if(digit > first) {
                    second = first;
                    first = digit;
                } else if(digit < first && digit > second) {
                        second = digit;
                }
            }
        }
        if(first == second) {
            return -1;
        } else {
            return second;
        }
    }
    public static void main(String[] args) {
        solution(new LeetCode1796().secondHighest("abc1111"));
    }
}