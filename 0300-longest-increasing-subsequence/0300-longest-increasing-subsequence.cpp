class Solution {
public:
    int lengthOfLIS(vector<int>& nums) {
    vector<int> ans;
    ans.push_back(nums[0]);
    for(int i=1;i<nums.size();i++){
        int x=lower_bound(ans.begin(),ans.end(),nums[i])-ans.begin();
        if(x==ans.size()) {
            ans.push_back(nums[i]);
        }
        else{
            ans[x]=nums[i];
        }
    } 
    return ans.size();  
    }
};