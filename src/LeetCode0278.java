/**
 * 第一个错误的版本
 */
public class LeetCode0278 extends BaseLeetCode {
    public static void main(String[] args) {
        ;
    }

    /**
     * 二分查找
     * @param n
     * @return
     */
    public int firstBadVersion(int n) {
        return binarySearch(1, n);
    }

    private int binarySearch(int left, int right) {
        int middle = left + (right - left)/2;
        if(isBadVersion(middle)) {
            //是否有上个版本
            if(middle > 1) {
                if(!isBadVersion(middle-1)) {
                    return middle;
                } else {
                    return binarySearch(left, middle - 1);
                }
            } else {
                //没有上版本的话，结束
                return middle;
            }
        } else {
            return binarySearch(middle+1,right);
        }
    }

    private boolean isBadVersion(int version) {
        return false;
    }
}