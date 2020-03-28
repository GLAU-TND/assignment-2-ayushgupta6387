/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    private TreeNode root = null;

    public TreeNode getRoot() {
        return root;
    }

    public void insert(int data) {
        TreeNode node = new TreeNode(data);
        if (root == null) {
            root = node;
        } else {
            TreeNode temp = root;
            TreeNode parent = null;
            while (temp != null) {
                parent = temp;
                if (temp.getData() >= node.getData()) {
                    temp = temp.getLeft();
                } else {
                    temp = temp.getRight();
                }
            }
            if (parent.getData() >= node.getData()) {
                parent.setLeft(node);
            } else {
                parent.setRight(node);
            }
        }
    }

    public void inorderTraverse(TreeNode node) {
        if (node != null) {
            inorderTraverse(node.getLeft());
            System.out.println(node.getData() + " ");
            inorderTraverse(node.getRight());
        }
    }

    public void preorderTraverse(TreeNode node) {
        if (node != null) {
            System.out.println(node.getData() + " ");
            preorderTraverse(node.getLeft());
            preorderTraverse(node.getRight());
        }
    }

    public void postorderTraverse(TreeNode node) {
        if (node != null) {
            postorderTraverse(node.getRight());
            postorderTraverse(node.getLeft());
            System.out.println(node.getData());
        }
    }


}
