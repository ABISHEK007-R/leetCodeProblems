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
    unordered_map<int,int>has;
    int t=0;
    TreeNode* fun(vector<int>&n,int l,int h){
        if(l>h) return NULL;
        int a=has[n[t]];
        TreeNode*x=new TreeNode(n[t]);
        t++;
        x->left=fun(n,l,a-1);
        x->right=fun(n,a+1,h);
        return x;
    }
    TreeNode* buildTree(vector<int>&n, vector<int>&in) {
        for(int i=0;i<n.size();i++)
         has[in[i]]=i;
        return fun(n,0,n.size()-1);
    }
};