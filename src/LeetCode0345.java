/**
 * 反转字符串中的元音字母
 */
public class LeetCode0345 extends BaseLeetCode {
    public static void main(String[] args) {
        solution(new LeetCode0345().reverseVowels("aA"));
    }

    /**
     * 双指针
     * @param s
     * @return
     */
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int start = 0, end = chars.length - 1, length = chars.length;
        while(start < end) {
            while(start < length && !isYuanYin(chars[start])) {
                start++;
            }
            while(end >= 0 && !isYuanYin(chars[end])) {
                end--;
            }
            if(start < end) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
        }
        return new String(chars);
    }

    private boolean isYuanYin(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}