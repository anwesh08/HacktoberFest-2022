class Solution {
public:
    char repeatedCharacter(string s) 
    {
        unordered_map<char,int> mpp;
        
        for(int i=0;i<s.size();i++)
        {
            mpp[s[i]]++;
            
            for(auto i: mpp)
                if(i.second==2)
                    return i.first;
        }
        return ' ';
    }
};
