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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
     List<List<Integer>> ans=new ArrayList<>();
             if(root==null) return ans;
     Queue<TreeNode> q=new LinkedList<>();
     q.offer(root);
     while(!q.isEmpty()){
        List<Integer> temp=new ArrayList<>();
        int n=q.size();
        for(int i=0;i<n;i++){
        TreeNode h=q.poll();
        temp.add(h.val);
        if(h.left!=null)
        q.offer(h.left);
        if(h.right!=null)
        q.offer(h.right);
        }
        ans.add(temp);
     } 
      Collections.reverse(ans); 
      return ans;
    }
}