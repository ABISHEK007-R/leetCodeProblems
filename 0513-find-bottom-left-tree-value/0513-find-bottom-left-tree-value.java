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
    public int findBottomLeftValue(TreeNode root) {
    if(root.left==null&&root.right==null) return root.val;
    Queue<TreeNode> ans=new LinkedList<>();
    int res=0;
    ans.offer(root);
    while(!ans.isEmpty()){
    TreeNode temp=ans.poll();
    res=temp.val;
    if(temp.right!=null)
    ans.offer(temp.right);
    if(temp.left!=null)
    ans.offer(temp.left);
    }   
    return res;
    }
}