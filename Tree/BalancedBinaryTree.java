package Tree;

import com.sun.source.tree.Tree;

public class BalancedBinaryTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static class bal{
        int height = 0;
        boolean isBal = true;
    }
    public static bal check(TreeNode root){
        if (root == null) return new bal();

        bal l = check(root.left);
        bal r = check(root.right);

        boolean sp = Math.abs(l.height - r.height)<=1;

        bal b = new bal();
        b.height = Math.max(l.height, r.height) + 1;

        b.isBal = sp && l.isBal && r.isBal;

        return b;
    }
    public boolean isBalanced(TreeNode root) {
        return check(root).isBal;
    }
}
