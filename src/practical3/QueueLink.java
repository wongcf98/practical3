/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical3;

/**
 *
 * @author Tarc
 */
public class QueueLink<T> implements QueueInterface<T> {

    private Node lastnode;

    public QueueLink() {
        this.lastnode = null;
    }

    @Override
    public void enqueue(T newEntry) {
        Node newnode = new Node(newEntry);

        if (isEmpty()) {
            newnode.next = newnode;
        } else {
            newnode.next = lastnode.next;
            lastnode.next = newnode;
            lastnode = newnode;
        }
    }

    @Override
    public T dequeue() {
        T front = null;

        if (!isEmpty()) {
            front = lastnode.next.data;
            if (lastnode == lastnode.next) {
                lastnode = null;
            } else {
                lastnode.next = lastnode.next.next;
            }

        }

        return front;
    }

    @Override
    public T getFront() {
        T front = null;

        if (!isEmpty()) {
            front = lastnode.next.data;
        }

        return front;
    }

    public boolean isEmpty() {
        return lastnode == null;
    }

    @Override
    public void clear() {
        lastnode = null;
    }

    public class Node {

        private T data;
        private Node next;

        private Node(T data) {
            this.data = data;
            this.next = null;
        }

        private Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
