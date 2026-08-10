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
    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> temp=new ArrayList<>();
    public void findAllPath(TreeNode root,int sum,List<Integer> temp,int targetSum){
           if(root==null) return;
           if(root.val+sum==targetSum&&root.left==null&&root.right==null){
            temp.add(root.val);  
           ans.add(new ArrayList<>(temp));temp.remove(temp.size()-1);
           return;
        }  
        temp.add(root.val);
        findAllPath(root.left,sum+root.val,temp,targetSum);
        findAllPath(root.right,sum+root.val,temp,targetSum);
        temp.remove(temp.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
     
     findAllPath(root,0,temp,targetSum); 
     return ans;  
    }
}