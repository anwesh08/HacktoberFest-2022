class Solution {
public:
    int findClosestNumber(vector<int>& nums) {
                int mini=INT_MAX;
        int number=INT_MIN;
        
        for(int i=0;i<nums.size();i++)
        {
            if(abs(nums[i])<mini)
            {   mini=abs(nums[i]);
                number=nums[i];
            }
            else if(abs(nums[i])==mini)
            {
                if(number<nums[i])
                    number=nums[i];
            }
        }
        return number;
    }
    
};
