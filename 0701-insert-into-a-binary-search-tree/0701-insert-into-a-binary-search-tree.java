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
    public void searchInsertPos(TreeNode root,int val,TreeNode parent,int a){
        if(root==null){
          TreeNode temp=new TreeNode(val);
          if(a==1){
           parent.right=temp;
          }
          else{
            parent.left=temp;
          }
          return;
        }
        if(val>root.val){
            searchInsertPos(root.right,val,root,1);
        }
        else{
           searchInsertPos(root.left,val,root,0); 
        }
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
    if(root==null) return new TreeNode(val);
    searchInsertPos(root,val,root,0);
    return root;    
    }
}