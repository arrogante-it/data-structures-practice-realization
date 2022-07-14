package com.stark.data_structures.arrayList;

public interface ArrayList<T> extends Iterable<T> {

    boolean add(T e);
    void delete(int index);
    T get(int index);
    int size();
    void update(int index, T e);
}
