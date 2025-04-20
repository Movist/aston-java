package org.example.homeworkTwo.task1;

import java.util.Arrays;

public class ArrayListRelease<T> {
    private Object[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayListRelease() {
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void add(T value) {
        if (size == array.length) {
            ensureCapacity();
        }
        array[size++] = value;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс за пределами допустимого");
        }
        return (T) array[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс за пределами допустимого");
        }
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        array[--size] = null;
    }

    public void addAll(ArrayListRelease<T> otherList) {
        for (int i = 0; i < otherList.size(); i++) {
            add(otherList.get(i));
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        int newCapacity = array.length + (array.length >> 1);
        array = Arrays.copyOf(array, newCapacity);
    }

    public static void main(String[] args) {
        ArrayListRelease<String> list = new ArrayListRelease<>();
        list.add("1");
        list.add("2");
        list.add("3");

        System.out.println("Список после добавления элементов:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.remove(1);
        System.out.println("Список после удаления:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        ArrayListRelease<String> otherList = new ArrayListRelease<>();
        otherList.add("4");
        otherList.add("5");
        list.addAll(otherList);

        System.out.println("Список после добавления всех элементов из другого списка:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
