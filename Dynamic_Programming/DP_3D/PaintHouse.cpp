class Solution {
public:
    
    int dp[101][21][101];
    // i-> it will iterate through all over houses
    // l->color of the last house 
    // t- >total no of neighbours
    int help(int i, int l, int t, vector<int>& houses, vector<vector<int>>& cost, int m, int n,   int target  ){
        
        //  BASE CASE 
        
        // 1. IN case total no of neighbours exceeds the limits .. that means way tareeke se aayege ho that is not giving any answer 
        if(t>target){
            return INT_MAX/2;
        }
        
        //2. If we reach the last house 
        if(i==m){
            
            
            // TWO CASES ARE THERE
            // EITHER WE HAVE REACHED OUR TARGET
            
            
            if(t==target){
                return 0;
            }else{
                return INT_MAX/2;
            }
        }
        
        
        if(dp[i][l][t]!=-1)return dp[i][l][t];
        else{
            
            
            // OTHER CASES
            // AGAR ABHI TAK LAST HOUSE TAK NHI POHOCHE HAI 
            
            // TWO CASES
            //1. CHECK HOUSE IS PAINTED OR NOT 
            // IF IT IS NOT PAINTED 
            
            
            int ans=INT_MAX/2;
            
            if(houses[i]==0){
                // we can paint in many colors (we have so many options )
                
                for(int j=0 ;j<n;j++){
                    
                    ans= min(ans, cost[i][j]+ help(i+1, j+1, (l==j+1)?t:t+1, houses, cost, m, n,target));// j+1 -> 1 based indexing h
                }
            }
            
            else{
                    ans=min(ans, help(i+1, houses[i], (houses[i]==l)?t:t+1, houses, cost, m, n ,target ));
            }
            
            return dp[i][l][t]= ans;
        }
        
    }
    int minCost(vector<int>& houses, vector<vector<int>>& cost, int m, int n,   int target) {
        memset(dp, -1, sizeof dp);
        int ans=help(0,0,0,houses, cost, m, n,target);
        if(ans==INT_MAX/2)
            return -1;
        else
            return ans;
    }
};
