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
    string smallestNumber(int sum, int D){
        // code here 
        if(D*9<sum)
        return "-1";
        int ans=-1;
        
        string s="";
        for(long i=D-1;i>=0;i--)
        {
             if(sum>9)
            {
                s="9"+s;
                sum-=9;
            }    
            else
            {
                if(i==0)
                {
                    s=to_string(sum)+s;
                }
                else
                {
                    
                    s=(to_string(sum-1))+s;
                    i--;
                    while(i>0)
                   {
                       s="0"+s;
                       i--;
                   } 
                   s="1"+s;
                   break;
                }
            }
        }
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
