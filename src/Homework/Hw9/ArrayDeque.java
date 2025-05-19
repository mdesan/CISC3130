package Homework.Hw9;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayDeque <E> implements Iterable<E>{

    E[] deque;
    int indexOfFirst;
    int indexOfLast;


    public ArrayDeque(){
        deque = (E[]) new Object[10];
        indexOfFirst=indexOfLast=-1;
    }
    public ArrayDeque(int initialCapacity){
        if(initialCapacity<0){
            throw new IllegalArgumentException();
        }

        deque = (E[]) new Object[initialCapacity];
        indexOfFirst=indexOfLast=-1;
    }
    public int size(){
        if (indexOfFirst == -1 && indexOfLast == -1) {
            return 0;
        } else if (indexOfFirst <= indexOfLast) {
            return indexOfLast - indexOfFirst + 1;
        } else {
            return (indexOfLast + 1) + (deque.length - indexOfFirst);
        }
    }
    public boolean isEmpty(){
        return this.size()==0;
    }
    public void addFirst(E element){
        if(isEmpty()){
            deque[0]=element;
            indexOfFirst=indexOfLast=0;
        }
        else if(size()== deque.length){
            E[] newArray = (E[]) new Object[2 * (deque.length) +1];
            for(int i =0;i<size();i++){
                newArray[i+1] = deque[(indexOfFirst + i) % deque.length];
            }
            newArray[0]=element;
            deque = newArray;
            indexOfLast = size();
            indexOfFirst = 0;

        }
        else{
            indexOfFirst = (indexOfFirst - 1 + deque.length) % deque.length;
            deque[indexOfFirst] = element;
        }

    }

    public void addLast(E element){
        if(isEmpty()){
            deque[0]=element;
            indexOfFirst=indexOfLast=0;
        }
        else if(size()==deque.length){
            E[] newArray = (E[]) new Object[2 * (deque.length) +1];
            for(int i =0;i<size();i++){
                newArray[i] = deque[(indexOfFirst + i) % deque.length];
            }
            newArray[size()]=element;
            deque = newArray;
            indexOfFirst = 0;
            indexOfLast = size();
        }

        else{
            indexOfLast = (indexOfLast + 1) % deque.length;
            deque[indexOfLast]=element;
        }

    }


    public E getFirst(){
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return deque[indexOfFirst];
    }
    public E getLast(){
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return deque[indexOfLast];
    }

    public E removeFirst(){
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        E result = deque[indexOfFirst];
        deque[indexOfFirst] = null;

        if (indexOfFirst == indexOfLast) {
            indexOfFirst = indexOfLast = -1;
        } else {
            indexOfFirst = (indexOfFirst + 1) % deque.length;

        }

        return result;
    }

    public E removeLast(){
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        E result = deque[indexOfLast];
        deque[indexOfLast]=null;
        if(indexOfFirst==indexOfLast){
            indexOfFirst=indexOfLast=-1;
        }
        else {
            indexOfLast = (indexOfLast - 1 + deque.length) % deque.length;
        }
        return result;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < size(); i++) {
            sb.append(deque[(indexOfFirst + i) % deque.length]);

            if (i < size() - 1) {
                sb.append(", ");
            }
        }

        return sb.append("]").toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayDequeIterator();
    }

    private class ArrayDequeIterator implements Iterator<E>{
        private int currIndex = indexOfFirst;
        private int count =0;
        @Override
        public boolean hasNext() {
           return count<size();
        }

        @Override
        public E next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }

            E result = deque[currIndex];
            currIndex = (currIndex+1) % deque.length;
            count++;
            return result;
        }
    }
}
