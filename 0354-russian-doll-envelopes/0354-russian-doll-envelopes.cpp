class Solution {
public:
    int maxEnvelopes(vector<vector<int>>& nums) {
    sort(nums.begin(),nums.end(),[](vector<int>&a,vector<int>&b){
        if(a[0]==b[0]) return a[1]>b[1];
        return a[0]<b[0];
    });
    vector<int> ans;
    ans.push_back(nums[0][1]);
    for(int i=1;i<nums.size();i++){
        int x=lower_bound(ans.begin(),ans.end(),nums[i][1])-ans.begin();
        if(x==ans.size()) {
            ans.push_back(nums[i][1]);
        }
        else{
            ans[x]=nums[i][1];
        }
    } 
    return ans.size();     
    }
};