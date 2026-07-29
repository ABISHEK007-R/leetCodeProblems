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
    ArrayList<Integer> ans=new ArrayList<Integer>();
        public void check(TreeNode root){
        if(root==null) return ;
        check(root.left);
        ans.add(root.val);
        check(root.right);
    }
    public boolean isValidBST(TreeNode root) {
     check(root);
     for(int i=1;i<ans.size();i++){
      if(ans.get(i)<=ans.get(i-1)) return false;
     }  
     return true;
    }
}