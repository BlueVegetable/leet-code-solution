import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负索引 rowIndex，返回「杨辉三角」的第 rowIndex 行。
 */
public class LeetCode0119 extends BaseLeetCode {

    private static List<List<Integer>> sanJiao = new ArrayList<>();

    static {
        for (int rowIndex = 0;rowIndex <= 33; rowIndex++) {
            List<Integer> rowList = new ArrayList<>();
            for (int i = 0;i < rowIndex + 1; i++) {
                if(i == 0 || i == rowIndex) {
                    rowList.add(1);
                } else {
                    //不是第一行
                    if(rowIndex > 0) {
                        List<Integer> last = sanJiao.get(rowIndex - 1);
                        rowList.add(last.get(i-1) + last.get(i));
                    }
                }
            }
            sanJiao.add(rowList);
        }
    }

    public List<Integer> getRow(int rowIndex) {
        return sanJiao.get(rowIndex);
    }

    public static void main(String[] args) {
        System.out.println(sanJiao);
    }
}