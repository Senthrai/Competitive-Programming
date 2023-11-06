package com.mycompany.foutoir.binarytree;


public class MaxDepth {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int depth = maxDepth(root);
        System.out.println("Maximum Depth: " + depth);
    }

    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;

        // Recursively calculate the depth of the left and right subtrees
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        // Return the maximum depth among the left and right subtrees plus one (for the current node)
        return Math.max(leftDepth, rightDepth) + 1;
    }
}

