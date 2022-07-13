package com.stark.data_structures.linkedList.singlyLinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedListImpl<>();

        linkedList.addLast("b");
        linkedList.addLast("c");
        linkedList.addLast("d");
        linkedList.addLast("e");

        System.out.println("linkedlist: " + linkedList);

        linkedList.addFirst("a");

        System.out.println("linkedlist: " + linkedList);

        System.out.println("index of element with value e: " + linkedList.get("e"));
        System.out.println("index of element with value zzz: " + linkedList.get("zzz"));

        linkedList.remove("c");

        System.out.println("linkedlist: " + linkedList);
    }
}
