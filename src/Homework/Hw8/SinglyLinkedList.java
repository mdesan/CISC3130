package Homework.Hw8;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SinglyLinkedList<E>  implements Iterable<E> {

    //private node class
    private static class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data) {
            this(data, null);
        }

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }

    //the two fields in the SinglyLinkedList class
    private Node<E> head, tail;
    private int size;


    public SinglyLinkedList() {
        head = tail = null; //when list is made both the head and the tail are set to null
        size = 0;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(E element) {
        head = new Node<>(element, head);
        size++;

        //this if statement only matters when the list is initially empty
        //it sets the tail and head equal to eachother if its the only element.
        if (tail == null) {
            tail = head;
        }
    }
    public E getFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("empty list");
        }

        return head.data;
    }


    public void addLast(E element) {
        if (isEmpty()) {
            addFirst(element);
        } else {
            tail = tail.next = new Node<>(element);
            size++;
        }
    }

    public E getLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("empty list");
        }

        return tail.data;
    }

    public E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        E result = head.data;
        head = head.next;
        size--;

        if (head == null) {
            tail = null;
        }

        return result;
    }

    public E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        E result = tail.data;

        Node<E> current = head;

        for (int i = 0; i < size - 2; i++) {
            current = current.next;
        }

        tail = current;
        tail.next = null;
        size--;

        if (size == 0) {
            head = tail = null;
        }

        return result;
    }



    public E set(int index, E element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node<E> current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        E result = current.data;
        current.data = element;
        return result;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<E> current = head;

        while (current != null) {
            sb.append(current.data);

            if (current != tail) {
                sb.append(", ");
            }

            current = current.next;
        }

        sb.append("]");
        return sb.toString();
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            addFirst(element);
        } else if (index == size) {
            addLast(element);
        } else {
            Node<E> current = head;

            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            current.next = new Node<>(element, current.next);
            size++;
        }
    }

    // O(n)
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            return removeFirst();
        } else if (index == size - 1) {
            return removeLast();
        } else {
            Node<E> current = head;

            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            E result = current.next.data;
            current.next = current.next.next;
            size--;
            return result;
        }
    }



    @Override
    public Iterator<E> iterator() {
        return new SinglyLinkedListIterator();
    }
    private class SinglyLinkedListIterator implements Iterator<E> {
        private Node<E> current;

        public SinglyLinkedListIterator() {
            current = head;
        }

        // O(1)
        @Override
        public boolean hasNext() {
            return current != null;
        }

        // O(1)
        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            E result = current.data;
            current = current.next;
            return result;
        }
    }




}
