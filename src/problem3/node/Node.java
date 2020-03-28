/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.node;

public class Node<E> {
    private E data;
    private Node<E> next;

    public Node(E data) {
        this.data = data;
    }

    public Node(E data, Node<E> next) {
        this.data = data;
        this.next = next;
    }

}
