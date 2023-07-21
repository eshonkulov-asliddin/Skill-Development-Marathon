/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return dfs(cloned, target);
    }
    
    public TreeNode dfs(TreeNode cloned, TreeNode target){
        if (cloned == null || cloned.val == target.val) return cloned;
        TreeNode left = dfs(cloned.left, target);
        TreeNode right = dfs(cloned.right, target);
        return left != null ? left:right;
    }
}
