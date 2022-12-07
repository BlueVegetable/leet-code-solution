/**
 * 罗马数字转整数
 */
public class LeetCode0013 extends BaseLeetCode {
    public static void main(String[] args) {
        solution(new LeetCode0013().romanToInt("LVIII"));
    }

    public int romanToInt(String s) {
        //在代码实现上，可以往后看多一位，对比当前位与后一位的大小关系，从而确定当前位是加还是减法。当没有下一位时，做加法即可
        int result = 0;
        int temp = getValue(s.charAt(0));
        for (int i=1;i<s.length();i++) {
            int right = getValue(s.charAt(i));
            if( temp < right ) {
                //当小值在大值的左边，则减小值
                result -= temp;
            } else {
                //当小值在大值的右边，则加小值
                result += temp;
            }
            temp = right;
        }

        //右值永远为正，因此最后一位必然为正.记得最后一位要加上
        result += temp;
        return result;
    }

    private int getValue(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}