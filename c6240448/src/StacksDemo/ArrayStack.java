
package StacksDemo;

import java.util.Arrays;

public class ArrayStack<T> {

    private static final int CAPACITY = 2;

    private int top;
    private T[] stack;

    // Constructor with initial capacity
    public ArrayStack(int initialSize) {
        top = 0;
        stack = (T[]) new Object[initialSize];
    }

    // Default constructor
    public ArrayStack() {
        this(CAPACITY);
    }

    // Push: Add an element to the stack
    public void push(T element) {

        if (size() == stack.length) {
            expandCapacity();
        }

        stack[top] = element;
        top++;
    }

    // Expand capacity when the stack is full
    private void expandCapacity() {
        stack = Arrays.copyOf(stack, stack.length * 2);
    }

    // Pop: Remove and return the top element
    public T pop() {

        if (isEmpty()) {
            System.out.println("The stack is Empty!");
            return null;
        }

        top--;

        T removedElement = stack[top];
        stack[top] = null;

        return removedElement;
    }

    // Peek: Return the top element without removing it
    public T peek() {

        if (isEmpty()) {
            System.out.println("The stack is Empty!");
            return null;
        }

        return stack[top - 1];
    }

    // Check whether the stack is empty
    public boolean isEmpty() {
        return top == 0;
    }

    // Return the number of elements in the stack
    public int size() {
        return top;
    }

    // Display all elements in the stack
    public void displayElements() {

        for (int i = 0; i < size(); i++) {
            System.out.println(stack[i]);
        }
    }
}
