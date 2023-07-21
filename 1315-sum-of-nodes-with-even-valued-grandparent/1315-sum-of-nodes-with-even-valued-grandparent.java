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
    public int sumEvenGrandparent(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.offer(root);
        int total = 0;
        while (queue.size() > 0){
            int size = queue.size();
            for (int i = 0; i < size; i++){
                TreeNode grandParent = queue.remove();
                if (grandParent.val % 2 == 0){
                    int curTotal = getTheChildSum(grandParent);
                    total += curTotal;
                }
                if (grandParent.left != null){
                    queue.add(grandParent.left);
                }
                if (grandParent.right != null){
                    queue.add(grandParent.right);
                }
            }
        }
        return total;
        
    }
    
    public int getTheChildSum(TreeNode grandParent){
        int count = 0;
        int curTotal = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(grandParent);
        
        while (queue.size() > 0 && count < 2){
            // System.out.println(queue);
            int size = queue.size();
            for (int i = 0; i < size; i++){
                TreeNode child = queue.remove();
                if (child.left != null){
                    queue.add(child.left);
                }
                if (child.right != null){
                    queue.add(child.right);
                }
            }
            count++;
            
        }
        
        

        while (queue.size() > 0){
            TreeNode node = queue.remove();
            curTotal += node.val;
        }
        System.out.println(curTotal);

        return curTotal;
        
    }
}