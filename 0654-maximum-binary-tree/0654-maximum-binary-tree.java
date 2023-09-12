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
    public TreeNode constructMaximumBinaryTree(int[] nums) {

        return  recurse(nums, new TreeNode());

    }

    public TreeNode recurse(int[] nums, TreeNode root) {

        if (nums.length == 0) {
            return null;
        }

        // find max num and id
        int maxId = -1;
        int maxNum = -1;

        for (int i = 0; i < nums.length; i++) {
            int curNum = nums[i];
            if (curNum > maxNum) {
                maxNum = curNum;
                maxId = i;
            }
        }



        int[] leftHalf = Arrays.copyOfRange(nums, 0, maxId);
        int[] rightHalf = Arrays.copyOfRange(nums, maxId + 1, nums.length);

        root.val = maxNum;

        root.left = recurse(leftHalf, new TreeNode());
        root.right = recurse(rightHalf, new TreeNode());

        return root;


    }
}