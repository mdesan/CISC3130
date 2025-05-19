package Study;

import java.util.ArrayList;

public class LinkedListLeetCode<E> {

    public class ListNode<E> {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {

    }

    //the problem is we are iterating from left to right not right to left
    public int binaryToDecimal(ListNode head) {

    int size=0;
    int sum=0;
    ListNode <E> curr=head;

    while(curr!=null){
        curr=curr.next;
        size++;
    }


    curr=head;
    for(int i =size-1;i>=0;i--){
        if(curr.val==1){
            sum+=Math.pow(2,i);
            size--;
        }
        curr=curr.next;
    }
    return sum;

    }

    public ListNode middleNode(ListNode head){

        int size =0;
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            size++;
        }
        curr = head;
        for(int i = 0;i<size/2;i++){
            curr=curr.next;
        }
        return curr;

    }



}
