/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycollections.linkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author Edylson
 */
public class SinglyLinkedList<E> implements Iterable<E> {

    // ----Nested Node Class----------
    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> n) {
            next = n;
        }
    }

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public SinglyLinkedList() {
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty())
            return null;
        return head.getElement();
    }

    public E last() {
        if (isEmpty())
            return null;
        return tail.getElement();
    }

    public E removeFirst() {
        // TODO impl
        return null;
    }

    public Iterator<E> iterator() {
        return new SLLIterator();
    }

    // ------Classe interna SLLIterator-------------
    private class SLLIterator implements Iterator<E> {
        private Node<E> cursor = head;

        public boolean hasNext() {
            return cursor != null;
        }

        public E next() {
            if (cursor == null)
                throw new NoSuchElementException("Sem próximo elemento");
            Node<E> current = cursor;
            cursor = cursor.getNext();
            return current.getElement();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

    }

}
