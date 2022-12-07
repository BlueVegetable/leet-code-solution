import java.math.BigInteger;

/**
 * Excel 表列序号
 */
public class LeetCode0171 extends BaseLeetCode {
    public static void main(String[] args) {
        solution(new LeetCode0171().titleToNumber("ZY"));
    }

    public int titleToNumber(String columnTitle) {
        int result = 0;
        char[] chs = columnTitle.toCharArray();
        for (int i=chs.length-1;i>=0;i--) {
            int number = getNumber(chs[i]);
            result += number * Math.pow(26,chs.length-1-i);
        }
        return result;
    }

    public int getNumber(char ch) {
        if(ch >= 'A' && ch <= 'Z') {
            return ch - 'A' + 1;
        }
        return 0;
    }
}