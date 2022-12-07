/**
 * 二叉树的最大深度
 */
public class LeetCode0104 extends BaseLeetCode {
    public static void main(String[] args) {
        ;
    }

    /**
     * 递归解决
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        return maxDepth(root,0);
    }

    private int maxDepth(TreeNode root, int depth) {
        if(root == null) {
            return depth;
        }
        return Math.max(maxDepth(root.left,depth+1),maxDepth(root.right,depth+1));
    }
}