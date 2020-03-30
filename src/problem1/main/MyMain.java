/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

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
        tree.insert(92);
        tree.inOrderTraverse(tree.getRoot());
        System.out.println();
        tree.preOrderTraverse(tree.getRoot());
        System.out.println();
        tree.postOrderTraverse(tree.getRoot());
        System.out.println();
        tree.printLeftChild(tree.getRoot());
    }
}
