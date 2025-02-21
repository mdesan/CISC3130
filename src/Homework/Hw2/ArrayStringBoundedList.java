package Homework.Hw2;

import java.util.Objects;

public class ArrayStringBoundedList implements StringBoundedList{

    private String [] arr;
    private int size;

    public ArrayStringBoundedList(int capacity){
        if(capacity < 0){
            throw new IllegalArgumentException();
        }

        arr = new String[capacity];
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
    public void add(String s) {
        if(this.isFull()){
            throw new IllegalStateException();
        }
        arr[this.size()]=s;
        this.size++;

    }

    @Override
    public String get(int index) {
        if(index <0 || index > this.size || index == this.size){
            throw new IndexOutOfBoundsException();
        }
        return arr[index];
    }

    @Override
    public String set(int index, String element) {
        if(index < 0 || index > this.size || index == this.size){
            throw new IndexOutOfBoundsException();
        }
        String old = arr[index];
        arr[index] = element;
        return old;
    }

    @Override
    public int indexOf(String s) {
        for(int i =0;i<this.size;i++){
            if(Objects.equals(arr[i], s)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(String s) {
        for(int i =this.size-1;i>=0;i--){
            if(Objects.equals(arr[i], s)) {
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
    public void add(int index, String s) {
        if(this.isFull()){
            throw new IllegalStateException();
        }
        if(index < 0 || index > this.size){
            throw new IndexOutOfBoundsException();
        }

        for (int i = this.size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index]=s;
        this.size++;



    }

    @Override
    public String remove(int index) {
        if(index >= this.size || index < 0 ){
            throw new IndexOutOfBoundsException();
        }

        String s = this.arr[index];

        for(int i =index;i<this.size-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1]=null;
        this.size--;
        return s;

    }

    @Override
    public boolean remove(String s) {
        if(!this.contains(s)){
            return false;
        }
        for(int i = indexOf(s); i< this.size-1;i++){
            arr[i] = arr[i+1];

        }
        arr[arr.length-1]=null;
        this.size--;
        return true;

    }


}
