class Solution {
public:
    // Attempt #2
    int maxi = 0;
    int height(TreeNode* node){
        if(!node)return 0;
        int lh = height(node->left);
        int rh = height(node->right);
        maxi = max(lh+rh,maxi);
        return 1 + max(lh,rh);
    }
    int diameterOfBinaryTree(TreeNode* root){
        height(root);
        return maxi;
    }
    
    
    
    
    
    // Attempt #1
    
    // unordered_map<TreeNode*,int>height;
    // int cal_height(TreeNode* node){
    //     if(!node)return -1;
    //     return height[node] = max(cal_height(node->left)+1,cal_height(node->right)+1);
    // }
    // void dfs(TreeNode* node,int &maxi){
    //     if(!node)return;
    //     maxi = max(maxi,height[node->left] + height[node->right]);
    //     dfs(node->left,maxi);
    //     dfs(node->right,maxi);
    // }
    // int diameterOfBinaryTree(TreeNode* root) {
    //     cal_height(root);
    //     int maxi = INT_MIN;
    //     dfs(root,maxi);
    //     return maxi;
    // }
};
