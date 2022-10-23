// { Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
class Solution
{
public:
    vector<int> singleNumber(vector<int> nums) 
    {
        // Code here.
        int x1=0,a,b;
        vector<int> v;
        for(int i=0;i<nums.size();i++)
             x1=nums[i]^x1;
        
        
        int rmsb=x1 & -x1;//right most set bit
        int x=0,y=0;
        for(int i=0;i<nums.size();i++)
        {
            if((rmsb&nums[i])==0)
            {
                x=x^nums[i];
            }
            else
            {
                
                y=y^nums[i];
            }
        }
        if(y<x)
        return {y,x};
        else
        return {x,y};
        
        
        
        
        
        
        
        
        
        
        
        
    }
};

// { Driver Code Starts.
int main(){
    int T;
    cin >> T;
    while(T--)
    {
    	int n; 
    	cin >> n;
    	vector<int> v(2 * n + 2);
    	for(int i = 0; i < 2 * n + 2; i++)
    		cin >> v[i];
    	Solution ob;
    	vector<int > ans = ob.singleNumber(v);
    	for(auto i: ans)
    		cout << i << " ";
    	cout << "\n";
    }
	return 0;
}  // } Driver Code Ends
