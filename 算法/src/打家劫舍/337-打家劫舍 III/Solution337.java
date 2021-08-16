import javax.swing.tree.TreeNode;
import java.util.HashMap;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution337 {
    HashMap<TreeNode, Integer> map1 = new HashMap<>(); // 选
    HashMap<TreeNode, Integer> map2 = new HashMap<>(); // 不选
    public int rob(TreeNode root) {
        dfs(root);
        return Math.max(map1.getOrDefault(root,0), map2.getOrDefault(root,0));
    }
    public void dfs(TreeNode root){
        if(root==null) return;
        dfs(root.left);
        dfs(root.right);
        map1.put(root, map2.getOrDefault(root.left,0) + map2.getOrDefault(root.right,0) + root.val);
        map2.put(root, Math.max(map1.getOrDefault(root.left,0), map2.getOrDefault(root.left,0)) +  Math.max(map1.getOrDefault(root.right,0), map2.getOrDefault(root.right,0)));
    }
}