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
    public int searchDepth(TreeNode root,int count){
        if(root==null) return 0;
        int left=searchDepth(root.left,count);
        int right=searchDepth(root.right,count);
        if(right==0) right=left;
        if(left==0) left=right;
        return Math.min(left,right)+1;
    }
    public int minDepth(TreeNode root) {
    return  searchDepth(root,0);   
    }
}