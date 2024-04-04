package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list
        LinkedList<Integer> myList = new LinkedList<>();
        //  - add 4 as the first element of the list
        myList.add(4);
        //  - then add 5, 6, 8, 2, 9 to the the list
        myList.add(5);
        myList.add(6);
        myList.add(8);
        myList.add(2);
        myList.add(9);
        //  - add another 2 as the last element of the list
        myList.add(2);
        //  - add 4 as the 3rd element of the list
        myList.add(2, 4);
        //  - invoke the method element() on the list and print the result on the screen
        System.out.print(myList.element());
        //  - return the list
        return myList;
   }
    public Stack<Integer> useStack() {
        // TODO: create an empty stack
        Stack<Integer> myStack = new Stack<>();
        //  - add 5, 6, 8, 9 to the stack
        myStack.add(5);
        myStack.add(6);
        myStack.add(8);
        myStack.add(9);
        //  - print the first element of the stack on the screen
        System.out.print(myStack.firstElement());
        //  - print the last element of the stack on the screen
        System.out.print(myStack.lastElement());
        //  - invoke the method pop() on the stack and print the result on the screen
        System.out.print(myStack.pop());
        //  - invoke the push(4) method on the stack
        myStack.push(4);
        //  - return the stack
        return myStack;
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque
        ArrayDeque<Integer> myArray = new ArrayDeque<>();
        //  - add 5, 6, 8, 9 to the queue
        myArray.add(5);
        myArray.add(6);
        myArray.add(8);
        myArray.add(9);
        //  - print the first element of the queue on the screen
        System.out.print(myArray.getFirst());
        //  - print the last element of the queue on the screen
        System.out.print(myArray.getLast());        
        //  - invoke the method poll() on the queue and print the result on the screen
        System.out.print(myArray.poll());
        //  - invoke the element() method on the queue and print the result on the screen
        System.out.print(myArray.element());
        //  - return the queue
        return myArray;
    }

    public HashMap<Integer, String> useHashMap() {
        // TODO: create an empty hash map
        HashMap<Integer, String> myhash = new HashMap<>();
        //  - add {1, TypeScript} entry to the map
        myhash.put(1, "TypeScript");
        //  - add {2, Kotlin} entry to the map
        myhash.put(2, "Kotlin");
        //  - add {3, Python} entry to the map
        myhash.put(3, "Python");
        //  - add {4, Java} entry to the map
        myhash.put(4, "Java");
        //  - add {5, JavaScript} entry to the map
        myhash.put(5, "JavaScript");
        //  - add {6, Rust} entry to the map
        myhash.put(6, "Rust");
        //  - determine the set of keys from the map and print it on the screen
        System.out.print(myhash.keySet());
        //  - determine the set of values from the map and print it on the screen
        System.out.print(myhash.values());
        //  - determine whether the map contains "English" as a language and print the result on the screen
        System.out.print(myhash.containsValue("English"));
        //  - return the map
        return myhash;
    }

    public String getName() {
        return "Collections Exercises";
    }
}