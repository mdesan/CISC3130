package Homework.Hw3;

import java.util.List;
import java.util.Objects;

public interface BoundedList<E> extends Iterable<E> {
    /**
     * A capacity-bounded list of String elements. Each list has a capacity, which is the maximum number of elements that the list can hold at one time.
     * Each list also has a size, which is the number of elements currently held by the list. The elements of a list have indexes: the first element
     * is at index 0, the second element is at index 1, and so on. Null elements are allowed.
     */

    /**
     * Returns the number maximum number of elements that this list can hold at the same time.
     * @return the capacity
     */
    int capacity();

    /**
     * Returns the number of elements currently held in this list.
     * @return the size, which is less than or equal to the capacity
     */
    int size();

    /**
     * Adds the specified element to the end of this list, if the list isn't already full.
     * For example, if {@code list} is a StringBoundedList with capacity 10 that represents {@code [a, b, c]},
     * then saying {@code list.add("d")} makes {@code list} represent {@code [a, b, c, d]}.
     * @param e the String to add
     * @throws IllegalStateException if this list is already full
     */
    void add(E e);

    /**
     * Returns the element at the specified index in this list.
     * @param index the position of the desired element.
     * @return the element (possibly null) at the specified position
     * @throws IndexOutOfBoundsException if index is negative, or greater than or equal to the size
     */
    E get(int index);

    /**
     * Replaces the old element at the specified index with the new element, and returns the old element.
     * @param index the index where an element should be replaced
     * @param e the new element
     * @return the old element
     * @throws IndexOutOfBoundsException if index is negative, or greater than or equal to the size
     */
    E set(int index, E e);

    /**
     * Return the index of the first occurrence of the specified String in this list, or -1 if it doesn't occur in this list.
     * @param e the String to search for (possibly null)
     * @return the index of the first occurrence of s, or -1 if not found
     */
    int indexOf(E e);

    /**
     * Return the index of the last occurrence of the specified String in this list, or -1 if it doesn't occur in this list.
     * @param e the String to search for (possibly null)
     * @return the index of the last occurrence of s, or -1 if not found
     */
    int lastIndexOf(E e);

    /**
     * Makes the list empty.
     */
    void clear();

    default boolean isEmpty(){
        return this.size()==0;
    }
    default boolean isFull(){
        return this.size() == this.capacity();
    }
    default E getFirst(){
        return this.get(0);
    }
    default E getLast(){
        if(this.isEmpty()){
            throw new IndexOutOfBoundsException();
        }
        return this.get(this.size()-1);
    }
    default E setFirst(E e){
        return this.set(0, e);
    }
    default E setLast(E e){
        return this.set(this.size()-1, e);
    }
    default boolean contains(E e){
        for(int i =0;i<this.size(); i++){
            if(Objects.equals(this.get(i),e)){
                return true;
            }
        }
        return false;

    }

    void add(int index, E e );
    E remove(int index);
    boolean remove(E e);

    //hw3
    default void addAll(BoundedList<? extends E> other){

        int available = this.capacity()-this.size();

        if(other.size()>available){
            throw new IllegalStateException();
        }

        for(int i =0;i<other.size();i++){
            this.add(other.get(i));
        }

    }

    //other is suppose to be a super type of this
    default BoundedList<?> copyTo(BoundedList<? super E> other) {
        int available = other.capacity()- other.size();
        if(this.size()>available){
            throw new IllegalStateException();
        }
        for(int i =0;i<this.size();i++){
            other.add(this.get(i));
        }
        return other;
    }
}