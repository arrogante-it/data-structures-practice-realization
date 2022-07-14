package com.stark.data_structures.arrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayListImpl<>();
        arrayList.add("first");
        arrayList.add("second");
        arrayList.add("third");
        arrayList.add("fourth");
        arrayList.add("fifth");

        System.out.println("size: " + arrayList.size() + "\n");

        for(String element : arrayList){
            System.out.println(element);
        }
    }
}
