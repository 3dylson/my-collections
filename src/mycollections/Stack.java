/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycollections;

/**
 *
 * @author Edylson
 */
public interface Stack<E> {
    int size();

    boolean isEmpty();

    E top();

    void push(E element);

    E pop();
}
