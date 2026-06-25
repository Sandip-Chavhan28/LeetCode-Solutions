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
    public void path(TreeNode root,List<String>list,StringBuilder str){
        if (root == null) {
            return;
        }
        int len = str.length();
        str.append(root.val);
        if (root.left == null && root.right == null) {
            list.add(str.toString());
        } else {
            str.append("->");
            path(root.left, list, str);
            path(root.right, list, str);
        }
        str.setLength(len);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>list = new ArrayList<>();
        StringBuilder sd = new StringBuilder("");
        path(root,list,sd);
        return list;
    }

}