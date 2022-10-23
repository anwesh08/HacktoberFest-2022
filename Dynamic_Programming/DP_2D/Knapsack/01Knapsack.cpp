int solve(vector<int>& weight, vector<int> &value, int index, int W) {
    // base case 
    // if only one elment to steal , then just compare it weigth with kanpscak capacity 
    if(index==0){
        if(weight[0]<=W){
            return value[0];//  agar capcity hai toh include kar lo 
        }else{
            return 0;
        }
    }
    
    
    // INCLUDE 
    // can be included only when is capcity is less than knapsack 
    int incl=0;
    if(weight[index]<=W){
        incl=value[index]+ solve(weight, value, index-1, W-weight[index]);
    }
    
    // EXCLUDE 
    int excl= solve(weight, value,index-1, W);
    
    int ans=max(incl, excl);
    return ans;
    
    
}

// int solveMem(vector<int>& weight, vector<int> &value, int index, int W, vector<vector<int>>&dp){
//     // base case 
//     // if only one elment to steal , then just compare it weigth with kanpscak capacity 
//     if(index==0){
//         if(weight[0]<=W){
//             return value[0];//  agar capcity hai toh include kar lo 
//         }else{
//             return 0;
//         }
//     }
    
    
//     if(dp[index][W]!=-1){
//         return dp[index][W];
//     }
    
    
//     // INCLUDE 
//     // can be included only when is capcity is less than knapsack 
//     int incl=0;
//     if(weight[index]<=W){
//         incl=value[index]+ solveMem(weight, value, index-1, W-weight[index],dp);
//     }
    
//     // EXCLUDE 
//     int excl= solveMem(weight, value,index-1, W,dp);
    
//     dp[index][W]=max(incl, excl);
//     return dp[index][W];
    
// }

int solveTab(vector<int>& weight, vector<int> &value, int n, int W){
    // Step1
    vector<vector<int>> dp(n+1, vector<int>(W+1,0));
    
    // Analyse the base case
    // ROW 0 K SARE COLOUMS LIYE HO RHA HAI 
    for(int w=weight[0];w<=W;w++){
         if(weight[0]<=W){
            dp[0][w]=value[0];
         }else{
             dp[0][w]=0;
         }
    }
    
    for(int index=1; index<=n; index++){
        for(int w=0; w<=W;w++){
            int incl=0;
            if(weight[index]<=w){
                incl= value[index]+ dp [index-1][w-weight[index]];
            }

            // EXCLUDE 
            int excl= dp[index-1][w];
            dp[index][w]=max(incl,excl);

        }
    }
    
    return dp[n][W];// n agar humari rows ...toh n-1 wali row humara answer degi 
    
    
}



int knapsack(vector<int> weight, vector<int> value, int n, int maxWeight) 
{   // MEMOISATION
    
    // STEP1 : CREATE DP ARRAY
//     vector<vector<int>> dp(n+1, vector<int>(maxWeight+1,-1));
// 	return solveMem(weight, value, n-1, maxWeight,dp);
    
    return solveTab(weight, value, n-1, maxWeight);
}
