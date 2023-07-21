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
        Stack stack = new Stack();
        stack.add(cloned);
        
        while (stack.size() > 0){
            TreeNode node = (TreeNode) stack.pop();
            System.out.println(node.val);
            if (node.val == target.val){
                return node;
            }
            if (node.left != null){
                stack.add(node.left);
            }
            if (node.right != null){
                stack.add(node.right);
            }
        }
        return null;
    }
}