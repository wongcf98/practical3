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
public class StackLink<T> implements StackInterface<T> {

    private Node topNode;

    public StackLink() {
        this.topNode = null;
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

    @Override
    public void push(T newEntry) {
        Node newnode = new Node(newEntry);
        newnode.next = topNode;
        topNode = newnode;
    }

    @Override
    public T pop() {
        T top = peek();

        if (topNode != null) {
            //top = topNode.data;
            topNode = topNode.next;
        }

        return top;
    }

    @Override
    public T peek() {
        T top = null;

        if (topNode != null) {
            top = topNode.data;
        }

        return top;
    }

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public void clear() {
        topNode = null;
    }

}
