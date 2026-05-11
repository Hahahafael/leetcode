class Solution {
public:
    int maxDepth(TreeNode* root) {
        if(root == nullptr) return 0;
        int lcount = maxDepth(root->left);
        int rcount = maxDepth(root->right);
        return max(lcount,rcount) + 1;
    }
};