class Solution {
public:
    int garbageCollection(vector<string>& g, vector<int>& t) {
        int ans=0;
        int n=g.size();
        vector<map<char,int>> v(n);
        for(int i=0;i<g.size();i++)
        {
            for(int j=0;j<g[i].size();j++)
                v[i][g[i][j]]++;
        }
        ans=g[0].size();
        int v1=0,v2=0,v3=0;
        for(int i=1;i<g.size();i++)
        {
            int tt=ans;
            if(v[i].count('M'))
            {
                ans+=v[i]['M'];
                v1=i;
                // ans+=t[i-1];
            }
            if(v[i].count('P'))
            {
                ans+=v[i]['P'];
                v2=i;
                // ans+=t[i-1];
            }
            if(v[i].count('G'))
            {
                ans+=v[i]['G'];
                v3=i;
                // ans+=t[i-1];
            }
        }
        for(int i=0;i<v1;i++)
        {
            ans+=t[i];
        }
        for(int i=0;i<v2;i++)
        {
            ans+=t[i];
        }
        for(int i=0;i<v3;i++)
        {
            ans+=t[i];
        }
        return ans;
    }
};
