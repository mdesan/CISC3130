package Lectures;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class StacksQueuesDequeue {

    /*
    #####Stack : LIFO last in first out#####

    Correct way to create a stack:
    Deque<String> stack = new LinkedList<>();

    int indexOfTop is size of stack -1;



    void push(E e){
    if(size()==elements.length
        elements=Arrays.copyOf(Elements, 2 * elements .length +1;
    }
    elements[++indexOfTop]=e;


    void pop(){
    if(size()==elements.length)
       throw new NoSuchElementException;
    }
   return  elements[indexOfTop--];

    APPLICATION OF STACK 1:
    delimiter matching: [] {} ()

    use a stack to see if a string of delimiters is valid

    3ways to return false:

    ------------------------------------------------------------------

    +*+3 7 18 / 2 4 = 180

    Evaluate postfix notation

    Evaluate prefix expression with two differences
    - reads right to left
    -

------------------------------------------------------

###QUEUES (FIFO)####
- a collection f elemenets that are awaiting processes(a temporary thing. not like a list that is used for long term storing)
add(e) adds e at end AKA enqueue()
peek() returns the front
remove() return e and removes the front AKA dequeue()

When implementing a queue using an array as the internal storage, it is not necessary to shift elements
-we want enqueue and dequeue to run in constant time. all queue operations run in constant time
-however we need a variable for the beginning of the queue and index of end of queue
indexOfFirst and indexOfLast initialized to -1 (we only care about whats in between indexoffirst and indexoflast

-so we change indexOfFirst after every dequeue
- we change indexOfLast after every enqueue
We call this a ring buffer because its like a circular array


How do we enqueue if the array is full?
if(isFull()){
    ensureCapacity(2 * capacity() +1);
}
    if(isEmpty()){
        indexOfFirst = indexOfLast = 0;
    }
    else{
        indexOfFirst = (indexOfLast + 1) % elements.length;
    }
    elements[indexOfLast] = element;

   Dequeue(){ //supposed to remove the first element AKA element[indexOfFirst]
    - so index of first goes up by 1

    if(indexOfFirst==indexOfLast){
        indexOfFirst = indexOfLast = -1;
    }
    else{
        indexOfFirst = (indexOfFirst+1)%elements.length;
    }
   }

   ensureCapacity(int desiredCapacity) {

    if(capacity() < desiredCapacity){
        E[] newArray = (E[]) new Object[desiredCapacity];

        for(int i =0;i<size();i++){
            newArray[i]=elements[(indexOfFirst + i)%elements]
        }
        elements=newArray;
        indexOfLast=size()-1;
        indexOfFirst=0;
    }

   }

   ToString method
    sb.append(elements[(indexOfFirst +i) % elements.length])







     */

    public static void main(String[] args){
        //sum of stack of Integers
        Deque<Integer> stack = new LinkedList<>();

        stack.push(3);
        stack.push(1);
        stack.push(5);

        Deque<Integer> aux = new LinkedList<>();

        int sum =0;
        while(!stack.isEmpty()){
            Integer element = stack.pop();
            sum+= element;
            aux.push(element);
        }
    }
    public static int sun (Queue<Integer> queue){
        int sum =0;

        for(int i =0;i< queue.size();i++){
            int element = queue.remove();
            sum+= element;
            queue.add(element);
        }
        return sum;
    }

    //remeber the size of the queue changes in the loop so i made a original size variable
    public static void removeAllOccurences(Queue<Integer> queue, int value){

        int originalSize= queue.size();

        for(int i =0;i< originalSize;i++){
            int element = queue.remove();

            if(value!=element){
                queue.add(element);
            }
        }
    }





}
