class Trie {
public:    
    Trie* chars[26]{};
    bool endsHere = false;
    void insert(string& s) {
        auto cur = this;
        for(auto c : s) 
            cur = cur -> chars[c-'a'] ? cur -> chars[c-'a'] : cur -> chars[c-'a'] = new Trie();
        cur -> endsHere = true;
    }
};

class Encrypter {
    Trie* t = new Trie();                      // Trie of dictionary strings
    unordered_map<char, string> K_V;           // key : value
    unordered_map<string, vector<char>> V_Ks;  // value : [key]
public:
    Encrypter(vector<char>& K, vector<string>& V, vector<string>& D) {
        for(int i = 0; i < size(K); i++) 
            K_V[K[i]] = V[i], 
            V_Ks[V[i]].push_back(K[i]);
        for(auto& d : D) t -> insert(d);
    }
    
    string encrypt(string W) {
        string ans = "";
        for(auto c : W) ans += K_V[c];
        return ans;
    }
    
    int decrypt(string W) {
        return dfs(W, t);
    }
    int dfs(string& W, Trie* T, int i = 0) {
        if(i == size(W)) return T -> endsHere;
        int ans = 0;
        for(string s = W.substr(i, 2); auto c : V_Ks[s]) 
            if(T -> chars[c-'a']) 
                ans += dfs(W, T -> chars[c-'a'], i+2);
        return ans;
    }
};

/**
 * Your Encrypter object will be instantiated and called as such:
 * Encrypter* obj = new Encrypter(keys, values, dictionary);
 * string param_1 = obj->encrypt(word1);
 * int param_2 = obj->decrypt(word2);
 */
