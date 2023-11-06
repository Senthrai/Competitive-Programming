package com.mycompany.foutoir.binarytree;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // If both nodes are null, they are the same
        if (p == null && q == null) {
            return true;
        }
        // If one node is null and the other is not, they are not the same
        if (p == null || q == null) {
            return false;
        }
        // If the values are different, they are not the same
        if (p.val != q.val) {
            return false;
        }
        // Recursively check the left and right subtrees
        return isSameTree(p.left,q.left) && isSameTree(p.right, q.right);
    }
}
