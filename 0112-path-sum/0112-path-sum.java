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
    public boolean ans=false;
    public void findPathSum(TreeNode root,int target,int sum){
        if(ans) return ;
         if(root==null) return ;
        if(sum+root.val==target&&(root.left==null&&root.right==null)) ans=true;
        findPathSum(root.left,target,sum+root.val);
        findPathSum(root.right,target,sum+root.val);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
    findPathSum(root,targetSum,0);
    return ans;   
    }
}