import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个二叉树的根节点 root ，按 任意顺序 ，返回所有从根节点到叶子节点的路径。
 */
public class LeetCode0257 extends BaseLeetCode {
    public static void main(String[] args) {
        ;
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        constructPaths(root, "", paths);
        return paths;
    }

    /**
     * 深度优先算法
     * @param root
     * @param path
     * @param paths
     */
    private void constructPaths(TreeNode root, String path, List<String> paths) {
        if(root != null) {
            StringBuilder stringBuilder = new StringBuilder(path);
            stringBuilder.append(root.val);
            if(root.left == null && root.right == null) {
                //当前节点是叶子节点
                paths.add(stringBuilder.toString());
            } else {
                stringBuilder.append("->");
                //当前节点不是叶子节点，继续递归遍历
                constructPaths(root.left, stringBuilder.toString(), paths);
                constructPaths(root.right, stringBuilder.toString(), paths);
            }
        }
    }
}