class Solution {
public:
    bool checkDistances(string s, vector<int>& distance) 
    {
        unordered_set<char>done;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(done.find(s[i])==done.end() && s[i]==s[j]){
                    if(distance[s[i]-'a']!=j-i-1)return false;
                    done.insert(s[i]);
                }
            }
        }
        return true;   
    }   
};
