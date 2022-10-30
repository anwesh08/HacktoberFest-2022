class Solution {
public:
    int maximumScore(vector<int>& scores, vector<vector<int>>& edges) {
        const int n = scores.size();
        vector<vector<int>> adj(n);
        for (const vector<int>& edge : edges) {
            adj[edge[0]].push_back(edge[1]);
            adj[edge[1]].push_back(edge[0]);
        }
        for (vector<int>& a : adj) {
            // priority queue for top scored 3 vertices:
            priority_queue<pair<int, int>, vector<pair<int, int>>, greater<>> pq;
            for (int v : a) {
                int score = scores[v];
                if (pq.size() < 3 || pq.top().first < score) {
                    pq.push({score, v});
                    if (pq.size() > 3) {
                        pq.pop();
                    }
                }
            }
            a.resize(pq.size());
            for (int i = a.size() - 1; i >= 0; --i) {
                a[i] = pq.top().second;
                pq.pop();
            }
        }
        
        int result = -1;
        for (const vector<int>& edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int base = scores[u] + scores[v];
            for (int x : adj[u]) {
                if (x == v) continue; // intersection - not allowed, continue
                
                for (int y : adj[v]) {
                    if (y == u || x == y) continue; // intersection - not allowed, continue
                    
                    result = max(result, base + scores[x] + scores[y]);
                }
            }
        }
        
        return result;
    }
};
