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
    List<List<Integer>>finallist = new ArrayList<>();

    public void pS(TreeNode root, int targetSum,List<Integer>list ){
        if(root == null){
            return;
        }
        list.add(root.val);
        if(root.left == null && root.right == null){
            if(root.val == targetSum){
                finallist.add(new ArrayList<>(list));
            }
            list.remove(list.size()-1);
            return;
        }
        
        pS(root.left,targetSum-root.val,list);
        pS(root.right,targetSum-root.val,list);
        list.remove(list.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer>list = new ArrayList<>();
        pS(root,targetSum,list);
        return finallist;
    }
}