import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树的前序遍历
 */
public class LeetCode0144 extends BaseLeetCode {
    public static void main(String[] args) {
        ;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        TreeNode current = root;
        List<Integer> result = new ArrayList<>();
        getResult(result,root);
        return result;
    }

    private void getResult(List<Integer> result, TreeNode currentNode) {
        if(currentNode == null) {
            return ;
        }
        result.add(currentNode.val);
        getResult(result, currentNode.left);
        getResult(result, currentNode.right);
    }

    /**
     * 循环，使用栈
     * @param head
     */
    public static void preOrderIteration(TreeNode head) {
        if (head == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(head);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.print(node.val + " ");
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }
}