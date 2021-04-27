/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycollections;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author Edylson
 */
public class ArrayStack<E> implements Stack<E> {
    private static final int CAPACITY = 100;
    private E[] data;
    private int t = -1;

    public ArrayStack() {
        this(CAPACITY);
    }

    public ArrayStack(int capacity) {
        data = (E[]) new Object[capacity];
    }

    public int size() {
        return (t + 1);
    }

    public boolean isEmpty() {
        return (t == -1);
    }

    public void push(E e) throws IllegalStateException {
        if (size() == data.length)
            throw new IllegalStateException("Stack is full");
        data[++t] = e;
    }

    public E top() {
        if (isEmpty())
            return null;
        return data[t];
    }

    public E pop() {
        if (isEmpty())
            return null;
        E answer = data[t];
        data[t] = null;
        t--;
        return answer;
    }

    // ---------Tornar a coleção ArrayStack iterável-------------
    public Iterator<E> iterator() {
        return new ArrayIterator();

    }

    // --------Classe interna ArrayIterartor------------

    private class ArrayIterator implements Iterator<E> {
        private int j;
        private int sz;
        private int f;

        public ArrayIterator() {
            if (sz == 0)
                j = -1;
            else
                j = f;
        }

        public boolean hasNext() {
            return j != -1;
        }

        public E next() {
            if (j == -1)
                throw new NoSuchElementException("Sem próximo elemento");
            int j_atual = j;
            j = (j + 1) % data.length;
            if (j == (f + sz) % data.length)
                j = -1;

            return data[j_atual];
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

    }

}
