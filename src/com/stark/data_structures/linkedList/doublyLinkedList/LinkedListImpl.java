package com.stark.data_structures.linkedList.doublyLinkedList;

import java.util.Iterator;

public class LinkedListImpl<T> implements LinkedList<T>, Iterable<T>, DescendingIterator<T>{

    private Node<T> firstNode;
    private Node<T> lastNode;
    private int size = 0;

    public LinkedListImpl(){
        lastNode = new Node<T>(null, firstNode, null);
        firstNode = new Node<T>(null, null, lastNode);
    }

    @Override
    public void addLast(T e) {
        Node<T> prev = lastNode;
        prev.setItem(e);
        lastNode = new Node<T>(null, prev, null);
        prev.setNext(lastNode);
        size++;
    }

    @Override
    public void addFirst(T e) {
        Node<T> next = firstNode;
        next.setItem(e);
        firstNode = new Node<>(null, null, next);
        next.setPrev(firstNode);
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T getElementByIndex(int counter) {
        Node<T> target = firstNode.getNext();
        for (int i = 0; i < counter; i++) {
            target = getNextElement(target);
        }
        return target.getItem();
    }

    private Node<T> getNextElement(Node<T> current){
        return current.getNext();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < size;
            }

            @Override
            public T next() {
                return getElementByIndex(counter++);
            }
        };
    }

    @Override
    public Iterator<T> descendingIterator() {
        return new Iterator<T>() {
            int counter = size - 1;

            @Override
            public boolean hasNext() {
                return counter >= 0;
            }

            @Override
            public T next() {
                return getElementByIndex(counter--);
            }
        };
    }

    private static class Node<T> {
        T item;
        Node<T> next;
        Node<T> prev;

        public Node(T item, Node<T> prev, Node<T> next) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }

        public T getItem() {
            return item;
        }

        public void setItem(T item) {
            this.item = item;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public Node<T> getPrev() {
            return prev;
        }

        public void setPrev(Node<T> prev) {
            this.prev = prev;
        }
    }
}


















































