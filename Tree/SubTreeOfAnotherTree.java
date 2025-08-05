package Tree;

import com.sun.source.tree.Tree;

public class SubTreeOfAnotherTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static boolean check(TreeNode root, TreeNode subRoot){
        if (root==null && subRoot==null) return true;

        if (root==null || subRoot==null) return false;

        if (root.val != subRoot.val) return false;

        boolean l = check(root.left, subRoot.left);
        boolean r = check(root.right, subRoot.right);

        return l && r;
    }
    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null || subRoot == null) return false;

        if (root.val == subRoot.val && check(root, subRoot)) return true;

        return isSubtree(root.left, subRoot);
    }
    public static void main(String[] args) {

    }
}
