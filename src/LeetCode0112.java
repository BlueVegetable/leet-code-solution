/**
 * 给你二叉树的根节点 root 和一个表示目标和的整数 targetSum 。
 * 判断该树中是否存在 根节点到叶子节点 的路径，这条路径上所有节点值相加等于目标和 targetSum 。
 * 如果存在，返回 true ；否则，返回 false 。
 */
public class LeetCode0112 extends BaseLeetCode {
    public static void main(String[] args) {
        ;
    }

    /**
     * 递归算法
     * @param root
     * @param targetSum
     * @return
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) {
            if(targetSum == 0) {
                return true;
            } else {
                return false;
            }
        }
        if(root.val == targetSum && root.left == null && root.right == null) {
            return true;
        }
        //剩余的数量
        int leftCount = targetSum - root.val;
        if(leftCount < 0) {
            return false;
        }
        return hasPathSum(root.left, leftCount) || hasPathSum(root.right, leftCount);
    }
}