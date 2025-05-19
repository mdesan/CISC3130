package Homework.Hw8;

public class ListNode<E> {



    E data;
    ListNode<E> next; //this next points to the next node thats chained

    public ListNode(E data) {
        this(data, null);
    }


    public ListNode(E data, ListNode<E> next) {
        this.data = data;
        this.next = next;
    }
}
