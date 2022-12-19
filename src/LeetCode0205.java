import java.util.HashMap;

/**
 * 同构字符串
 * 给定两个字符串 s 和 t ，判断它们是否是同构的。
 */
public class LeetCode0205 extends BaseLeetCode {
    public static void main(String[] args) {
        solution(new LeetCode0205().isIsomorphic("badc","baba"));
    }

    public boolean isIsomorphic(String s, String t) {
        int i=0;
        if(s.length() != t.length()) {
            return false;
        }
        int length = s.length();
        HashMap<Character, Character> map = new HashMap<>();
        while(i < length) {
            char char1 = s.charAt(i);
            char char2 = t.charAt(i);
            Character temp = map.get(char1);
            if(temp == null) {
                map.put(char1, char2);
            } else {
                if(char2 != temp) {
                    return false;
                }
            }
            i++;
        }
        map = new HashMap<>();
        i = 0;
        while(i < length) {
            char char1 = t.charAt(i);
            char char2 = s.charAt(i);
            Character temp = map.get(char1);
            if(temp == null) {
                map.put(char1, char2);
            } else {
                if(char2 != temp) {
                    return false;
                }
            }
            i++;
        }
        return true;
    }
}