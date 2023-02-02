import java.util.ArrayList;
import java.util.List;

/**
 * 括号生成
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 */
public class LeetCode0022 extends BaseLeetCode {
    public static void main(String[] args) {
        solution(new LeetCode0022().generateParenthesis(3));
    }

    /**
     * 递归实现
     * 原理："(" + 第 p 对括号的排列组合 + ")" + 第 q 对括号的排列组合，其中 p+q = n-1
     * 第 n 对括号的集合 是
     * @param n
     * @return
     */
    public List<String> generateParenthesis(int n) {
        List<String> retValue = new ArrayList<>();
        if(n == 0) {
            retValue.add("");
        } else if(n == 1) {
            retValue.add("()");
        } else {
            for (int p=0;p<n;p++) {
                int q = n-1-p;
                List<String> diGuiLeftValues = generateParenthesis(p);
                List<String> diGuiRightValues = generateParenthesis(q);

                //笛卡尔积
                for (int left = 0;left < diGuiLeftValues.size();left++) {
                    for (int right = 0;right < diGuiRightValues.size();right++) {
                        retValue.add("("+diGuiLeftValues.get(left)+")"+diGuiRightValues.get(right));
                    }
                }
            }
        }
        return retValue;
    }
}