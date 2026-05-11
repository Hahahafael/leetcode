class Solution {
public:
    bool isBalanced(TreeNode* root) {
        return altura(root) != -1;
    }

    int altura(TreeNode* no) {
        if (no == nullptr) return 0;

        int alturaE = altura(no->left);
        if (alturaE == -1) return -1;

        int alturaD = altura(no->right);
        if (alturaD == -1) return -1;

        if (abs(alturaE - alturaD) > 1) {
            return -1;
        }
        
        return max(alturaE, alturaD) + 1;
    }
};