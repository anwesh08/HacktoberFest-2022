// { Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
class Solution {
  public:
    int findPosition(int N) {
        // code here
        if(N==1)
        return 1;
        int res=log2(N);
        float ans=log2(N);
        if(ans!=res)
        {
            return -1;
        }
        int c=1;
        while(N>0)
        {
            if(N%2==1)
            return c;
            N/=2;
            c++;
        }
        return -1;
    }
};

// { Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int N;

        cin>>N;

        Solution ob;
        cout << ob.findPosition(N) << endl;
    }
    return 0;
}  // } Driver Code Ends
