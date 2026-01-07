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
    private long totalSum = 0;
    private long maxProduct = 0;
    private final int MOD = 1_000_000_007;

    public int maxProduct(TreeNode root) {
        totalSum = dfs(root);

        dfs(root);

        return (int)(maxProduct % MOD);
    }

    private long dfs(TreeNode node) {
        if (node == null) return 0;

        long left = dfs(node.left);
        long right = dfs(node.right);

        long subTreeSum = node.val + left + right;

        // Calculate product: (totalSum - subTreeSum) * subTreeSum
        long product = (totalSum - subTreeSum) * subTreeSum;
        maxProduct = Math.max(maxProduct, product);

        return subTreeSum;
    }
}
