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
public class ArrayStack<T> implements StackInterface<T> {

    private int topIndex;
    private T[] stack;
    private static final int initialCapacity = 50;

    public ArrayStack() {
        this(initialCapacity);
    }

    public ArrayStack(int initialcapacity) {
        stack = (T[]) new Object[initialcapacity];
        topIndex = -1;
    }

    public void push(T newEntry) {
        topIndex++;

        if (topIndex >= stack.length - 1) {
            doubleArray();
        }

        stack[topIndex] = newEntry;
    }

    @Override
    public T pop() {
        T top = null;

        if (!isEmpty()) {
            top = stack[topIndex];
            stack[topIndex] = null;
            topIndex--;
        }

        return top;
    }

    @Override
    public T peek() {
        T top = null;

        if (!isEmpty()) {
            top = stack[topIndex];
        }

        return top;
    }

    @Override
    public boolean isEmpty() {
        return topIndex == -1;
    }

    @Override
    public void clear() {
        topIndex = -1;
    }

    private void doubleArray() {
        T[] oldStack = stack;
        int oldsize = oldStack.length;

        stack = (T[]) new Object[oldsize * 2];

        System.arraycopy(oldStack, 0, stack, 0, oldsize);

    }

}
