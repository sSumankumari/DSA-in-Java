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

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        // Leaf node check
        if (root.val == targetSum && root.left == null && root.right == null) {
            return true;
        }

        // Recursive check on left and right children
        return hasPathSum(root.left, targetSum - root.val) ||
                hasPathSum(root.right, targetSum - root.val);
    }

    public static void main(String[] args) {
        PathSum ps = new PathSum();

        // Build test tree:
        //       5
        //      / \
        //     4   8
        //    /   / \
        //   11  13  4
        //  /  \      \
        // 7    2      1
        TreeNode root = new TreeNode(5,
                new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
                new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1)))
        );

        System.out.println(ps.hasPathSum(root, 22)); // true (5→4→11→2)
        System.out.println(ps.hasPathSum(root, 26)); // true (5→8→13)
        System.out.println(ps.hasPathSum(root, 18)); // false
    }
}
