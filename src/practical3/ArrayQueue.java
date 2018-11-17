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
public class ArrayQueue<T> implements QueueInterface<T> {

    private int backIndex;
    private T[] queue;
    private static final int frontIndex = 0;
    private static final int initialcapacity = 50;

    public ArrayQueue() {
        this(initialcapacity);
    }

    public ArrayQueue(int incitialcapacity) {
        queue = (T[]) new Object[initialcapacity];
        backIndex = -1;
    }

    @Override
    public void enqueue(T newEntry) {
        backIndex++;

        if (isArrayFull()) {
            doubleArray();
        }

        backIndex++;
        queue[backIndex] = newEntry;
    }

    @Override
    public T dequeue() {
        T front = null;

        if (!isEmpty()) {
            front = queue[backIndex];
            for (int i = frontIndex; i < backIndex; i++) {
                queue[i] = queue[i + 1];
            }
            queue[backIndex] = null;
            backIndex--;
        }

        return front;
    }

    @Override
    public T getFront() {
        T front = null;

        if (!isEmpty()) {
            front = queue[frontIndex];
        }

        return front;
    }

    @Override
    public boolean isEmpty() {
        return backIndex == -1;
    }

    @Override
    public void clear() {
        backIndex = -1;
    }

    private boolean isArrayFull() {
        return backIndex == queue.length - 1;
    }

    private void doubleArray() {
        T[] olduqueue = queue;
        int oldsize = olduqueue.length;

        queue = (T[]) new Object[oldsize * 2];

        System.arraycopy(olduqueue, 0, queue, 0, oldsize);

    }

}
