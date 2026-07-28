/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer> ans=new ArrayList<>();
    public void pre(Node root){
    if(root==null) return;
    ans.add(root.val);
    for(Node temp:root.children){
        pre(temp);
    }
    }
    public List<Integer> preorder(Node root) {
     pre(root);
     return ans;   
    }
}