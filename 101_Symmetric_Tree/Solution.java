class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return ajudaNoEspelho(root.left, root.right);
    }

    public boolean ajudaNoEspelho(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null || left.val != right.val) {
            return false;
        }
        return ajudaNoEspelho(left.left, right.right) && ajudaNoEspelho(left.right, right.left);
    }

}