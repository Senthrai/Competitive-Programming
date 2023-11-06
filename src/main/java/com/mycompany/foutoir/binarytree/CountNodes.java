package com.mycompany.foutoir.binarytree;

public class CountNodes {
    public int countNodes(TreeNode root) {
        int leftHeight = heightLeft(root);
        int rightHeight = heightRight(root);

        if(leftHeight == rightHeight){
            return (int) (Math.pow(2, leftHeight) - 1);
        }else{
            return 1 + countNodes(root.left) + countNodes(root.right);
        }
    }

    public int heightLeft(TreeNode root){
        if(root==null) return 0;
        return heightLeft(root.left) + 1;
    }

    public int heightRight(TreeNode root){
        if(root==null) return 0;
        return heightRight(root.right) + 1;
    }
}
