#define MOD 1000000007
int add(int a, int b){
    return ((a%MOD)+ (b%MOD))%MOD;
}

int mult(int a, int b){
    return ((a%MOD)*1LL*(b%MOD))%MOD;
}


int solve(int n, int k){
    if(n==1)
        return k;
    if(n==2)
        return add(k,mult(k,k-1));
    
    int ans=add(mult(solve(n-2,k),k-1), mult(solve(n-1,k),k-1));
    return ans;
}

int solveMem(int n, int k ,vector<int> &dp){
    if(n==1)
        return k;
    if(n==2)
        return add(k,mult(k,k-1));
    
    if(dp[n]!=-1){
        return dp[n];
    }
    
    dp[n]=add(mult(solveMem(n-2,k,dp),k-1), mult(solveMem(n-1,k,dp),k-1));
    return dp[n];
}


int solveTab(int n ,int k){
    vector<int> dp(n+1);
    dp[1]=k;
    dp[2]=add(k,mult(k,k-1));
    
    for(int i=3; i<=n;i++){
        dp[i]=add(mult(dp[i-2],k-1), mult(dp[i-1],k-1));
    }
    return dp[n];
}


int solveOpt(int n ,int k){
    vector<int> dp(n+1);
    int prev2=k;
    int prev1=add(k,mult(k,k-1));
    
    for(int i=3; i<=n;i++){
        int curr=add(mult(prev2,k-1), mult(prev1,k-1));
        prev2=prev1;
        prev1=curr;
    }
    return prev1;
}
int numberOfWays(int n, int k) {
    //vector<int> dp(n+1,-1);
    return solveOpt(n,k);
}
