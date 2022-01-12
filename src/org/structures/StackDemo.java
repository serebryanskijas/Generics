package org.structures;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("QWE1");
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}

class Stack<T> {
    private ArrayList<T> arr = new ArrayList<>();
    private int size = 0;

    public void push(T obj) {
        arr.add(obj);
        size++;
    }

    public T pop() {

        if (size == 0) throw new EmptyStackException();
        else {
            size--;
            arr.get(size);
        }
        return arr.get(size);
    }

    public boolean isEmpty() {
        return size == 0 ? true : false;
    }
}
