/**
 * 给你一个二叉树的根节点 root ， 检查它是否轴对称。
 */
public class LeetCode0101 extends BaseLeetCode {
    public static void main(String[] args) {
        ;
    }

    /**
     * 我们可以实现这样一个递归函数，通过「同步移动」两个指针的方法来遍历这棵树，
     * pp 指针和 qq 指针一开始都指向这棵树的根，随后 pp 右移时，qq 左移，pp 左移时，qq 右移。
     * 每次检查当前 pp 和 qq 节点的值是否相等，如果相等再判断左右子树是否对称。
     */
    public boolean isSymmetric(TreeNode root) {
        return isSame(root, root);
    }

    private boolean isSame(TreeNode left, TreeNode right) {
        if(left == null && null == right) {
            return true;
        }
        if(left == null || right == null) {
            return false;
        }
        return left.val == right.val &&  isSame(left.left,right.right) && isSame(left.right, right.left);
    }
}