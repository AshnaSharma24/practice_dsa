/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans;

    public int helper(TreeNode root){
        if(root==null) return 0;
        int l = helper(root.left);
        int r = helper(root.right);
        l = l<0 ? 0 : l;                        // take only if +ve
        r = r<0 ? 0 : r;
        ans = Math.max(ans, root.val+l+r);      // max path passing through current node
        return root.val + Math.max(l,r);        // return best single path to parent , exists only to help parent compute their ans
    }

    public int maxPathSum(TreeNode root) {
        ans = Integer.MIN_VALUE;
        helper(root);
        return ans;
    }
}