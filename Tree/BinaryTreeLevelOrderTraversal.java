package Tree;

public class BinaryTreeLevelOrderTraversal {
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        if (root!=null) q.add(root);

        while (q.isEmpty() == false){
            int size = q.size();

            List<Integer> level = new ArrayList<>();
            for (int i=1; i<=size; i++){
                TreeNode r = q.remove();
                level.add(r.val);

                if (r.left != null ) q.add(r.left);
                if (r.right != null) q.add(r.right);
            }

            ans.add(level);
        }

        return ans;
    }
    public static void main(String[] args) {

    }
}
