// { Driver Code Starts
// Initial template for C++
#include <bits/stdc++.h>
using namespace std;


 // } Driver Code Ends
// User function template for c++
class Solution {
  public:
    int findMaxLen(string s) {
        // method 1
        // Expected Time Complexity:O(n)
        // Expected Auxiliary Space: O(n)   

        // stack<int> st;
        // int mx=0;
        // st.push(-1);
        // for(int i=0;i<s.length();i++)
        // {
        //     if(s[i]=='(')
        //     {
        //         st.push(i);
        //     }
        //     else
        //     {
        //         st.pop();
        //         if(st.empty())
        //             st.push(i);
        //         else
        //         {
        //             int len=i-st.top();
        //             mx=max(mx,len);
        //         }
        //     }
        // }
        // return mx;


        // method 2
        // Expected Time Complexity:O(n)
        // Expected Auxiliary Space: O(1)   
        int open=0,close=0;
        int mx=0;
        
        for(int i=0;i<s.length();i++)
        {
            if(s[i]=='(')
            {
                open++;
            }
            else
            {
                close++;
            }
            if(open==close)
            {
                int len=open+close;
                mx=max(len,mx);
            }
            if(open<close)
            {
                open=0,close=0;
            }
        }
        open=0,close=0;
        
        
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s[i]=='(')
            {
                open++;
            }
            else
            {
                close++;
            }
            if(open==close)
            {
                int len=open+close;
                mx=max(len,mx);
            }
            if(open>close)
            {
                open=0,close=0;
            }
        }
        return mx;
    }
};

// { Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        string S;
        cin >> S; 
        Solution ob;
        cout << ob.findMaxLen(S) << endl;
    }
    return 0;
}
  // } Driver Code Ends
