import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 二叉树的层序遍历
 * 给你二叉树的根节点 root ，返回其节点值的 层序遍历 。 （即逐层地，从左到右访问所有节点）。
 */
public class LeetCode0102 extends BaseLeetCode {
    public static void main(String[] args) {
        ;
    }

    /**
     * BFS广度优先搜索算法
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null) {
            queue.offer(root);
        } else {
            return result;
        }

        while(!queue.isEmpty()) {
            List<Integer> floor = new ArrayList<>();
            int n = queue.size();
            for (int i=0;i<n;i++) {
                TreeNode current = queue.poll();
                if(current.left != null) {
                    queue.offer(current.left);
                }
                if(current.right != null) {
                    queue.offer(current.right);
                }
                floor.add(current.val);
            }
            result.add(floor);
        }
        return result;
    }
}