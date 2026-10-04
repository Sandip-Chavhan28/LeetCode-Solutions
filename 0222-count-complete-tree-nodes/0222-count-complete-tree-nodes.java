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
    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = gethightl(root);
        int right = gethightr(root);
        if(left == right){
            return (1<<left) - 1;
        }

        return countNodes(root.left) + countNodes(root.right) + 1;
    }

    public int gethightl(TreeNode root){
        int h = 0;
        while(root != null){
            h++;
           root =  root.left;
        }
        return h;
    }

    public int gethightr(TreeNode root){
        int h = 0;
        while(root != null){
            h++;
           root =  root.right;
        }
        return h;
    }
}