/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.util.Iterator;

import mycollections.ArrayStack;
import mycollections.LinkedStack;
import mycollections.Stack;

/**
 *
 * @author Edylson
 */
public class TestIterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Stack<String> stcoll = new ArrayStack<>(), dynooll = new LinkedStack();
        stcoll.push(" de Andrade");
        stcoll.push(" Abaixo");
        stcoll.push(" pela Estrada");
        stcoll.push("Rolando");
        Iterator<String> it = new stcoll.iterator();
        while (it.hasNext())
            dyncoll.push(it.next());
        for (String val : dyncoll)
            System.out.print(val);
        System.out.println();
    }

}
