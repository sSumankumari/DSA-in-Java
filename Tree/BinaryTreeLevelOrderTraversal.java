package Tree;

import java.util.*;

public class BinaryTreeLevelOrderTraversal {
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

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        if (root != null) q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();

            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {  // i from 0 → size-1 (cleaner)
                TreeNode r = q.remove();
                level.add(r.val);

                if (r.left != null) q.add(r.left);
                if (r.right != null) q.add(r.right);
            }

            ans.add(level);
        }

        return ans;
    }

    public static void main(String[] args) {
        BinaryTreeLevelOrderTraversal bt = new BinaryTreeLevelOrderTraversal();

        // Build tree:
        //       1
        //      / \
        //     2   3
        //    / \   \
        //   4   5   6
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, null, new TreeNode(6)));

        List<List<Integer>> result = bt.levelOrder(root);
        System.out.println(result);  // [[1], [2, 3], [4, 5, 6]]
    }
}
