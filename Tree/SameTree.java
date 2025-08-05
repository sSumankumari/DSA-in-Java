package Tree;

public class SameTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, Tree.TreeNode left, Tree.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static boolean check(TreeNode root1, TreeNode root2){
        if (root1 == null && root2 == null) return true;
        if ((root1 != null && root2 == null) || root1 == null && root2 != null) return false;

        if (root1.val != root2.val) return false;

        boolean check1 = check(root1.left, root2.left);
        boolean check2 = check(root1.right, root2.right);

        return check1 && check2;
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        return check(p, q);
    }
    public static void main(String[] args) {

    }
}
