class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        //Using stack;
        if (t1 == null)
            return t2;
        Stack<TreeNode[]> stack = new Stack();
        stack.push(new TreeNode[]{t1, t2});
        while(!stack.isEmpty())
        {
            TreeNode[] candi = stack.pop();
            if (candi[0] == null || candi[1] == null)
                continue;//stackoverflow 
            candi[0].val += candi[1].val;
            if (candi[0].left == null){
                 candi[0].left = candi[1].left;
            }else{
                stack.push(new TreeNode[]{candi[0].left, candi[1].left});
            }
            if (candi[0].right == null){
                 candi[0].right = candi[1].right;
            }else{
                stack.push(new TreeNode[]{candi[0].right, candi[1].right});
            }
        }
        return t1;
    }
}