class Solution {
    long long MOD= 1000000007;
public:
    long long Recur(int n, bool isFilled){
        if(n==1){
            return 1;
        }
        
        if(isFilled){
            return Recur(n-1,!isFilled);
        }else{
            return (Recur(n-1,!isFilled)+Recur(n-1,isFilled))%MOD;
        }
    }
    
    
    int countHousePlacements(int n) {
        long long ways_for_one_side=(Recur(n,0)+Recur(n,1))%MOD;
        
        return (ways_for_one_side*ways_for_one_side)%MOD;
    }
};




// USING MEMOISATION 
class Solution {
    long long MOD= 1000000007;
    vector<vector<int>>dp;
public:
    long long solveMemo(int n, bool isFilled){
        if(n==1){
            return 1;// ek hi tareek ah ek baari me ya toh tu ush position ko le legi yaa nhi legi
        }
        
        if(dp[n][isFilled]!=-1){
            return dp[n][isFilled];
        }
        
        if(isFilled){
            return dp[n][1]=solveMemo(n-1,!isFilled);// ye particular cells jo h filled then fill 1,..iske next wale ko mat fill karna
        }else{
            return dp[n][0]=(solveMemo(n-1,!isFilled)+solveMemo(n-1,isFilled))%MOD;
        }
        
    }
    int countHousePlacements(int n) {
        dp.resize(n+1,vector<int>(2,-1));// inside a dp vector ..there is one more vector of size 2 with initial values -1.
        
        long long ways_for_one_side=(solveMemo(n, 0)+solveMemo(n,1))%MOD;
        
        return (ways_for_one_side*ways_for_one_side)%MOD;
    }
};
