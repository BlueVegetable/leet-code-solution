/**
 * 给定一个二叉树，找出其最小深度
 */
public class LeetCode0111 extends BaseLeetCode {
    public static void main(String[] args) {
        ;
    }

    /**
     * 递归方法
     * @param root
     * @return
     */
    public int minDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        /**
         * 无左子树与右子树，那该树深度便为1
         */
        if(root.left == null && root.right == null) {
            return 1;
        }

        int height = Integer.MAX_VALUE;
        if(root.left != null) {
            height = Math.min(minDepth(root.left), height);
        }
        if(root.right != null) {
            height = Math.min(minDepth(root.right),height);
        }

        return height + 1;
    }
}