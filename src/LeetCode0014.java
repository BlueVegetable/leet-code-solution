/**
 * 最长公共前缀
 */
public class LeetCode0014 extends BaseLeetCode {
    public static void main(String[] args) {
        String[] parameters = new String[]{"dog","racecar","car"};
        solution(new LeetCode0014().longestCommonPrefix(parameters));
    }

    /**
     * 暴力破解
     * @param strings
     * @return
     */
    public String longestCommonPrefix(String[] strings) {
        if(strings == null || strings.length == 0) {
            return "";
        }
        int length = Integer.MAX_VALUE;
        for (String string:strings) {
            length = Math.min(length, string.length());
        }

        StringBuilder result = new StringBuilder();
        for (int i=0;i<length;i++) {
            char current = strings[0].charAt(i);
            for (int j=1; j<strings.length;j++) {
                if(strings[j].charAt(i) != current) {
                    return result.toString();
                }
            }
            result.append(current);
        }
        return result.toString();
    }
}