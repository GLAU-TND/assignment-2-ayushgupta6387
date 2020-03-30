/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

public class MyQueue<E> {
    private Node<E> front;
    private Node<E> rear;
    private int size = 0;

    public void enqueue(E data) {
        Node<E> node = new Node<>(data);
        if (front == null) {
            node.next = null;
            front = node;
            rear = node;
        } else {
            node.setNext(rear.getNext());
            rear.setNext(node);
            rear = node;
        }
        size++;
    }

    public E dequeue() {
        E data = front.getData();
        front = front.getNext();
        size--;
        return data;
    }

//    public E peek() {
//        E data = front.getData();
//        return data;
//    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[");
        Node<E> temp = front;
        for (int i = 0; i < size && temp != null; i++) {
            E data = temp.getData();
            sb.append(data);
            sb.append((i < size - 1) ? "," : "");
            temp = temp.getNext();
        }
        sb.append("]");
        return sb.toString();
    }

    private static class Node<E> {
        E data;
        Node<E> next;

        public Node(E data) {
            this.data = data;
        }

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
