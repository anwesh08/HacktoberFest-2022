class Solution {
public:
    vector<int> restoreArray(vector<vector<int>>& adjacentPairs) {
        vector<int>temp;
        unordered_set<int>done;
        unordered_map<int,int>counts;
        unordered_map<int,vector<int>>pairs;
        for(int i=0;i<adjacentPairs.size();i++){
            counts[adjacentPairs[i][0]]++;
            counts[adjacentPairs[i][1]]++;
            pairs[adjacentPairs[i][0]].push_back(adjacentPairs[i][1]);
            pairs[adjacentPairs[i][1]].push_back(adjacentPairs[i][0]);
        }
        for(auto it=counts.begin();it!=counts.end();it++){
            if(it->second==1){
                temp.push_back(it->first);
                done.insert(it->first);
                int parent = it->first;
                while(parent!=INT_MIN){
                    if(done.find(pairs[parent][0])==done.end()){
                        temp.push_back(pairs[parent][0]);
                        done.insert(pairs[parent][0]);
                        parent=pairs[parent][0];
                    }
                    else if(pairs[parent].size()>=2 && done.find(pairs[parent][1])==done.end()){
                        temp.push_back(pairs[parent][1]);
                        done.insert(pairs[parent][1]);
                        parent=pairs[parent][1];
                    }
                    else{
                        parent = INT_MIN;
                    }        
                }
                return temp;
            }
        }
        return temp;
    }
};
