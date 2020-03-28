/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;

import java.util.Scanner;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements which are added in binary search tree");
        String s = scanner.nextLine();
        String[] ar = s.split(" ");
        MyBinarySearchTree tree = new MyBinarySearchTree();
        for (String s1 : ar) {
            tree.insert(Integer.parseInt(s1));
            MyQueue<Integer> myQueue = new MyQueue<>();
            System.out.println("Nodes After traversing in Pre Order :");
            MyQueue<Integer> myQueue1 = preOrderTraverse(tree.getRoot(), myQueue);
            System.out.println();
            System.out.println("Queue of Pre Order Successor :");
            MyQueue<Integer> myQueue2 = getQueuePreOrderSuccessor(myQueue1);
            System.out.println(myQueue2);
        }
    }

    public static MyQueue preOrderTraverse(TreeNode currentNode, MyQueue<Integer> myQueue) {
        if (currentNode != null) {
            myQueue.enqueue(currentNode.getData());
            System.out.print(currentNode.getData() + " ");
            preOrderTraverse(currentNode.getLeft(), myQueue);
            preOrderTraverse(currentNode.getRight(), myQueue);
        }
        return myQueue;
    }

    public static MyQueue getQueuePreOrderSuccessor(MyQueue myQueue) {
        myQueue.dequeue();
        return myQueue;
    }
}

