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

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static boolean check(TreeNode root1, TreeNode root2){
        // If both are null → same
        if (root1 == null && root2 == null) return true;

        // If one is null but not the other → not same
        if (root1 == null || root2 == null) return false;

        // If values differ → not same
        if (root1.val != root2.val) return false;

        // Recursively check left and right
        return check(root1.left, root2.left) && check(root1.right, root2.right);
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        return check(p, q);
    }

    public static void main(String[] args) {
        // Tree 1
        TreeNode t1 = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), null),
                new TreeNode(3));

        // Tree 2
        TreeNode t2 = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), null),
                new TreeNode(3));

        // Tree 3 (different)
        TreeNode t3 = new TreeNode(1,
                new TreeNode(2, null, null),
                new TreeNode(3));

        System.out.println(isSameTree(t1, t2)); // true ✅
        System.out.println(isSameTree(t1, t3)); // false ❌
    }
}
