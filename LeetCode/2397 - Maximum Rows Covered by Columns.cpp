class Solution {
public:
    set<vector<int>> st;
    vector<int> v;
    int help(vector<vector<int>> mat, vector<int> col) {
        for(int i=0;i<col.size();i++)
        {
            for(int j=0;j<mat.size();j++)
            {
                mat[j][col[i]]=0;
            }
        }
        int a=0;
        for(int i=0;i<mat.size();i++)
        {
            int t=0;
            for(int j=0;j<mat[0].size();j++)
            {
                if(mat[i][j]==0)
                    t++;
            }
            if(t==mat[i].size())
                a++;
        }
        return a;
    }
    void helper(int in, vector<vector<int>>& mat, int cols) {
        if(cols==0)
        {
            st.insert(v);
            return;
        }
        if(in==mat[0].size())
            return;
        
        v.push_back(in);
        helper(in+1,mat,cols-1);
        v.pop_back();
        helper(in+1,mat,cols);
    }
    int maximumRows(vector<vector<int>>& mat, int cols) {
        helper(0,mat,cols);
        int ans=0;
        for(auto x:st)
        {
            ans=max(ans,help(mat,x));
        }
        return ans;
    }
};
