int solve(vector<int> &num, int n){
    if(n<0){
        return 0;
    }
    if(n==0){
        return num[0];
    }
    
    int incl= solve(num,n-2)+num[n];
    int excl= solve(num,n-1)+0;
    
    return max(incl,excl);
}
int solveMem(vector<int> &num, int n, vector<int> &dp){
    
    if(n<0){
        return 0;
    }
    if(n==0){
        return num[0];
    }
    
    if(dp[n]!=-1){
        return dp[n];
    }
    int incl= solveMem(num,n-2,dp)+num[n];
    int excl= solveMem(num,n-1,dp)+0;
    
    dp[n]=max(incl,excl);
    return dp[n];
}

int solveTab(vector<int> &nums){
    int n=nums.size();
    vector<int> dp(n,0);
    dp[0]=nums[0];
    
    for(int i=1; i<n;i++){
        int incl= dp[i-2]+nums[i];
        int excl= dp[i-1]+0;
        dp[i]=max(incl,excl);
    }
    
    
    
     return dp[n-1];// dp kaa size n h ..toh ending index n-1 hoga 
}


int solveOpt(vector<int> &nums){
    int n=nums.size();
    int prev2=0;
    int prev1=nums[0];
    
    for(int i=1; i<n;i++){
        int incl= prev2+nums[i];
        int excl= prev1+0;
        int ans=max(incl,excl);
        prev2=prev1;
        prev1=ans;
    }
    
    
    
     return prev1;
}




int maximumNonAdjacentSum(vector<int> &nums){
     int n=nums.size();
//      return solve(nums, n-1);
    
//     vector<int> dp(n+1,-1);
//     return solveMem(nums,n-1,dp);
    return solveTab(nums);
   
}
