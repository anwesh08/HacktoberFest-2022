// { Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


 // } Driver Code Ends

class Solution
{
    public:
    //Function to return the minimum cost of connecting the ropes.
    typedef long long int ll;
    long long minCost(long long arr[], long long n) {
        // Your code here
        
        if(n==1)
            return 0;
        priority_queue<ll,vector<ll>,greater<ll>> pq(arr,arr+n);
        ll ans=0;
        while(pq.size()>1)
        {
            ll f=pq.top();
            pq.pop();
            ll s=pq.top();
            pq.pop();
            ans=ans+f+s;
            ll res=f+s;
            pq.push(res);
        }
    
        return ans;
        
    }
};


// { Driver Code Starts.
long long minCost(long long arr[], long long n);
int main() {
    long long t;
    cin >> t;
    while (t--) {
        long long n;
        cin >> n;
        long long i, a[n];
        for (i = 0; i < n; i++) {
            cin >> a[i];
        }
        Solution ob;
        cout << ob.minCost(a, n) << endl;
    }
    return 0;
}
  // } Driver Code Ends
