/**
 * 平衡二叉树
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 * 本题中，一棵高度平衡二叉树定义为：
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。
 */
public class LeetCode0110 extends BaseLeetCode {
    public static void main(String[] args) {
        ;
    }

    public boolean isBalanced(TreeNode root) {
        return height(root) >= 0;
    }

    /**
     * 计算高度
     * @param root
     * @return
     */
    private int height(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if(leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
            //将下游的错误结果不断往上传
            return -1;
        }
        //分支加上自己的高度
        return Math.max(leftHeight, rightHeight) + 1;
    }
}