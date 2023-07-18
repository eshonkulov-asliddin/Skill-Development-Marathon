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
 
 [      5,
       4,6,
       
 null,null,3,7]
 
 last, stack = None, []
        curr = root

        while curr or stack:
            while curr:
                stack.append(curr)
                curr = curr.left
            
            curr = stack.pop()

            if last is not None and last >= curr.val:
                return False

            last = curr.val
            curr = curr.right

        return True
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return dfs(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }
    
    public boolean dfs(TreeNode root, long max, long min){
        if (root == null) return true;
        if (root.val >= max || root.val <= min) return false;
        return this.dfs(root.left, root.val, min) && this.dfs(root.right, max, root.val);
        
    }
    

}