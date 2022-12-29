/**
 * 最长回文子串
 */
public class LeetCode0005 extends BaseLeetCode {
    public static void main(String[] args) {
        ;
    }

    /**
     * 动态规划处理
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        int length = s.length();
        int maxLength = -1;
        String result = "";
        char[] chs = s.toCharArray();
        boolean[][] check = new boolean[length][length];
        for (int i=0;i<length;i++) {
            //每一个单个字符均为回文串
            check[i][i] = true;
        }
        for (int i=0;i<length;i++) {
            if(i == length - 1) {
                break;
            }
            for (int j=i+1;j<length;j++) {
                boolean flag = false
                if(Math.abs(i-j) == 1) {
                    flag = chs[i] == chs[j];
                } else {
                    flag = check[i+1][j-1]
                }
            }
        }
    }
}