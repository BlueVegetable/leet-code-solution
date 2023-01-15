/**
 * Z 字形变换
 * 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
 */
public class LeetCode0006 extends BaseLeetCode {
    public static void main(String[] args) {
        solution(new LeetCode0006().convert("PAYPALISHIRING",3));
    }

    /**
     * 使用二维数组处理
     * 数组的字符总数：n
     * 数组的行数：row = numRows
     * 数组的周期：T = row + row - 2 = 2row-2
     * 数组的一周期列数：everyColumn = 1 + row - 2 = row-1
     * 数组的总列数：columns = (n/T)*everyColumn = [n/(2row-2)]*(row-1)
     *
     * @param s
     * @param numRows
     * @return
     */
    public String convert(String s, int numRows) {
        int length = s.length();
        if (numRows == 1 || numRows >= length) {
            return s;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int T = 2 * (numRows-1);
        int columns = (length+T-1)/T*(numRows-1);
        Character[][] lists = new Character[numRows][columns];
        for (int i=0;i<numRows;i++) {
            for (int j=0;j<columns;j++) {
                lists[i][j] = null;
            }
        }
        for (int i=0, x=0, y=0;i<length;i++) {
            lists[x][y] = s.charAt(i);
            if(i%T < numRows - 1) {
                x++;
            } else {
                x--;
                y++;
            }
        }
        for (int i=0;i<numRows;i++) {
            for (int j=0;j<columns;j++) {
                if(lists[i][j] != null) {
                    stringBuilder.append(lists[i][j]);
                }
            }
        }
        return stringBuilder.toString();
    }
}