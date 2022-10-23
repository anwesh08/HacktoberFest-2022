// { Driver Code Starts
#include<bits/stdc++.h> 
using namespace std; 

 // } Driver Code Ends
class Solution{   
public:

  int find(long n)
  {
      int sum=0;
      while(n!=0)
      {
          sum+=n%10;
          n/=10;
      }
      return sum;
  }
    string smallestNumber(int S, int D){
        // code here 
        
        long n=pow(10,D);
        int ans=-1;
        for(long i=n/10;i<=n;i++)
        {
             if(S==find(i))
            {
                ans=i;
                break;
            }    
        }
        if(ans==-1)
        return "-1";
        
        string s="";
        while(ans!=0)
        {
            s+=to_string(ans%10);
            ans/=10;
        }
        reverse(s.begin(),s.end());
        return s;
        
        
    }
};

// { Driver Code Starts.
int main() 
{ 
    int t;
    cin>>t;
    while(t--)
    {
        int S,D;
        cin >> S >> D;
        Solution ob;
        cout << ob.smallestNumber(S,D) << endl;
    }
    return 0; 
}   // } Driver Code Ends
