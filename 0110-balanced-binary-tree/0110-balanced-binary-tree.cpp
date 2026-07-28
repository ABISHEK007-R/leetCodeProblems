/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    bool t=true;
    int rec(TreeNode* ptr){
        if(!t) return 0;
        if(ptr==NULL) return 0;
        int x=rec(ptr->left);
        int y=rec(ptr->right);
        if(abs(x-y)>1) t=false;
        return max(x,y)+1;
    }
    bool isBalanced(TreeNode* root) {
        rec(root);
        return t;
    }
};