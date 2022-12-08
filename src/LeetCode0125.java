/**
 * 验证回文串
 */
public class LeetCode0125 extends BaseLeetCode {
    public static void main(String[] args) {
        solution(new LeetCode0125().isPalindrome("OP"));
    }

    /**
     * 双指针
     * @param s
     * @return
     */
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(Character.isAlphabetic(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        char[] chs = sb.toString().toCharArray();
        int start = 0, end = chs.length - 1;
        while(start < end) {
            if(chs[start] != chs[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}