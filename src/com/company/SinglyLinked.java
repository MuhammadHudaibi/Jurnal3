package com.company;

import java.util.NoSuchElementException;

public class SinglyLinked<E> {
    private Input<E> firstInput;
    private Input<E> lastInput;
    private String name;

    public SinglyLinked() {
        this("linked list");
    }

    public SinglyLinked(String listName) {
        name = listName;
        firstInput = lastInput = null;
    }
    // Insert At Front
    public void insertAtFront(E insertItem) {
        Input newInput = new Input(insertItem);

        if (isEmpty()) {
            firstInput = lastInput = new Input<E>(insertItem);
        } else { // firstInput refers to new Input
            newInput.next = firstInput;
            firstInput = newInput;
        }
    }
    // Insert At Back
    public void insertAtBack(E insertItem) {
        Input newInput = new Input(insertItem);

        if (isEmpty()) {
            firstInput = lastInput = new Input<E>(insertItem);
        } else {
            lastInput.next = newInput;
            lastInput = newInput;
        }
    }
    //Remove from Back
    public E removeFromBack() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException(name + " is empty");
        }
        E removedItem = lastInput.data;

        if (firstInput == null) {
            firstInput = lastInput = null;
        } else {
            Input<E> current = firstInput;
            while (current.next != lastInput) {
                current = current.next;
            }
            lastInput = current;
            current.next = null;
        }
        return removedItem;
    }
    //Remove from Front
    public E removeFromFront() throws NoSuchElementException {
        if (isEmpty()) { // throw exception if List is empty
            throw new NoSuchElementException(name + " is empty");
        }

        E removedItem = firstInput.data;

        if(firstInput != null){
            Input temp = new Input(firstInput);
            firstInput = firstInput.next;
            temp = null;
        }
        return removedItem;
    }

    private boolean isEmpty() {
        return firstInput == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.printf("Empty %s%n", name);
            return;
        }

        System.out.printf("The %s is: %n", name);
        Input<E> current = firstInput;

        while (current != null) {
            System.out.printf("%s ", current.data);
            current = current.next;
        }
    }
}