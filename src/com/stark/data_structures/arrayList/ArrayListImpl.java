package com.stark.data_structures.arrayList;

import java.util.Iterator;

public class ArrayListImpl<T> implements ArrayList<T> {
    private T[] values;

    public ArrayListImpl() {

        values = (T[]) new Object[0];
    }

    @Override
    public boolean add(T e) {
        try{
            T[] temp = values;
            values = (T[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;
            return true;
        }catch (ClassCastException exception){
            exception.printStackTrace();
        }
        return false;
    }

    @Override
    public void delete(int index) {
        try{
            T[] temp = values;
            values = (T[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int amountElementAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index + 1, // src
                    values, index, // target
                    amountElementAfterIndex); // amount
        }catch(ClassCastException exception){
            exception.printStackTrace();
        }
    }

    @Override
    public T get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, T e) {
        values[index] = e;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<T>(values);
    }
}
























































