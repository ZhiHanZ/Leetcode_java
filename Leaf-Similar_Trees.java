/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leave1 = new ArrayList();
        List<Integer> leave2 = new ArrayList();
        dfs(root1, leave1);
        dfs(root2, leave2);
        return leave1.equals(leave2);
    }
    public void dfs(TreeNode root, List<Integer> leave)
    {
        if (root != null)
        {        
            if (root.left == null && root.right == null)
                leave.add(root.val);
            dfs(root.left, leave);
            dfs(root.right, leave);            
        }
    }
}