package Tree;

public class SymmetricTree {
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
    public static boolean check(TreeNode root1, TreeNode root2){
        if (root1 == null && root2 == null) return true;
        if ((root1 != null && root2 == null) || root1 == null && root2 != null) return false;

        if (root1.val != root2.val) return false;

        boolean check1 = check(root1.left, root2.right);
        boolean check2 = check(root1.right, root2.left);

        return check1 && check2;
    }
    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }
    public static void main(String[] args) {

    }
}
