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
    int sum = 0;
    public void sumN(TreeNode root,long rsum){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            rsum = rsum *10 +  root.val;
            sum += (int)rsum ;
            return;
        }
        sumN(root.left,rsum*10+root.val);
        sumN(root.right,rsum*10+root.val);
    }
    public int sumNumbers(TreeNode root) {
        sumN(root,0);
        return sum;
    }
}