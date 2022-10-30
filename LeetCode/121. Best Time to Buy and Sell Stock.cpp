class Solution {
public:
    int maxProfit(vector<int>& arr) 
    {
        int profit=0,maxprofit=0,n=arr.size(),minsofar=arr[0];
        for (int i = 0; i <n; i++) 
        {
            minsofar = min(minsofar,arr[i]);
            maxprofit = arr[i] - minsofar;
            profit = max(profit,maxprofit);  
        }
    return profit;
    }
};
