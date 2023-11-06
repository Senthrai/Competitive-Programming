package com.mycompany.foutoir.binarytree;

public class TraversalBinaryTree {
    //    In-Order Traversal (Left, Root, Right):
//    In an in-order traversal, you visit the left subtree, then the root node,
//    and finally the right subtree. This traversal visits nodes in ascending order for a binary search tree.
    void inOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.val + " ");
        inOrderTraversal(node.right);
    }

    //    Pre-Order Traversal (Root, Left, Right):
//    In a pre-order traversal, you visit the root node first, then the left subtree, and finally the right subtree.
    void preOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    //    Post-Order Traversal (Left, Right, Root):
//    In a post-order traversal, you visit the left subtree first, then the right subtree, and finally the root node.
    void postOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.val + " ");
    }
}
