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
    ArrayList<String> ans=new ArrayList<>();
    public void findAllPath(TreeNode root,String sb){
        if(root==null) return ;
        if(root.left==null&&root.right==null) 
        {
            sb=sb+root.val;
            ans.add(sb);
        }
        findAllPath(root.left,sb+root.val+"->");
        findAllPath(root.right,sb+root.val+"->");
    }
    public List<String> binaryTreePaths(TreeNode root) {
    findAllPath(root,"");
    return ans;
    }
}