import java.util.HashMap;
import java.util.Map;

/**
 * 单词规律
 */
public class LeetCode0290 extends BaseLeetCode {
    public static void main(String[] args) {
        ;
    }


    public boolean wordPattern(String pattern, String s) {
        Map<String, Character> stringToChar = new HashMap<>();
        Map<Character, String> charToString = new HashMap<>();
        int stringLength = s.length();
        //词的首位索引
        int i = 0;
        for (int j=0; j<pattern.length();j++) {
            char currentPatternChar = pattern.charAt(j);
            if(i >= stringLength) {
                return false;
            }
            //词的末尾索引
            int k = i;
            while(k < stringLength && s.charAt(k) != ' ') {
                k++;
            }
            //取出字符串
            String temp = s.substring(i, k);
            if(stringToChar.containsKey(temp) && stringToChar.get(temp)!=currentPatternChar) {
                return false;
            }
            if(charToString.containsKey(currentPatternChar) && !temp.equals(charToString.get(currentPatternChar))) {
                return false;
            }
            stringToChar.put(temp, currentPatternChar);
            charToString.put(currentPatternChar, temp);
            i = k+1;
        }
        //如果词的开头还没走完，那就是不匹配。
        return i >= stringLength;
    }
}