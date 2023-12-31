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
class Solution {
    List<Integer> result = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        return this.dfs(root);    
    }
    
    public List<Integer> dfs(TreeNode root){
        if (root == null){
            return result;
        }
        
        dfs(root.left);
        this.result.add(root.val);
        dfs(root.right);
        
        return result;   
    }
}