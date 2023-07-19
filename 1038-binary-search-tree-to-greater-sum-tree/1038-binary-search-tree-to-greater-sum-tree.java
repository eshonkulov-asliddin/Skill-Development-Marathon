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
 
 
               4 
          1          6
       0     2    5     7
               3           8
 
 */
class Solution {
    
    int sum;
    boolean isValid = true;
    public TreeNode bstToGst(TreeNode root) {
        if (isValid){
            sumOfAllNodes(root);
            this.isValid = false;
        }
        if (root != null){
            bstToGst(root.left);
            int tmp = root.val;
            root.val = sum;
            sum -= tmp;
            bstToGst(root.right);
        }
        return root;
        
    }
    
    public int sumOfAllNodes(TreeNode root){
        if (root != null){
            sumOfAllNodes(root.left);
            this.sum += root.val;
            sumOfAllNodes(root.right);
        }
        return sum;
    }
}