package Homework.Hw3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class ArrayBoundedList<E> implements BoundedList<E>{

    private final E[] arr;
    private int size;

    public ArrayBoundedList(int capacity){
        if(capacity < 0){
            throw new IllegalArgumentException();
        }

        arr = (E[]) new Object[capacity];
    }

    @Override
    public int capacity() {
        return this.arr.length;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void add(E e) {
        if(this.isFull()){
            throw new IllegalStateException();
        }
        arr[this.size()]=e;
        this.size++;

    }

    @Override
    public E get(int index) {
        if(index <0 || index > this.size || index == this.size){
            throw new IndexOutOfBoundsException();
        }
        return arr[index];
    }

    @Override
    public E set(int index, E e) {
        if(index < 0 || index > this.size || index == this.size){
            throw new IndexOutOfBoundsException();
        }
        E old = arr[index];
        arr[index] = e;
        return old;
    }

    @Override
    public int indexOf(E e) {
        for(int i =0;i<this.size;i++){
            if(Objects.equals(arr[i], e)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E e) {
        for(int i =this.size-1;i>=0;i--){
            if(Objects.equals(arr[i], e)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void clear() {
        for(int i =0;i<this.size;i++){
            arr[i]=null;
        }
        this.size=0;
    }

    @Override
    public String toString(){

        if(this.isEmpty()){
            return "[]";
        }
        StringBuilder s = new StringBuilder("[");

        for(int i =0;i< this.size;i++){
            if(i!=this.size-1){
                s.append(arr[i]).append(", ");
            }
            else{
                s.append(arr[i]).append("]");
            }
        }
        return s.toString();
    }

    //implement these for the last question
    @Override
    public void add(int index, E e) {
        if(this.isFull()){
            throw new IllegalStateException();
        }
        if(index < 0 || index > this.size){
            throw new IndexOutOfBoundsException();
        }

        for (int i = this.size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index]=e;
        this.size++;



    }

    @Override
    public E remove(int index) {
        if(index >= this.size || index < 0 ){
            throw new IndexOutOfBoundsException();
        }

        E e = this.arr[index];

        for(int i =index;i<this.size-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1]=null;
        this.size--;
        return e;

    }

    @Override
    public boolean remove(E e) {
        if(!this.contains(e)){
            return false;
        }
        for(int i = indexOf(e); i< this.size-1;i++){
            arr[i] = arr[i+1];

        }
        arr[arr.length-1]=null;
        this.size--;
        return true;

    }


    //for each loops call this method implicitly
    // this method returns a new custom iterator
    @Override
    public Iterator<E> iterator() {
        return new ArrayBoundedListIterator();
    }



    private class ArrayBoundedListIterator implements Iterator<E>{
        int index;

        public ArrayBoundedListIterator(){
            index =0;
        }


        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public E next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            E element = arr[index];
            index++;
            return element;

        }
    }


}
