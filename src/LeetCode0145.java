import java.util.ArrayList;
import java.util.List;

/**
 * 给你一棵二叉树的根节点 root ，返回其节点值的 后序遍历 。
 */
public class LeetCode0145 extends BaseLeetCode {
    public static void main(String[] args) {
        ;
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postOrder(root, list);
        return list;
    }

    private void postOrder(TreeNode root, List<Integer> list) {
        if(root == null) {
            return ;
        }
        postOrder(root.left,list);
        postOrder(root.right,list);
        list.add(root.val);
    }
}