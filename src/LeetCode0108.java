/**
 * 将有序数组转换为二叉搜索树
 * 给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 高度平衡 二叉搜索树。
 */
public class LeetCode0108 extends BaseLeetCode {
    public static void main(String[] args) {
        ;
    }

    /**
     * 二叉搜索树的中序遍历就是个升序数组
     * @param numbers
     * @return
     */
    public TreeNode sortedArrayToBST(int[] numbers) {
        return toBST(numbers, 0, numbers.length-1);
    }

    private TreeNode toBST(int[] number, int left, int right) {
        if(left > right) {
            return null;
        }
        int middle = (left + right) / 2;
        TreeNode result = new TreeNode();
        result.val = number[middle];
        result.left = toBST(number, left, middle-1);
        result.right = toBST(number, middle + 1, right);
        return result;
    }
}