class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    TreeNode root;

    public boolean isBalanced(TreeNode node) {
        return checkHeight(node) != -1;
    }

    private int checkHeight(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = checkHeight(node.left);
        if (leftHeight == -1) return -1;

        int rightHeight = checkHeight(node.right);
        if (rightHeight == -1) return -1;

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        if (tree.isBalanced(tree.root)) {
            System.out.println("The tree is balanced");
        } else {
            System.out.println("The tree is not balanced");
        }
    }
}
