#include<bits/stdc++.h>
using namespace std;
int fib(int n, vector<int> &dp){
    // base case
    if(n==0 || n==1){
        return n;
    }
    if(dp[n]!=-1){
        return dp[n];
    }
    // store the obtained value inside the dp array
    dp[n]=fib(n-1,dp)+ fib(n-2,dp);
    return dp[n];
}
int main()
{      int n;
       cin>>n;
       vector<int> dp(n+1);
       for(int i=0 ;i<=n;i++){
            dp[i]=-1;
        }
        cout<<fib(n,dp)<<endl;
        return 0;
}