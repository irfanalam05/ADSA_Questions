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
    static class Tuple {
        int row, col, val;
        Tuple(int r, int c, int v) {
            row = r; col = c; val = v;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<Tuple> nodes = new ArrayList<>();
        dfs(root, 0, 0, nodes);

        Collections.sort(nodes, (a, b) -> {
            if (a.col != b.col) return a.col - b.col;
            if (a.row != b.row) return a.row - b.row;
            return a.val - b.val;
        });

        List<List<Integer>> result = new ArrayList<>();
        int prevCol = Integer.MIN_VALUE;
        for (Tuple t : nodes) {
            if (t.col != prevCol) {
                result.add(new ArrayList<>());
                prevCol = t.col;
            }
            result.get(result.size() - 1).add(t.val);
        }
        return result;
    }

    private void dfs(TreeNode node, int row, int col, List<Tuple> nodes) {
        if (node == null) return;
        nodes.add(new Tuple(row, col, node.val));
        dfs(node.left, row + 1, col - 1, nodes);
        dfs(node.right, row + 1, col + 1, nodes);
    }
}