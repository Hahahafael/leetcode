class Solution {
    public boolean isBalanced(TreeNode root) {
        return altura(root) != -1;
    }

    private int altura(TreeNode no) {
        if (no == null) return 0;

        int alturaEsquerda = altura(no.left);
        if (alturaEsquerda == -1) return -1; 

        int alturaDireita = altura(no.right);
        if (alturaDireita == -1) return -1; 

        if (Math.abs(alturaEsquerda - alturaDireita) > 1) return -1;

        return Math.max(alturaEsquerda, alturaDireita) + 1;
    }
}