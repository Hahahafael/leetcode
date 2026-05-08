class Solution {
public:
    bool isSymmetric(TreeNode* root) {
        if (!root) return true;
        return ajudaNoEspelho(root->left, root->right);
    }

public:
    bool ajudaNoEspelho(TreeNode* esq, TreeNode* dir) {
        if (!esq && !dir) return true;
        if (!esq || !dir || esq->val != dir->val) return false;
        return ajudaNoEspelho(esq->left, dir->right) && 
               ajudaNoEspelho(esq->right, dir->left);
    }
};