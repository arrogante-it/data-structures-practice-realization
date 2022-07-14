package com.stark.data_structures.linkedList.doublyLinkedList;

public interface LinkedList<T> {
    void addLast(T e);
    void addFirst(T e);
    int size();
    T getElementByIndex(int counter);
}
