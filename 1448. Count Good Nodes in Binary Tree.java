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
    public int goodNodes(TreeNode root) {
        return goodcount(root,root.val);
    }
    public int goodcount(TreeNode cur, int maxv){
        if(cur==null) return 0;
        int cnt = (cur.val >= maxv) ? 1 : 0;
        maxv = Math.max(maxv,cur.val);
        return cnt + goodcount(cur.left,maxv) + goodcount(cur.right,maxv);
    }
}