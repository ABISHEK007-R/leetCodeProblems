/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode ans;
    boolean t=false;
    public void left(TreeNode root,int p,int q){
        if(t){
            return;
        }
        if(root==null) return;
        if((p<root.val&&q>root.val)||p>root.val&&q<root.val){
        ans=root;
        t=true;
     } 
        if(root.val==p||root.val==q){
           ans=root;
           t=true;
        }
        left(root.left,p,q);
        left(root.right,p,q);
    }
     public void right(TreeNode root,int p,int q){
        if(t){
            return;
        }
        if(root ==null) return ;
        if((p<root.val&&q>root.val)||p>root.val&&q<root.val){
        ans=root;
        t=true;
     } 
        if(root.val==p||root.val==q){
            ans=root;
            t=true;
        }
        right(root.left,p,q);
        right(root.right,p,q);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
     if((p.val<root.val&&q.val>root.val)||p.val>root.val&&q.val<root.val){
        return root;
     } 
     if(p.val<root.val&&q.val<root.val){
        left(root,p.val,q.val);
     }  
    else
      right(root,p.val,q.val);
      return ans;
    }
}