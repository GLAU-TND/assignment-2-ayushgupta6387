/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;


// executable class

// use problem1.mybst.MyBinarySearchTree class for creating binary tree

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        tree.insert(50);
        tree.insert(25);
        tree.insert(75);
        tree.insert(15);
        tree.insert(35);
        tree.insert(65);
        tree.insert(80);
        tree.insert(7);
        tree.insert(32);
        tree.insert(31);
        tree.insert(33);
        tree.insert(67);
        tree.insert(90);
        tree.insert(82);
        tree.insert(93);
        System.out.println("Traverse the tree in the PreOrder :");
        preOrderTraverse(tree.getRoot());
        System.out.println();
        System.out.println("Traverse the tree in the PostOrder :");
        postOrderTraverse(tree.getRoot());
    }

    public static void preOrderTraverse(TreeNode node) {
        if (node != null) {
            System.out.println(node.getData() + " ");
            preOrderTraverse(node.getLeft());
            preOrderTraverse(node.getRight());
        }
    }

    public static void postOrderTraverse(TreeNode node) {
        if (node != null) {
            postOrderTraverse(node.getRight());
            postOrderTraverse(node.getLeft());
            System.out.println(node.getData());
        }
    }
}
