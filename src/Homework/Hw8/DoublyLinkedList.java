package Homework.Hw8;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class DoublyLinkedList<E> implements Iterable<E>{

    private static class Node<E> {
        private E data;
        private Node<E> previous;
        private Node<E> next;

        public Node(E data, Node<E> previous,Node<E> next){
            this.data=data;
            this.previous=previous;
            this.next=next;
        }
        public Node(E data){
            this(data,null,null);
        }
    }

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public DoublyLinkedList(){
        tail=head=null;
        size=0;
    }

    public void addFirst(E element){

        if(size!=0){
            head.previous=new Node<E>(element,null,head);
            head=head.previous;
        }
        else{
            tail=head=new Node<E>(element);
        }
        size++;

    }

    public void addLast(E element){
        if(size==0){
            addFirst(element);
        }
        else{
            tail.next=new Node<E>(element,tail,null);
            tail=tail.next;
            size++;
        }
    }

    public E getFirst(){
        if(size==0){
            throw new NoSuchElementException();
        }
        return head.data;
    }
    public E getLast(){
        if(size==0){
            throw new NoSuchElementException();
        }
        return tail.data;
    }
    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("[");

        Node<E> current = head;
       while(current!= null){
           sb.append(current.data);
           if (current != tail) {
               sb.append(", ");
           }
           current=current.next;
       }
       sb.append("]");
       return sb.toString();

    }

    public String toReverseString(){
        StringBuilder sb=new StringBuilder("[");

        Node<E> current = tail;

        while(current!=null) {
            sb.append(current.data);
            if (current != head) {
                sb.append(", ");
            }
            current = current.previous;
        }

        sb.append("]");
        return sb.toString();

        }

        public E removeFirst(){

        if(isEmpty()){
            throw new NoSuchElementException();
        }

        E result = head.data;
        head=head.next;
        size--;

        if(head==null){
            tail=null;
        }
        else{
            head.previous=null;
        }
        return result;

    }

    public E removeLast(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        E result = tail.data;

        tail=tail.previous;
        size--;

        if(tail==null){
            head=null;
        }
        else{
            tail.next=null;
        }

        return result;

    }

    //do I clear each element ?
    public void clear(){

        size=0;
        head = null;
        tail=null;
    }

    public boolean contains(Object o){
        Node<E> curr = head;

        while(curr!=null){
            if(Objects.equals(o, curr.data)){
                return true;
            }
            curr=curr.next;
        }
        return false;

    }

    public boolean add(E e){
       addLast(e);
       return true;
    }

    //3
    public boolean remove(Object o){

        if(isEmpty()){
            return false;
        }

        Node<E> curr = head;
        while(curr!=null){

            if(Objects.equals(curr.data,o)){
                if(curr==head && curr==tail){
                    head=null;
                    tail=null;
                }
                else if(curr==head){
                   head=head.next;
                   head.previous=null;
                }
                else if(curr==tail){
                    tail=tail.previous;
                    tail.next=null;
                }
                else{
                    curr.previous.next = curr.next;
                    curr.next.previous = curr.previous;
                }
                size--;
                return true;

            }
            curr=curr.next;
        }
        return false;

    }
    public int indexOf(Object o){
        int count=0;
        Node<E> curr = head;
        while(curr!=null){
            if(Objects.equals(curr.data,o)){
                return count;
            }
            count++;
            curr=curr.next;
        }
        return -1;
    }
    public int lastIndexOf(Object o){
        int count=size-1;
        Node<E> curr = tail;
        while(curr!=null){
            if(Objects.equals(curr.data,o)){
                return count;
            }
            count--;
            curr=curr.previous;
        }
        return -1;
    }

    public E get(int index){
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException();
        }

        Node<E> curr = head;
        int count =0;
        while(count!=index){
            curr=curr.next;
            count++;
        }
        return curr.data;

    }
    public E set(int index, E element){
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException();
        }
        Node<E> curr = head;
        int count =0;
        while(count!=index){
            curr=curr.next;
            count++;
        }
        E temp = curr.data;
        curr.data=element;
        return temp;

    }
    public void add(int index, E element) {
      if(index<0||index >size){
          throw new IndexOutOfBoundsException();
      }

      if(index==0){
          addFirst(element);
          return;
      }
      if(index==size){
          addLast(element);
          return;
      }

      Node<E> curr = head;

      for(int i =0;i<index-1;i++){
          curr=curr.next;
      }
      Node<E> newNode = new Node<>(element, curr, curr.next);

        if(curr.next!=null){
            curr.next.previous=newNode;
        }
        curr.next=newNode;


        size++;
    }
    public E remove(int index){
        if(index<0||index >=size){
            throw new IndexOutOfBoundsException();
        }

        if(index==0){
            return removeFirst();

        }
        if(index==size-1){
           return removeLast();

        }

        Node<E> curr = head;

        for(int i =0;i<index;i++){
            curr=curr.next;
        }

        E result = curr.data;

        curr.previous.next=curr.next;

        curr.next.previous=curr.previous;

        size--;

        return result;
    }


    @Override
    public Iterator<E> iterator() {
        return new DLLIterator();
    }
    private class DLLIterator implements Iterator<E> {
        private DoublyLinkedList.Node<E> current;

        public DLLIterator() {
            current = head;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

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

    //recursive methods
    public static int size(ListNode<?> head) {
        if(head==null){
            return 0;
        }
        return 1 + size(head.next);
    }

    public static String concat(ListNode<?> head) {
        if (head == null){
            return "";
        }
        return head.data + concat(head.next);
    }

    public static boolean contains(ListNode<?> head, Object o) {
        if(head==null){
            return false;
        }
        else{
            return Objects.equals(head.data,o) || contains(head.next,o);
        }
    }



}
