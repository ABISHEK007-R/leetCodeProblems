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
     ArrayList<Integer> ans =new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
    Stack<TreeNode> s=new Stack<>();
    if(root==null) return ans;
    TreeNode temp=root;
    while(temp!=null ||!s.empty()){
        while(temp!=null){
            s.push(temp);
            temp=temp.left;
        }
        TreeNode a=s.peek();
        s.pop();
        ans.add(a.val);
        temp=a.right;
    }
    return ans;   
    }
}