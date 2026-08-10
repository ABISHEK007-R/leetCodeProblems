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
    int ans=0;
    public void findSum(TreeNode root,int sum){
    if(root==null) return ;
    if(root.left==null&&root.right==null){
    sum=sum*10+root.val;
    ans+=sum;
    }
     findSum(root.left,sum*10+root.val);
     findSum(root.right,sum*10+root.val);
    }
    public int sumNumbers(TreeNode root) {
    if(root==null) return 0;
    findSum(root,0); 
    return ans;  
    }
}