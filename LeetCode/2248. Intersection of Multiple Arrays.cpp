class Solution {
public:
    vector<int> intersection(vector<vector<int>>& nums) {
        unordered_map<int,int> mp;
        int k = 0;
        int n = nums.size();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<nums[i].size();j++)
            {
                mp[nums[i][j]]++;
            }
        }
        vector<int> v;
        for(auto it : mp)
        {
            if(it.second == n)
            {
                v.push_back(it.first);
            }
        }
        sort(v.begin(),v.end());
        return v;
    }
};
