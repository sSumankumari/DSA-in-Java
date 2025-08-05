package Tree;

public class PathSum {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, BalancedBinaryTree.TreeNode left, BalancedBinaryTree.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        if (root.val == targetSum && root.left==null && root.right==null) return true;

        boolean check1 = hasPathSum(root.left, targetSum - root.val);
        boolean check2 = hasPathSum(root.right, targetSum - root.val);

        return check1 || check2;
    }

    public static void main(String[] args) {

    }
}
