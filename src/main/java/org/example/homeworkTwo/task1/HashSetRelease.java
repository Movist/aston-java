package org.example.homeworkTwo.task1;

import java.util.Objects;

public class HashSetRelease<T> {
    private Node<T>[] table;
    private int capacity = 16;
    private int size = 0;

    private static class Node<T> {
        T value;
        Node<T> next;

        Node(T value) {
            this.value = value;
        }
    }

    public HashSetRelease() {
        table = new Node[capacity];
    }

    public void insert(T value) {
        int index = getIndex(value);
        Node<T> newNode = new Node<>(value);

        Node<T> current = table[index];
        while (current != null) {
            if (current.value.equals(value)) {
                return;
            }
            current = current.next;
        }

        newNode.next = table[index];
        table[index] = newNode;
        size++;
    }

    public void remove(T value) {
        int index = getIndex(value);
        Node<T> current = table[index];
        Node<T> previous = null;

        while (current != null) {
            if (current.value.equals(value)) {
                if (previous == null) {
                    table[index] = current.next;
                } else {
                    previous.next = current.next;
                }
                size--;
                return;
            }
            previous = current;
            current = current.next;
        }

    }

    private int getIndex(T value) {
        return Math.abs(Objects.hashCode(value)) % capacity;
    }

    public boolean contains(T value) {
        int index = getIndex(value);
        Node<T> current = table[index];
        while (current != null) {
            if (current.value.equals(value)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        HashSetRelease<String> mySet = new HashSetRelease<>();

        mySet.insert("1");
        mySet.insert("2");
        mySet.insert("3");

        System.out.println("Содержит '1': " + mySet.contains("1"));
        System.out.println("Содержит '4': " + mySet.contains("4"));
        System.out.println("Содержит '2': " + mySet.contains("2"));

        mySet.remove("2");
        System.out.println("Содержит '2' после удаления: " + mySet.contains("2"));

        System.out.println("Размер: " + mySet.size());
    }
}
