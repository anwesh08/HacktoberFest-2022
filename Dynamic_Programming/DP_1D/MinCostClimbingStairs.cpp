class Solution {
public:
    
    // using Recurions
//     int solve(int n,vector<int>& cost ){
//         // base case
//         if(n==0){
//             return cost[0];
//         }
//         if(n==1){
//             return cost[1];
//         }
        
//         int ans=cost[n]+min(solve(n-1,cost),solve(n-2,cost));
//         return ans;
//     }
    
    
    // using Memoisation
//     int solve2(int n,vector<int>& cost, vector<int>& dp){
//         //base case
//         // ye toh recursion kaa base case 
//         if(n==0){
//             return cost[0];
//         }
//         if(n==1){
//             return cost[1];
//         }
        
//         // ye h dp kaa base case
//         if(dp[n]!=-1){
//             return dp[n];
//         }
        
//          dp[n]=cost[n]+min(solve2(n-1,cost,dp),solve2(n-2,cost,dp));
//         return dp[n];
//     }
    
    
    // using tabulation
//         int solve3(int n,vector<int>& cost){
//         //base case
       
//         vector<int> dp(n+1);  
        
//         dp[0]= cost[0];
//         dp[1]= cost[1];
        
        
//         for(int i=2; i<n;i++){
//              dp[i]=cost[i]+min(dp[i-1],dp[i-2]);
//         }
        
//          return min(dp[n-1],dp[n-2]);
//     }
    
    
    // using pointers
    int solve4(int n, vector<int>& cost){
        int prev2=cost[0];
        int prev1=cost[1];
        for(int i=2;i<n;i++){
            int curr=cost[i]+min(prev1, prev2);
            prev2=prev1;
            prev1=curr;
            
        }
        return min(prev1, prev2);
    }
    
    int minCostClimbingStairs(vector<int>& cost) {
        // int n= cost.size();
        // int ans=min(solve(n-1,cost),solve(n-2,cost));
        // return ans;
        
        // int n= cost.size();
        // vector<int> dp(n+1,-1);
        // int ans=min(solve2(n-1,cost,dp),solve2(n-2,cost,dp));
        // return ans;
        
        int n= cost.size();
        
        int ans=solve4(n,cost);
        return ans;
        
        
        
    }
};
