// { Driver Code Starts
// Program to find the maximum profit job sequence from a given array 
// of jobs with deadlines and profits 
#include<bits/stdc++.h>
using namespace std; 

// A structure to represent a job 
struct Job 
{ 
    int id;	 // Job Id 
    int dead; // Deadline of job 
    int profit; // Profit if job is over before or on deadline 
}; 


 // } Driver Code Ends

/*
struct Job 
{ 
    int id;	 // Job Id 
    int dead; // Deadline of job 
    int profit; // Profit if job is over before or on deadline 
};
*/

class Solution 
{
    public:
    //Function to find the maximum profit and the number of jobs done.
    
    static bool comp(const pair<int,int> &a,const pair<int,int> &b)
    {
            return a.second>b.second;//sort on the basis of profit
        //return a.first<b.first;
    }
    vector<int> JobScheduling(Job arr[], int n) 
    { 
        // your code here
        
        vector<pair<int,int>> vp;
        for(int i=0;i<n;i++)
        {
            vp.push_back({arr[i].dead,arr[i].profit});
        }
        
        
        sort(vp.begin(),vp.end(),comp);
        //sort on the basis of profit
        int i,ans=0,c=0;
        vector<bool> vis(n,false);
        for(i=0;i<vp.size();i++)
        {
            
            for(int j=min(n-1,vp[i].first-1);j>=0;j--)
            {
                if(!vis[j])
                {
                    c++;
                    ans+=vp[i].second;
                    vis[j]=true;
                    break;
                    
                }
            }
        }
        
        return {c,ans};
    } 
};

// { Driver Code Starts.
// Driver program to test methods 
int main() 
{ 
    int t;
    //testcases
    cin >> t;
    
    while(t--){
        int n;
        
        //size of array
        cin >> n;
        Job arr[n];
        
        //adding id, deadline, profit
        for(int i = 0;i<n;i++){
                int x, y, z;
                cin >> x >> y >> z;
                arr[i].id = x;
                arr[i].dead = y;
                arr[i].profit = z;
        }
        Solution ob;
        //function call
        vector<int> ans = ob.JobScheduling(arr, n);
        cout<<ans[0]<<" "<<ans[1]<<endl;
    }
	return 0; 
}


  // } Driver Code Ends
