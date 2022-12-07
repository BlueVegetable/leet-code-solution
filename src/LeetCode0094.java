import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树的中序遍历
 */
public class LeetCode0094 extends BaseLeetCode {
    public static void main(String[] args) {
        ;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        diGui(result, root);
        return result;
    }

    private void diGui(List<Integer> result, TreeNode current) {
        if(current == null) {
            return ;
        }
        diGui(result, current.left);
        result.add(current.val);
        diGui(result, current.right);
    }

    private void xunHuan(List<Integer> result, TreeNode current) {
        Stack<TreeNode> stack = new Stack<>();
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            result.add(current.val);
            current = current.right;
        }
    }
}