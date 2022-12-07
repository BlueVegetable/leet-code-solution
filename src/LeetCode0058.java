/**
 * 最后一个单词的长度
 */
public class LeetCode0058 extends BaseLeetCode {
    public static void main(String[] args) {
        solution(new LeetCode0058().lengthOfLastWord("luffy is still joyboy"));
    }

    /**
     * 暴力破解
     * @param s
     * @return
     */
    public int lengthOfLastWord(String s) {
        int length = s.length();
        int result = 0;

        boolean start = true;
        for (int i=length-1;i>=0;i--) {
            char ch = s.charAt(i);
            if(start) {
                if(ch == ' ') {
                    continue;
                } else {
                    start = false;
                }
            } else {
                if(ch == ' ') {
                    break;
                }
            }
            result++;
        }
        return result;
    }
}