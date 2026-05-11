class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int lcount = maxDepth(root.left);
        int rcount = maxDepth(root.right);
        return Math.max(lcount,rcount) + 1;
    }
}